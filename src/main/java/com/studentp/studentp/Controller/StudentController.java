package com.studentp.studentp.Controller;

import com.studentp.studentp.repository.StudentRepository;
import com.studentp.studentp.entity.Stidentification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.ArrayList;

@Controller
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping("/")
    public String showData(Model model) {
        List<Stidentification> studentList = new ArrayList<>();
        studentList = studentRepository.findAll();
        model.addAttribute("mList", studentList);
        return "index";
    }

}
