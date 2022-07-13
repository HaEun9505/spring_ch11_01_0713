
package com.haeun.test;

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
@Controller	//Controller에서 (RequestMapping)요청이 오면 잡아줌
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	// value(값)와 일치하는 것을 찾아서 메소드 실행
	@RequestMapping(value = "/helloworld", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		//현재시간을 serverTime이라는 이름으로 model 객체에 실어서 보여줌
		model.addAttribute("serverTime", formattedDate );
		
		return "helloworld";	//view의 이름 -> jsp 파일 이름
	}
	
}