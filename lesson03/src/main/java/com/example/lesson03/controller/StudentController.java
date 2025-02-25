package com.example.lesson03.controller;

import com.example.lesson03.entity.Student;
import com.example.lesson03.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController  {
    @Autowired
    private StudentService studentService;
    @GetMapping("/student-list")
    public List<Student> getAllStudent(){
        return studentService.getStudents();
    }
    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable String id){
        Long idStudent = Long.parseLong(id);
        return studentService.getStudent(idStudent);
    }
    @PostMapping("/student-add")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @PutMapping("/student/{id}")
    public Student updateStudent(@PathVariable String id, @RequestBody Student student){
        Long idStudent = Long.parseLong(id);
        return studentService.updateStudent(idStudent, student);
    }
    @DeleteMapping("/{id}")
    public boolean deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }
}
