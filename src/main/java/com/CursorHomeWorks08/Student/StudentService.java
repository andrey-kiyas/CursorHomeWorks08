package com.CursorHomeWorks08.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Service
public class StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Iterable<Student> findStud() {
        return studentRepository.findAll();
    }

    public Student saveStud(Student student) {
        return studentRepository.save(student);
    }

    @PostConstruct
    void init() {
        Student student1 = new Student("Roman", 18, "Java coding");
        Student student2 = new Student("Stanislav", 20, "PhotoShop drawing");
        Student student3 = new Student("Michail", 17, "HTML layout");
        Student student4 = new Student("Svetlana", 21, "Java coding");
        studentRepository.saveAll(Arrays.asList(student1, student2, student3, student4));
    }
}
