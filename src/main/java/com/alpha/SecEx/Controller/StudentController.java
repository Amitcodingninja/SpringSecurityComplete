package com.alpha.SecEx.Controller;

import com.alpha.SecEx.Entity.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Amit", 24),
            new Student(2, "Aman", 15)
    ));

    @GetMapping
    public List<Student> getList() {
        return students;
    }

    // SO we will request for token
    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }
}