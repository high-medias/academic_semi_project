package com.mini.run;

import java.util.ArrayList;
import static com.mini.common.Template.*;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;

import com.mini.dto.MemberDTO;
import com.mini.dto.ProductDTO;
import com.mini.dto.CustomerDTO;

import com.mini.view.OliveCustomerMenu;
import com.mini.view.OliveMemberMenu;
import com.mini.view.SignUpView;
import com.mini.view.mainView;

public class Application {
	public static void main(String[] args) {
		
		mainView mv = new mainView();
		mv.mainViews();		

	}
}
