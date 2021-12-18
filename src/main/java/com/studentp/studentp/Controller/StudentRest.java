// package com.studentp.studentp.Controller;

// import java.util.List;
// import java.util.Optional;

// import com.studentp.studentp.entity.Stidentification;
// import com.studentp.studentp.service.StudentService;

// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequestMapping("/student")
// public class StudentRest {
   
//     private final StudentService studentService;

//     public StudentRest(StudentService studentService) {
//         this.studentService = studentService;
//     }
//     public List<Stidentification> findAllStudents() {
//         return studentService.findAllStudents();
//     }
//     @GetMapping("/{id}")
//     public Optional<Stidentification> findStudentById(@PathVariable("stid") Integer stid) {
//         return studentService.findStudentById(stid);
//     }
//     @PostMapping
//     public Stidentification saveStudentById(@RequestBody Stidentification Stidentification) {
//         return studentService.saveStudentById(Stidentification);
//     }
//     @PutMapping
//     public Stidentification updateStudentById(@RequestBody Stidentification Stidentification) {
//         return studentService.updateStudentById(Stidentification);
//     }
//     @DeleteMapping
//     public void deleteStudentById(Integer stid) {
//         studentService.deleteStudentById(stid);
//     }
// }
