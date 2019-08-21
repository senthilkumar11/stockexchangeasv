package com.premium.stc.controller;

import org.springframework.ui.ModelMap;

import com.premium.stc.model.Login;

public interface LoginController {
	public String login(ModelMap model);
	public String loginconnect(Login login,ModelMap model);
	
}
