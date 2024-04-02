package com.todaygit.minipjt.login.dto;

//import java.time.LocalDate;

public class Login {
    public String name;
    //private LocalDate birth;
    private String secreteNum;
    private String phoneNum;

    public String getName() {
        return name;
    }

    public String getSecreteNum() {
        return secreteNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public Login() {
    }

    public Login(String name /*LocalDate birth*/, String secreteNum, String phoneNum) {
        this.name = name;
        //this.birth = birth;
        this.secreteNum = secreteNum;
        this.phoneNum = phoneNum;
    }
}
