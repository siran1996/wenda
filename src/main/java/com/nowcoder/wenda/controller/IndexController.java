package com.nowcoder.wenda.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;



@RestController
@Controller
public class IndexController {

        @RequestMapping(value = "hello")
        public String hello() {
        return new Date() + " : 欢迎您!";
    }
}
