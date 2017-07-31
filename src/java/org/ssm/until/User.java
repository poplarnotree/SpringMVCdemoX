package org.ssm.until;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    @NotBlank(message = "登录名不能为空")
    private String loginname;
    @NotBlank(message = "密码不能为空")
    @Length(min = 6,max = 8,message = "密码长度必须在6位到8位之间")
    private String password;
    @NotBlank(message = "真实姓名不能为空")
    private String username;
    @Range(min = 15,max = 60,message = "年龄必须在15到60岁之间")
    private Integer age;
    @Email(message = "必须是合法的邮箱地址")
    private String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past(message = "生日必须是一个过去的日期")
    private Date birthday;
    @Pattern(regexp = "[1][3,8][3,6,9][0-9]{8}",message = "无效的电话号码")
    private String phone;


    public User() {
    }

    public User(String loginname, String password, String username, Integer age, String email, Date birthday, String phone) {
        this.loginname = loginname;
        this.password = password;
        this.username = username;
        this.age = age;
        this.email = email;
        this.birthday = birthday;
        this.phone = phone;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
