package com.haeun.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")	//���� �����ϸ� �⺻ url�� ��(/board/write.jsp)
public class TestController {
	
	//value���� ��ġ�ϴ� ���� ã�Ƽ� �޼ҵ� ����(��ûó�� �޼ҵ� ����)
	@RequestMapping(value = "/write")
	public String write(Model model) {	//model ��ü�� �Ķ���ͷ� ����
		
		model.addAttribute("id", "tiger");	//name, value
		return "write";
	}
	
	@RequestMapping("/reply")
	public ModelAndView reply() {
		
		ModelAndView mv = new ModelAndView();	//ModelAndView ��ü ����s
		mv.addObject("age", 30);				//Model ��ü�� �����͸� ����
		mv.setViewName("board/reply");	//view �̸� ����
		
		return mv;
	}
}
