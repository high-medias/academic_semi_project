package com.mini.view;

import java.util.HashMap;
import java.util.Scanner;

import com.mini.controller.LoginController;
import com.mini.dto.MemberDTO;

public class LoginView {
	
	MemberDTO mem;
	LoginController lC = new LoginController();
	Scanner sc = new Scanner(System.in);
	
	SignUpView suV = new SignUpView();

	
	public MemberDTO loginMain() {
		int num;
		
		do{
			System.out.println(" ====== 로그인 화면 메뉴 ======");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("0. 프로그램 종료");
			System.out.println(" ============================ \n");
			
			System.out.print("메뉴를 입력하세요 : ");
			num = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(num) {
			case 1:
				ClearScreen.ClearConsole();
				System.out.println(" ===================== ");
				System.out.println(" ****    회원가입   ****");
				System.out.println(" ===================== ");
				System.out.println();
				
				ClearScreen.ClearConsole();
				suV.singUpMainView();
				/*
				 * 회원가입 View 출력
				 * 회원가입 View가 실행되고  정상 생성 후
				 * 텍스트로 회원 정보 모아 놓고 진행 합시다
				 * 텍스트 파일 == DB
				 */
				break;
				
				
			case 2:
				ClearScreen.ClearConsole();
				HashMap<String, String> members = lC.memberInquiry();
				
				int count = 0;
				
				for(int i = 0; i < members.size(); ) {
					
					System.out.println(" ===================== ");
					System.out.println(" ****    로 그 인   ****");
					System.out.println(" ===================== ");
					System.out.println();
					
					System.out.println();
					System.out.println(" ================== ");
					System.out.println("아이디를 입력하세요 : ");
					String id = sc.nextLine();
					System.out.println();
					
					System.out.println(" ================== ");
					System.out.println("비밀번호를 입력하세요 : ");
					String pwd = sc.nextLine();
					System.out.println();
					
					if(members.containsKey(id)) {
						
						if(!members.get(id).equals(pwd)) {
							System.out.println("  ============================= ");
							System.out.println("**    비밀번호가 틀렸습니다.    **");
							System.out.println("**       다시 입력하세요.      **");
							
						} else {
							System.out.println("  ===================== ");
							System.out.println("** 로그인에 성공했습니다. **");
							System.out.println("  ===================== ");
							System.out.println();
							
							// mem = new MemberDTO( members.get(id) , "test", 35);
							
							break;
						}
						
					} else {
						System.out.println("  ============================= ");
						System.out.println("**  등록되지 않은 아이디입니다.  **");
						System.out.println("**       다시 입력하세요.      **");
						
					} if(count < 3) {
							count++;
							System.out.println("**  로그인에 " + count + "번 실패하였습니다.  **");
							System.out.println("  ============================= ");
						
						} else {
							
							System.out.println("** 로그인에 횟수를 초과하였습니다. **");
							System.out.println("**     프로그램을 종료합니다.    **");
							System.out.println("  ============================= ");
							
							mem = null;
							break;
						}
				}
				break;

			case 0:
				ClearScreen.ClearConsole();
				System.out.println(" ================ ");
				System.out.println("프로그램을 종료합니다.");
				System.out.println(" ================ ");
				System.out.println();
				
				mem = null;
				break;
			}
		}while(num != 0 && num != 2);
		
		return mem;
	}
}
