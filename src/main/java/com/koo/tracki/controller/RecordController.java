package com.koo.tracki.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.koo.tracki.db.FactorDto;
import com.koo.tracki.db.RecordDto;
import com.koo.tracki.service.FactorServiceImpl;
import com.koo.tracki.service.RecordServiceImpl;
import com.koo.tracki.service.StatisticServiceImpl;

@Controller
public class RecordController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private RecordDto testdto;

	@Autowired
	private RecordServiceImpl service;

	@Autowired
	private StatisticServiceImpl sttSvc;

	@Autowired
	private FactorServiceImpl factorService;

	@PostMapping(value = "/scoreDay")
	public String scoreDay(RecordDto dto, Model model, HttpServletRequest req) {
		HttpSession session = req.getSession();
		System.out.println("input score : " + dto);
		String uid = (String) session.getAttribute("uid");
		Date date = new Date();
		String rid = service.genRid(uid, date);

		if (!service.rcdExist(rid)) {
			System.out.println("will input");
			dto.setRid(rid);
			dto.setUid(uid);
			/*
			 * DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); String strDate =
			 * dateFormat.format(date);
			 */

			dto.setRdate(date);

			service.insertRecord(dto);
		} else {
			// tbd : 입력 데이터 삭제 처리

		}

		FactorDto fdto = factorService.getFactors(uid);
		model.addAttribute("factors", fdto);
		String nickname = (String) session.getAttribute("nick");
		model.addAttribute("nick", nickname);
		return "userMain";
	}

	@PostMapping(value = "/scoreFactors")
	public String scoreFactors(RecordDto dto, Model model, HttpServletRequest req) {
		HttpSession session = req.getSession();

		String uid = (String) session.getAttribute("uid");
		Date date = new Date();
		String rid = service.genRid(uid, date);
		dto.setRid(rid);
		dto.setUid(uid);
		/*
		 * DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); String strDate =
		 * dateFormat.format(date);
		 */
		dto.setRdate(date);

		if (!service.rcdExist(rid)) {
			System.out.println("will input");
			dto.setRid(rid);
			dto.setUid(uid);
			/*
			 * DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); String strDate =
			 * dateFormat.format(date);
			 */

			dto.setRdate(date);
			System.out.println("input score : " + dto);
			service.insertRecord(dto);
		}
		System.out.println("update record : " + dto);
		service.updateFactorRecord(dto);

		return "redirect:/sttResult";
	}

	@GetMapping(value = "/statisticSample")
	public String setFactorForm(Model model, HttpServletRequest req) {
		System.out.println("sample");

		sttSvc.test();
		return "statisticSample";
	}

	@GetMapping(value = "/sttProcess")
	public String statisticProcess(Model model, HttpServletRequest req) {
		System.out.println("Get data for statistic");
		HttpSession session = req.getSession();
		String uid = (String) session.getAttribute("uid");

		double[] factorcorrs = sttSvc.getCorrelation(sttSvc.collectRecord(uid));
		System.out.println("got corr : " + factorcorrs[0]);
		return "statisticSample";
	}

	@GetMapping(value = "/sttResult")
	public String statisticResult(Model model, HttpServletRequest req) {
		HttpSession session = req.getSession();
		String uid = (String) session.getAttribute("uid");
		FactorDto dto = factorService.getFactors(uid);
		System.out.println("get dto :" + dto);
		model.addAttribute("factors", dto);
		double[] factorcorrs = sttSvc.getCorrelation(sttSvc.collectRecord(uid));
		System.out.println("got corr : " + factorcorrs);
		model.addAttribute("corrs1", ": " + Math.abs(factorcorrs[0]) * 100 + "%");
		model.addAttribute("corrs2", ": " + Math.abs(factorcorrs[1]) * 100 + "%");
		model.addAttribute("corrs3", ": " + Math.abs(factorcorrs[2]) * 100 + "%");
		model.addAttribute("corrs4", ": " + Math.abs(factorcorrs[3]) * 100 + "%");

		return "statisticView";
	}

	@GetMapping(value = "/testInput")
	public void testDataInput() {
		System.out.println("dd");
		testdto.setMemo("memo");
		testdto.setUid("jisook");
		Calendar cal = Calendar.getInstance();
		for (int i = 0; i < 100; i++) {
			Random random = new Random();
			testdto.setScrMood(random.nextInt(100) % 5 + 1);
			testdto.setScrF1(random.nextInt(100) % 5 + 1);
			testdto.setScrF3(random.nextInt(100) % 5 + 1);
			testdto.setScrF2(random.nextInt(100) % 5 + 1);
			testdto.setScrF4(random.nextInt(100) % 5 + 1);
			cal.add(Calendar.DAY_OF_MONTH, 1);
			Date date = cal.getTime();
			testdto.setRdate(date);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			String formatStr = sdf.format(date);
			testdto.setRid("jisook_" + formatStr);
			service.insertRecord(testdto);
			service.updateFactorRecord(testdto);
		}

	}
}
