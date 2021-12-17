package com.studentp.studentp.Controller;

import com.studentp.studentp.repository.StudentRepository;
import com.studentp.studentp.entity.Stidentification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    @Autowired
    private StudentRepository StudentRepository;

    @GetMapping("/")
    public String showData(Model model) {
        model.addAttribute("mList", StudentRepository.findAll());
        model.addAttribute("mList", new Stidentification());
        return "index";
    }

}
