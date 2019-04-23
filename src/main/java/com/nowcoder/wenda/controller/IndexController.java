package com.nowcoder.wenda.controller;
import com.nowcoder.wenda.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;


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

    @RequestMapping(path = "/helloModel")
    public String helloModel(Model model) {
        model.addAttribute("value1","vvv1");

        List<String> colors= Arrays.asList(new String[]{"RED","GREEN","BLUE"});
        model.addAttribute("colors",colors);

        Map<String,String> map =new HashMap<>();
        for(int i=0;i<4;i++)
        {
            map.put(String.valueOf(i),String.valueOf(i*i));
        }
        model.addAttribute("map",map);

        model.addAttribute("user",new User("Siran"));

        return"/helloModel";

    }
}
