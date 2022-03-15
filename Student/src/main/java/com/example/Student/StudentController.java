package com.example.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RequestMapping("/students")
@RestController
public class StudentController {
    private List<Student> Students = Arrays.asList(
            new Student(1, "Achyuth"),
            new Student(2, "Kumar"));
    
    @GetMapping
    public List<Student> getAllStudents() {
        return Students;
    }
    
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return Students.stream()
                        .filter(Student -> Student.getId() == id)
                        .findFirst()
                        .orElseThrow(IllegalArgumentException::new);
    }
}