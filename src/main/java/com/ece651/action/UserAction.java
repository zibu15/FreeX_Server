package com.ece651.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;

import com.ece651.entity.User;
import com.ece651.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@Namespace("/user")
public class UserAction extends ActionSupport {
	
	private UserService userService;
	
	//set注入
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Action("login")
//  results = {
//	@Result(name = "success", type="chain", location = "exe"),
//	@Result(name = "error", location = "/index.jsp")
//}
	public String login(){
		 System.out.println("进入TestAction");
		 User user = new User();
		 user.setUid(5);
		 user.setUsername("jasmine111");
		 user.setPassword("awsedas");
//		 user.setEmail("12312312@hotmail.com");
		 user = userService.findbyNameAndPassword(user);
		 //System.out.println(user.getUid());
		return null;	
	}

}
