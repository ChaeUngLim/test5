package com.todaygit.minipjt.login.controller;

import com.todaygit.minipjt.login.db.MemberDB;
import com.todaygit.minipjt.login.dto.Member;
import com.todaygit.minipjt.login.dto.NonMember;

import java.util.Scanner;

public class JoinMembership {

    /***
     * 회원가입용 회원 추가
     * @param member
     */
    public void addMember(Member member){
        MemberDB memberDB = new MemberDB();

        memberDB.addMember(member);
        // db에 멤버 추가
    }

    /***
     * 회원가입용 비회원 추가
     * @param nonMember
     */
    public void addNonMember(NonMember nonMember){
        // db에 비회원 추가
        MemberDB memberDB = new MemberDB();
        memberDB.addNonMember(nonMember);
    }

    public int searchMember(String id){
        // 아이디가 일치하는 객체를 찾아 해당 인덱스를 리턴
        // 일치하는 아이디가 없는 경우 -1 리턴
        // MemberDB memberDB = new MemberDB();

        return;
    }



}
