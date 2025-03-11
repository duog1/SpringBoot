package com.example.lab_lesson06.controller;

import com.example.lab_lesson06.dto.StudentDTO;
import com.example.lab_lesson06.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // ✅ Import đúng Model của Spring
import org.springframework.web.bind.annotation.*;
import com.example.lab_lesson06.entity.Student;

@Controller
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public String getStudents(Model model) { // ✅ Đã sửa lỗi Model
        model.addAttribute("students", studentService.findAll());
        return "students/student-list";
    }
    @GetMapping("/add")
    public String addNewStudent(Model model){
        model.addAttribute("student", new Student());
        return "students/student-add";
    }
    @GetMapping("/edit/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Long id, Model model){
        StudentDTO student = studentService.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid student id: " +id));
        model.addAttribute("student", student);
        return "students/student-edit";
    }
    @PostMapping
    public String saveStudent(@ModelAttribute("student") StudentDTO student){
        studentService.save(student);
        return "redirect:/students";
    }
    @PostMapping("/update/{id}")
    public String updateStudent(@PathVariable(value = "id")Long id, @ModelAttribute("student") StudentDTO student){
        studentService.updateStudentById(id,student);
        return "redirect:/students";
    }
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable(value = "id") Long id){
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }
}
