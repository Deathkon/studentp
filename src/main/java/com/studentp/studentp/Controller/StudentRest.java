package com.studentp.studentp.Controller;

import java.util.List;
import java.util.Optional;

import com.studentp.studentp.entity.Stidentification;
import com.studentp.studentp.service.StudentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentRest {
   
    private final StudentService studentService;

    public StudentRest(StudentService studentService) {
        this.studentService = studentService;
    }
    public List<Stidentification> findAllStudents() {
        return studentService.findAllStudents();
    }
    @GetMapping("/{id}")
    public Optional<Stidentification> findStudentById(Integer id) {
        return studentService.findStudentById(id);
    }
    public Stidentification saveStudentById(Stidentification Stidentification) {
        return studentService.saveStudentById(Stidentification);
    }
    public Stidentification updateStudentById(Stidentification Stidentification) {
        return studentService.updateStudentById(Stidentification);
    }
    public void deleteStudentById(Integer id) {
        studentService.deleteStudentById(id);
    }
}
