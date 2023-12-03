package ru.pushkarev.MySpringBoot2Dbase.controller;

import ru.pushkarev.MySpringBoot2Dbase.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.pushkarev.MySpringBoot2Dbase.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> allStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable("id") int id){
        return studentService.getStudent(id);
    }

    @PostMapping ("/students")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return student;
    }

    @DeleteMapping("/students/{id}")
    public Student deleteStudent(@PathVariable("id") int id){
        return studentService.getStudent(id);
    }
}
