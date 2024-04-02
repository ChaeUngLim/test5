package com.todaygit.minipjt.login.view;

import com.todaygit.minipjt.login.controller.JoinMembership;
import com.todaygit.minipjt.login.db.MemberDB;
import com.todaygit.minipjt.login.dto.Member;

import java.util.Scanner;

public class LoginMenu {
    public void meun(){
        Scanner sc = new Scanner(System.in);
        JoinMembership joinMembership = new JoinMembership();
        // 초기화면 창
        System.out.println("""
                ========================================
                안녕하세요 스타벅스입니다.
                회원가입을 원하시면 1번을 입력하시고
                로그인을 원하시면 2번을 입력해주세요.
                ========================================
                """);

        // do - while로 다시 묶어서 반복 처리를 할 것인지
        System.out.print("숫자를 입력해주세요 : ");
        int select = sc.nextInt();      // 회원 비회원을 선택하기 위한 변수
        sc.nextLine();

        if(select == 1){
            System.out.println("""
                    =====================================
                    회원으로 가입을 원하시면 1번
                    비회원으로 가입을 원하시면 2번
                    을 입력해 주세요.
                    =====================================
                    """);
            System.out.print("숫자를 입력해주세요 : ");
            int mem_nonmem = sc.nextInt();
            if(mem_nonmem==1){
                System.out.print("이름 : ");
                String name = sc.nextLine();


                Member member = new Member(name, age, );
                joinMembership.addMember(member);
            }else if(mem_nonmem == 2){

            }else{
                System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력해 주세요.");
            }
            // 여기에서는 회원가입 호출


        }else if(select == 2){
            // 여기에서는 로그인 호출
            System.out.print("아이디 : ");
            String id = sc.nextLine();
            System.out.print("비밀번호 : ");


        }else{
            System.out.println("숫자를 잘못 입력하셨습니다. 1번과 2번중 다시 입력해 주세요.");
        }
    }
}
