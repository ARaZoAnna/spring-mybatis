package com.example.springmybatis.repository;

import com.example.springmybatis.domain.Students;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {
    private final StudentMapper studentMapper;

    public StudentRepository(StudentMapper studentMapper) { //생성자 주입
        this.studentMapper = studentMapper;
    }

    //@Autowired private StudentMapper studentMapper; // 필드 주입

    public int countStudents(){
        return studentMapper.countStudents();
    }

    public List<Students> findStudents(Long id) {
        return studentMapper.findStudents(id);
    }

    public void saveStudent(Students students) {
        studentMapper.saveStudent(students);
    }
}
