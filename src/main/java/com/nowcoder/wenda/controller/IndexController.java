package com.nowcoder.wenda.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;



@RestController
@Controller
public class IndexController {

    @RequestMapping(value = {"hello","/"})
    public String hello() {
        return new Date() + " : 欢迎您!";
    }

    @RequestMapping(value ="/profile/{groupID}/{userID}")
    public String profile(@PathVariable("userID") int userID,
                          @PathVariable("groupID") String groupID,
                          @RequestParam(value = "type",defaultValue = "1") int type,
                          @RequestParam(value = "key",defaultValue = "123",required = false) String key
    )
    {
        return String.format("Profile Page of %s %d,t:%d,k:%s",groupID,userID,type,key);
    }



}
