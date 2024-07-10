package com.example.springtestingdemo.Controller;

import com.example.springtestingdemo.Model.ModelRegister;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
@Slf4j
public class ControllerModel {

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("modelRegister", new ModelRegister());
        return "home";
    }
    @PostMapping("/submit")
    public String processForm(@ModelAttribute("modelRegister") ModelRegister modelRegister, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {


            return "home";
        }
        System.out.println("Hello People");
        // Выводим данные из формы в консоль
        System.out.println("Name: " + modelRegister.getName());
        System.out.println("FIO: " + modelRegister.getSurname());
        System.out.println("FirstFio: " + modelRegister.getPatronymic());
        System.out.println("Age: " + modelRegister.getAge());
        System.out.println("Email: " + modelRegister.getEmail());
        return "redirect:/";
    }
}

