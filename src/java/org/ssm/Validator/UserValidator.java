package org.ssm.Validator;

import org.springframework.stereotype.Repository;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.ssm.until.User;


public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
//        return User.class.equals(aClass);
        return User.class.isAssignableFrom(aClass);
    }

    //通过Validator接口来验证属性是否空值
    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"loginname",null,"登录账号不能为空");
        ValidationUtils.rejectIfEmpty(errors,"password",null,"密码不能为空");
        User user = (User)o;
        if(user.getLoginname().length()>10){
            errors.rejectValue("loginname",null,"用户名不能超过10个字符");
        }
        if(user.getPassword()!=null&&!user.getPassword().equals("")&&user.getPassword().length()<6){
            errors.rejectValue("password",null,"密码不能小于6位");
        }
    }
}
