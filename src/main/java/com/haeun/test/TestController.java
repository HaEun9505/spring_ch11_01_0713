package com.haeun.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")	//위에 선언하면 기본 url이 됨(/board/write.jsp)
public class TestController {
	
	//value값과 일치하는 것을 찾아서 메소드 실행(요청처리 메소드 제작)
	@RequestMapping(value = "/write")
	public String write(Model model) {	//model 객체를 파라미터로 받음
		
		model.addAttribute("id", "tiger");	//name, value
		return "write";
	}
	
	@RequestMapping("/reply")
	public ModelAndView reply() {
		
		ModelAndView mv = new ModelAndView();	//ModelAndView 객체 생성s
		mv.addObject("age", 30);				//Model 객체에 데이터를 담음
		mv.setViewName("board/reply");	//view 이름 설정
		
		return mv;
	}
}