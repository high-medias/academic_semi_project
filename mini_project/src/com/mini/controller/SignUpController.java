package com.mini.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;

public class SignUpController {
	
	LoginController lC = new LoginController();
	HashMap<String, String> members = null;
	
	public boolean checkId(String id) {
		return members.containsKey(id);
		
	}
	
	public boolean checkPwd(String pwd1, String pwd2) {
		
		// 1 : 패스워드 같음 ok,  0 : 패스워드가 다름 no
		return pwd1.equals(pwd2);
	}
	
	public void insertMember(String id, String pwd) {
		try {
			OutputStream out = new FileOutputStream("./src/member.txt", true);
			
			try {
				out.write(("\n" + id + " " + pwd).getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
