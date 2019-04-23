package com.nowcoder.wenda.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;


//@RestController
@Controller
public class IndexController {

        @RequestMapping(value = "hello",method = {RequestMethod.GET})
        public String hello() {
            return new Date() + " : 欢迎您!";
        }


        @RequestMapping(path = "/helloHtml")
        public String helloHtml(Map<String,Object> map) {
            map.put("hello","from TemplateController.helloHtml");
            return"/helloHtml";
    }
}
