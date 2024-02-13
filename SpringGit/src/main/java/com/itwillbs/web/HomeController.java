package com.itwillbs.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
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
		
		return "home";
	}
	
	
	@RequestMapping(value = "/test",method = RequestMethod.GET)
	public void Test() {
		logger.debug(" Test() 호출 !! ");
		
		logger.debug(" 1. 서비스 객체 생성 ");
		
		logger.debug(" 2. DAO 객체 생성 ");
		
		logger.debug(" 3. mapper 호출 ");
		
	}
	
	// 집에서 작업한 내용 	
	@RequestMapping(value = "/test2",method = RequestMethod.GET)
	public void Test2() {
		logger.debug(" Test2() 호출 !! ");
		
		logger.debug(" 1. 서비스 객체 생성 ");
		
		logger.debug(" 2. DAO 객체 생성 ");
		
		logger.debug(" 3. mapper 호출 ");
		
	}
	
	@RequestMapping(value = "/test3",method = RequestMethod.GET)
	public void Test3() {
		logger.debug(" Test3() 호출 !! ");
		
		logger.debug(" 1. 서비스 객체 생성 ");
		
		logger.debug(" 2. DAO 객체 생성 ");
		
		logger.debug(" 3. mapper 호출 ");
		
		logger.debug(" 4. Test 실행 ");
		
	}
	
	
	
	
	
	
	
	
}
