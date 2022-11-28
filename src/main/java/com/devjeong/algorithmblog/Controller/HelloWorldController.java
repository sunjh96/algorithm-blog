package com.devjeong.algorithmblog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@RestController
@Controller
public class HelloWorldController {

//    @GetMapping("/api/hello")
//    public String test() {
//        return "Hello, world!!";
//    }

    @GetMapping("/hi")
    public String tst() {
        return "/index.html";
    }
}