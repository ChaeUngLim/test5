package com.todaygit.minipjt.login.db;

import com.todaygit.minipjt.login.dto.Member;
import com.todaygit.minipjt.login.dto.NonMember;

import java.util.ArrayList;

public class MemberDB {
    private ArrayList<Member> members = new ArrayList<>();  // 회원용 컬렉션 리스트 생성
    private ArrayList<NonMember> nonMembers = new ArrayList<>();  // 비회원용 컬렉션 리스트 생성
    // Member member = new Member();
    private int memCount;
    private int nonCount;

    public ArrayList<Member> getMembers() {
        return members;
    }

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

    public int searchMem(String id, String SecreteNum){
        int result = -1;
        for (int i = 0; i < memCount; i++) {
            if(this.members.get(i).getIdentification().equals(id)){ // 일치하는 아이디의 객체 위치를 출력
                if(this.members.get(i).getSecreteNum().equals(SecreteNum)){
                    result = i;
                    break;
                }
                //result = -10;   // 아이디는 일치 그러나 비밀번호 오류
            }
        }
        return result;   // 아이디 오류
    }



}
