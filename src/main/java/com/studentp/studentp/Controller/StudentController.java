package com.studentp.studentp.Controller;

import com.studentp.studentp.repository.StudentRepository;
import com.studentp.studentp.entity.Stidentification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.List;
import java.util.ArrayList;

@Controller
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    public List<Stidentification> showData() {
        List<Stidentification> studentList = new ArrayList<>();
        return studentList;
    }

}
