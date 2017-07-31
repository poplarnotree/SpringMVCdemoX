package org.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.ssm.until.User;

import javax.validation.Valid;

@Controller
public class UserController1 {
    @RequestMapping(value = "/register1",method = RequestMethod.POST)
    public String register(@Valid @ModelAttribute User user,
                        Errors errors,
                        Model model){
        System.out.println("调用UserController1中的register方法,user="+user);
        if(errors.hasErrors()){
            return "register";
        }
        model.addAttribute("user",user);
        return "welcome1";
    }
}
