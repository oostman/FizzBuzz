package org.fizzbuzz.rest.controller;

import org.fizzbuzz.domain.FizzBuzzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FizzBuzzController {

    @Autowired
    FizzBuzzService fizzBuzzService;

    @RequestMapping("/api/play")
    public @ResponseBody String play(@RequestParam(value = "number", required = true) String number) {
        return fizzBuzzService.generateReply(number);
    }
}
