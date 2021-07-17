package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("message", "本日の体重を入力して下さい");
        return "index";
    }
    
    @GetMapping("weightRecord")
    public String confirm(@RequestParam(name = "weight") String str,
    Model model){
    	model.addAttribute("userWeight", str);
    	return "confirm";
    }
}