package com.todaygit.minipjt.login.db;

import com.todaygit.minipjt.login.dto.Member;
import com.todaygit.minipjt.login.dto.NonMember;

import java.util.ArrayList;

public class MemberDB {
    private ArrayList<Member> members = new ArrayList<>();  // 회원용 컬렉션 리스트 생성
    private ArrayList<NonMember> nonMembers = new ArrayList<>();  // 비회원용 컬렉션 리스트 생성

    private int memCount;
    private int nonCount;

    /***
     * DB에 회원가입시 회원 정보를 담는(추가하는) 콜렉션
     * @param members
     */
    public void addMember (Member members){
        this.members.add(members);
        this.memCount++;
    }

    /***
     * DB에 회원가입시 비회원 정보를 담는(추가하는) 콜렉션
     * @param nonMembers
     */
    public void addNonMember(NonMember nonMembers){
        this.nonMembers.add(nonMembers);
        this.nonCount++;
    }



}
