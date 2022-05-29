package it.develhope.FirstApiexrcise03.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/strings")
public class StringController {

    @GetMapping(value = "")
    public String getConcatStrings(@RequestParam String firstString,@RequestParam(required = false) String secondString){
        return secondString != null ? firstString + secondString :firstString;
    }
}
