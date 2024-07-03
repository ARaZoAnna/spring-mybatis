package com.example.springmybatis.repository;

import com.example.springmybatis.domain.Students;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentMapper {
    int countStudents();

    List<Students> findStudents(@Param("id") Long id); //select * from students where  id = #{id};

    void saveStudent(Students students);
}
