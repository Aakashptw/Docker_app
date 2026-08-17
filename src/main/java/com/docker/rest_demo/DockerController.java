package com.docker.rest_demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @RequestMapping("/")
    public String justGreet() {
        return "Hello World!!";
    }
}
