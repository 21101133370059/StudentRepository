package com.SpringBoot.MyString.serviceImpl;

import com.SpringBoot.MyString.entity.Students;
import com.SpringBoot.MyString.repository.StudentsRepository;
import com.SpringBoot.MyString.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
@NoArgsConstructor
public class StudentServiceImpl implements StudentService {
    private StudentsRepository studentsRepository;
    @Override
    public Students createStudent(Students students) {
        return studentsRepository.save(students);
    }

    @Override
    public Students getStudentById(Long studentId) {
        Optional<Students> optionalStudents=studentsRepository.findById(studentId);
        return optionalStudents.get();
    }

    @Override
    public List<Students> getAllStudents() {
        return studentsRepository.findAll();
    }

    @Override
    public Students updateStudent(Students students) {
        Students existingStudent=studentsRepository.findById(students.getId()).get();
        existingStudent.setStudentName(students.getStudentName());
        existingStudent.setStudentEmail(students.getStudentEmail());
        Students updatedStudent=studentsRepository.save(students);
        return updatedStudent;
    }

    @Override
    public void deleteStudent(Long studentId) {

    }
}
