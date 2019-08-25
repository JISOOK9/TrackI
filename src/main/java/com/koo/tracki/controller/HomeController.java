package com.koo.tracki.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.koo.tracki.db.UserDto;
import com.koo.tracki.service.userRegServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private userRegServiceImpl service;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "main";
	}
	
	@RequestMapping(value = "/userMain", method = RequestMethod.GET)
	public String main(@RequestParam("loginnick") String loginnick, Model model) {
		model.addAttribute("nick", loginnick );
		
		return "userMain";
	}
	
	@RequestMapping(value = "/loginform", method = RequestMethod.GET)
	public String loginForm(Model model) {
		logger.info("Move to Login Form Page");
		
		return "loginform";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute UserDto dto, Model model, HttpServletRequest req) {
		logger.info("Move to Login Form Page");
		String nickname = service.login(dto);
		if(nickname != null) {
			HttpSession session = req.getSession();
			session.setAttribute("uid", dto.getUid());
			model.addAttribute("loginnick", nickname);
			logger.info("Login success : " + nickname );
			return "redirect:/userMain";
		}
			
		else {
			logger.info("Login failed");
			return "redirect:/loginform";
		}
			
	}
	
	@RequestMapping(value = "/userRegForm", method = RequestMethod.GET)
	public String userRegForm(Model model) {
		logger.info("Move to Login Form Page");
		
		return "userRegForm";
	}
	
	@RequestMapping(value = "/userReg", method = RequestMethod.POST)
	public String userReg(UserDto dto, Model model) {
		logger.info("Register new member");
		System.out.println(dto);
		service.insertUser(dto);
		return "redirect:/loginform";
	}
	
}
