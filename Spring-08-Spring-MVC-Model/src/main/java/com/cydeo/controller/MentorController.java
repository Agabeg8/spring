package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {

    @RequestMapping("/list")
    public String showTable(Model model){

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Mike", "Demon", 45, Gender.Male));
        mentorList.add(new Mentor("Clara", "Kool", 45, Gender.Female));
        mentorList.add(new Mentor("John", "Brand", 45, Gender.Male));
        model.addAttribute("mentor", mentorList);

        return "/mentor/mentor-list";

    }

}
