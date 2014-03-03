package org.fizzbuzz.rest.controller;

import org.fizzbuzz.domain.FizzBuzzService;
import org.fizzbuzz.dto.FizzBuzzResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FizzBuzzController {

    @Autowired
    FizzBuzzService fizzBuzzService;

    @RequestMapping("/api/play")
    public @ResponseBody FizzBuzzResponse playSingleSimpleNumber(@RequestParam(value = "numbers", required = true) List<String> numbers) {
        return fizzBuzzService.generateReply(numbers);
    }

    @RequestMapping("/api/play/{numbers}")
    public @ResponseBody FizzBuzzResponse playSeveralSimpleNumber(@PathVariable List<String> numbers) {
        return fizzBuzzService.generateReply(numbers);
    }
}
