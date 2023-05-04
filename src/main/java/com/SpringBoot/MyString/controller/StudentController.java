package com.SpringBoot.MyString.controller;

import com.SpringBoot.MyString.entity.Students;
import com.SpringBoot.MyString.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private StudentService studentService;

    //build create student
    @PostMapping
    public ResponseEntity<Students> createStudent(@RequestBody Students students){
        Students mystudent=studentService.createStudent(students);
        return new ResponseEntity<>(mystudent, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<Students> getStudentById(@PathVariable("id") Long studentId){
        Students mystudent1=studentService.getStudentById(studentId);
        return new ResponseEntity<>(mystudent1,HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Students>> getAllStudents(){
        List<Students> mystudent2=studentService.getAllStudents();
        return new ResponseEntity<>(mystudent2,HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Students> updateStudent(@RequestBody Students students, @PathVariable("id") Long studentId){
        students.setId(studentId);
        Students mystudent3=studentService.updateStudent(students);
        return new ResponseEntity<>(mystudent3,HttpStatus.OK);
    }
    @DeleteMapping
    public ResponseEntity<String> deleteStudent(@PathVariable("id") Long studentId){
        studentService.deleteStudent(studentId);
        return new ResponseEntity<>("Student deleted", HttpStatus.OK);
    }
}
