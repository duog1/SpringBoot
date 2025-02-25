package com.example.lesson03.service;

import com.example.lesson03.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Service class: StudentService
 * <p>Lop dich vu</p>
 * @author DucDuong
 * @version 1.0
 */
@Service
public class StudentService {
    //mock data
    List<Student> students = new ArrayList<Student>();
    public StudentService(){
        students.addAll(
            Arrays.asList(
                    new Student(1L, "Dev Master", 20, "None", "25 Vu ngoc Phan", "0978611889", "duong39991@gmail.com"),
                    new Student(2L, "Dev Master-2.0", 18, "None", "25 Vu ngoc Phan", "0123123123", "duong31@gmail.com")
            )
        );
    }

    public List<Student> getStudents() {
        return students;
    }
    public Student getStudent(Long id){
        return students.stream().filter(student -> student.getId() == id).findFirst().orElse(null);
    }
    public Student addStudent(Student student){
        students.add(student);
        return student;
    }
    public Student updateStudent(Long id, Student student){
        Student check = getStudent(id);
        if(check == null){
            return student;
        }
        students.forEach(item->{
            if (item.getId() == id){
                item.setName(student.getName());
                item.setAddress(student.getAddress());
                item.setAge(student.getAge()); // Truyền giá trị tuổi hợp lệ
                item.setPhone(student.getPhone());
                item.setEmail(student.getEmail());

            }
        });
        return getStudent(id);
    }
    public boolean deleteStudent(Long id) {
        return students.removeIf(student -> student.getId().equals(id));
    }

}
