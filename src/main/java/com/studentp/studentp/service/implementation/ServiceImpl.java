// package com.studentp.studentp.service.implementation;

// import java.util.List;
// import java.util.Optional;

// import com.studentp.studentp.entity.Stidentification;
// import com.studentp.studentp.repository.StudentRepository;
// import com.studentp.studentp.service.StudentService;

// import org.springframework.stereotype.Service;

// @Service
// public class ServiceImpl implements StudentService {

// private final StudentRepository studentRepository;

// public ServiceImpl(StudentRepository studentRepository) {
// this.studentRepository = studentRepository;
// }
// @Override
// public List<Stidentification> findAllStudents() {
// return studentRepository.findAll();
// }

// @Override
// public Optional<Stidentification> findStudentById(Integer stid) {
// return studentRepository.findById(stid);
// }

// @Override
// public Stidentification saveStudentById(Stidentification Stidentification) {
// return studentRepository.save(Stidentification);
// }

// @Override
// public Stidentification updateStudentById(Stidentification Stidentification)
// {
// return studentRepository.save(Stidentification);
// }

// @Override
// public void deleteStudentById(Integer id) {
// studentRepository.deleteById(id);

// }

// }
