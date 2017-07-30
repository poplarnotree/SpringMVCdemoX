package org.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.ssm.until.Format;

@Controller
public class FormatController {
    @RequestMapping (value = "/test",method = RequestMethod.POST)
    public String test(@ModelAttribute Format format, Model model){
        System.out.println("调用FormController中的tset方法");
        System.out.println("format="+format);
        model.addAttribute("format",format);
        return "success";
    }

}
