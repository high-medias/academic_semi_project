package com.mini.view;

import com.mini.dto.MemberDTO;

public class mainView {
	MemberDTO mem=null;
	private int flag;
	LoginView login = new LoginView();
	OliveMemberMenu oMenu = new OliveMemberMenu();
	
	public void mainViews() {
		
		//mem = login.loginMain();
		
		if(mem == null) {
			return;
		}
		
		ClearScreen.ClearConsole();
		
		do {
			flag = oMenu.OliveMainMenu(mem);
			
		}while(flag != 0);
		
	}
}
