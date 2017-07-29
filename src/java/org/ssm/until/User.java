package org.ssm.until;

import java.io.Serializable;

public class User implements Serializable {
    private String loginname;
    private String password;
    private String username;
    private Integer age;

    public User() {
    }

    public User(String loginname, String password, String username, Integer age) {
        this.loginname = loginname;
        this.password = password;
        this.username = username;
        this.age = age;
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
}
