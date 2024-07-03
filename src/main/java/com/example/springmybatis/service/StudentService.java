package com.example.springmybatis.service;

import com.example.springmybatis.domain.Students;
import com.example.springmybatis.repository.StudentMapper;
import com.example.springmybatis.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public int countStudent(){
        return studentRepository.countStudents();
    }

    public List<Students> getStudents(Long id){
        return studentRepository.findStudents(id);
    }

    public void saveStudent(Students students) {
        studentRepository.saveStudent(students);
    }
}
