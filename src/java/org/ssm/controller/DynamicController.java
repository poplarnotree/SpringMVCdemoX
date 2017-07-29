package org.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ssm.until.User;

@Controller
public class DynamicController {

    @RequestMapping(value = "/{nynamicName}")
    public String dynamic(@PathVariable String nynamicName, Model model){
        User user = new User();
        model.addAttribute("user",user);
        System.out.println("动态跳转页面，调用dynamic方法");
        return nynamicName;
    }
}
