package com.example.springbootwebproject.parentController;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springbootwebproject.entities.DataGenerator;
import com.example.springbootwebproject.entities.ParentData;

@SuppressWarnings("hiding")
@Controller
public class ParentController<ParentData> {

    @GetMapping("/")
    public String index(Model model) {
        List<com.example.springbootwebproject.entities.ParentData> testData = DataGenerator.generateTestData(10);
        model.addAttribute("parents", testData);
        return "index"; // This will be the name of your HTML template file
    }
}
