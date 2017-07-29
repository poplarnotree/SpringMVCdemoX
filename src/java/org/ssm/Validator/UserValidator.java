package org.ssm.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.ssm.until.User;

public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    //通过Validator接口来验证属性是否空值
    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"loginname",null,"登录账号不能为空");
        ValidationUtils.rejectIfEmpty(errors,"password",null,"密码不能为空");
    }
}
