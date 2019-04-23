package com.nowcoder.wenda.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;


//@RestController
@Controller
public class IndexController {

    @RequestMapping(value = "hello",method = {RequestMethod.GET})
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


    @RequestMapping(path = "/helloHtml")
    public String helloHtml(Map<String,Object> map) {
        map.put("hello","from TemplateController.helloHtml");
        return"/helloHtml";
    }
}
