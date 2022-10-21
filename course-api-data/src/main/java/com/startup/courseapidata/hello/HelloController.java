package com.example.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Restcontroller means that you can have methods here that maps to url requests.
// When user makes request to that url you can make these methods below work
@RestController
public class HelloController {

    // When we go to url localhost:8080/hello, sayHi function will work
    @RequestMapping(path = "/hello") // GET method
    public String sayHi(){
        return "Hi";
    }
    // @RequestMapping maps only to the GET method by default.To map to other HTTP methods,
    // we`ll have to specify it in the annotation.
}
