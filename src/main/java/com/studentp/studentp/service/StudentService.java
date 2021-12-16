package com.studentp.studentp.service;
import java.util.List;

import com.studentp.studentp.entity.Stidentification;

public interface StudentService {
    List<Stidentification> findAllStudents();
    Stidentification findStudentById(Integer id);
    Stidentification saveStudentById(Stidentification Stidentification);
    Stidentification updateStudentById(Stidentification Stidentification);
    void deleteStudentById(Integer id);

}
