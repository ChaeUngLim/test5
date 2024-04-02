package com.todaygit.minipjt.login.dto;

import java.time.LocalDate;

public class Member extends Login{
    private String identification;
    private String nickName;

    public Member() {
    }

    public Member(String name, LocalDate birth, String secreteNum, String phoneNum, String identification, String nickName) {
        super(name, birth, secreteNum, phoneNum);
        this.identification = identification;
        this.nickName = nickName;
    }

}
