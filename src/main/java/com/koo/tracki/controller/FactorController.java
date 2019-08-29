package com.koo.tracki.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
		String loggedinNick = (String)session.getAttribute("nick");
		dto.setUid(loggedinUser);
		System.out.println(loggedinNick);
		factorService.addFactors(dto);
		logger.info("Add factors on db" + loggedinUser);
		model.addAttribute("nick", loggedinNick);
		model.addAttribute("factors", dto);
		return "redirect:/userMain";
	}
	
	@GetMapping(value = "/scoreFactorsForm")
	public String scoreFactorsForm(Model model, HttpServletRequest req) {
		HttpSession session = req.getSession();
		String loggedinUser = (String)session.getAttribute("uid");
		System.out.println(loggedinUser);
		FactorDto dto = factorService.getFactors(loggedinUser);
		System.out.println("get dto :" + dto);
		model.addAttribute("factors", dto);
		return "scoreFactorsForm";
	}
	
	@GetMapping(value = "/setFactorForm")
	public String setFactorForm(Model model, HttpServletRequest req) {
		HttpSession session = req.getSession();
		String loggedinUser = (String)session.getAttribute("uid");
		System.out.println(loggedinUser);
		FactorDto dto = factorService.getFactors(loggedinUser);
		System.out.println("get dto :" + dto);
		model.addAttribute("factors", dto);
		return "factorSetForm";
	}
}
