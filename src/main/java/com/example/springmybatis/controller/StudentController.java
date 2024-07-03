package com.example.springmybatis.controller;

import com.example.springmybatis.domain.Students;
import com.example.springmybatis.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students/count")
    public int countStudents() {
        return studentService.countStudent();
    }
    //students DB 전체 정보 출력  / students?id=1  or  / students
    @GetMapping("/students")
    public List<Students> getAllStudents(@RequestParam(required = false) Long id){
        return studentService.getStudents(id);
    }

    @PostMapping("/saveStudents") // POST JSON형태 {"name" : "이름", "age" : 20, "address" : "제주도"}

    public String addStudent(@RequestBody Students students) {
        // INSERT 로직 호출
        studentService.saveStudent(students);
        return "ok";
    }


}
