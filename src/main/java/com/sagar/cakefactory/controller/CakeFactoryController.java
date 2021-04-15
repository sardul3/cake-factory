package com.sagar.cakefactory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import java.util.HashMap;
import java.util.Map;

@Controller
public class CakeFactoryController {

    @GetMapping("/")
    public ModelAndView showHomepage() {
        Map<String, String> model = new HashMap<>();
        return new ModelAndView("homepage", model);
    }
}
