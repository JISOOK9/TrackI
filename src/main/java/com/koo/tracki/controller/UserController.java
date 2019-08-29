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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.koo.tracki.db.FactorDto;
import com.koo.tracki.db.UserDto;
import com.koo.tracki.service.FactorServiceImpl;
import com.koo.tracki.service.userRegServiceImpl;

/**
 * Handles requests for the application home page.
 */

@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private userRegServiceImpl userRegService;
	
	@Autowired
	private FactorServiceImpl factorService;
	
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
	public String main(HttpServletRequest req, Model model) {
		HttpSession session = req.getSession();
		String nickname = (String)session.getAttribute("nick");
		String uid = (String)session.getAttribute("uid");
		FactorDto fdto = factorService.getFactors(uid);
		model.addAttribute("nick", nickname);
		model.addAttribute("factors", fdto);
		System.out.println("usermain param : " + nickname);
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
		String nickname = userRegService.login(dto);
		if(nickname != null) {
			HttpSession session = req.getSession();
			String uid = dto.getUid();
			session.setAttribute("uid", uid);
			session.setAttribute("nick", nickname);
			FactorDto fdto = factorService.getFactors(uid);
			model.addAttribute("nick", nickname);
			model.addAttribute("factors", fdto);
			logger.info("Login success : " + nickname );
			return "userMain";
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
		userRegService.insertUser(dto);
		//tbd : switch page to sign in page
		return "main";
	}
	
	
	@RequestMapping(value = "/calendar", method = RequestMethod.GET)
	public String calendar(Model model) {
		logger.info("Open calendar page");
		return "calendar";
	}

	
}
