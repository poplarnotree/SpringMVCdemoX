package org.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.ssm.Validator.UserValidator;
import org.ssm.converter.DateEditor;
import org.ssm.until.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    //静态List<User>集合，代替数据库用来保存用户信息
    private static List<User> userList;

    @InitBinder
    public void initBinder(DataBinder binder, WebDataBinder binder1){
        //设置验证的类为UserValidator
        binder.setValidator(new UserValidator());
        binder.registerCustomEditor(Date.class, new DateEditor());
    }

    //注册判断，如果errors中有错，则返回注册页面重新注册，否则正常提交
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(@Validated User user, Errors errors){

        if(errors.hasFieldErrors()) {
            System.out.println(user.getLoginname());
            return "register";
        }
        System.out.println("loginname="+user.getLoginname()+",password="+user.getPassword());
        userList = new ArrayList<User>();
        userList.add(user);
        return "login";
    }

    //登录操作
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@Validated User user, Errors errors, Model model){
        if(errors.hasFieldErrors()) {
            System.out.println(user.getLoginname());
            return "login";
        }
        if(userList==null){
            return "register";
        }
        for(User u : userList){
            if(u.getLoginname().equals(user.getLoginname())
                    &&u.getPassword().equals(user.getPassword())){
                System.out.println("用户输入的loginname="+user.getLoginname()+",password="+user.getPassword());
                System.out.println("数据库中的loginname="+u.getLoginname()+",password="+u.getPassword());
                model.addAttribute("user",u);
                return "success";
            }
        }
        return "login";
    }

}
