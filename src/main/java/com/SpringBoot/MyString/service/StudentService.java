package com.SpringBoot.MyString.service;

import com.SpringBoot.MyString.entity.Students;

import java.util.List;

public interface StudentService {
    Students createStudent(Students students);
    Students getStudentById(Long studentId);
    List<Students> getAllStudents();
    Students updateStudent(Students students);
    void deleteStudent(Long studentId);
}
