package com.CursorHomeWorks08.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/Students")
@RestController
public class StudentController {

    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public Iterable<Student> findStudents() {
        return studentService.findStud();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStud(student);
    }
}
