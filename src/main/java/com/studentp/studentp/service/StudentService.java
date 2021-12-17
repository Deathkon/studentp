package com.studentp.studentp.service;

import java.util.List;
import java.util.Optional;

import com.studentp.studentp.entity.Stidentification;

public interface StudentService {
    List<Stidentification> findAllStudents();

    Optional<Stidentification> findStudentById(Integer stid);

    Stidentification saveStudentById(Stidentification Stidentification);

    Stidentification updateStudentById(Stidentification Stidentification);

    void deleteStudentById(Integer stid);

}
