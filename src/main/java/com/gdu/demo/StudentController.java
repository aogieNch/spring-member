package com.gdu.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/student")
public class StudentController {
    @GetMapping
    public String getStudent() {
        Student student = new Student(
                "2104110066",

        );
        return "Hello Student";
    }
}
