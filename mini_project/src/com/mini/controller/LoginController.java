package com.mini.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class LoginController {

	public HashMap<String, String> memberInquiry() {
		
		HashMap<String, String> members = new HashMap<>();

		File file = new File("./src/member.txt");
		
		try {
		   BufferedReader br = new BufferedReader(new FileReader(file));
		   String [] str = br.readLine().split("\\s",0);
		   
		   while(str != null) {
			   members.put(str[0], str[1]);
			   str = br.readLine().split("\\s");
		   }
		   
		   br.close();
		   } catch (NullPointerException e){ 
	           e.getStackTrace();
	       } catch (FileNotFoundException e){ 
	           e.getStackTrace();
	       } catch (IOException e){ 
	           e.getStackTrace();
	       }
		
	   	return members;
	}
	
}
