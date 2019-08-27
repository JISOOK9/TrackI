package com.koo.tracki.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.koo.tracki.db.FactorDto;
import com.koo.tracki.service.FactorServiceImpl;

@Controller
public class FactorController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private FactorServiceImpl factorService;
	
	@PostMapping(value = "/addFactors")
	public String addUserFactors(@ModelAttribute FactorDto dto, Model model, HttpServletRequest req) {
		
		
		HttpSession session = req.getSession();
		String loggedinUser = (String)session.getAttribute("uid");
		dto.setUid(loggedinUser);
		System.out.println(dto);
		factorService.addFactors(dto);
		logger.info("Add factors on db" + loggedinUser);
		return "calendar";
	}
}
