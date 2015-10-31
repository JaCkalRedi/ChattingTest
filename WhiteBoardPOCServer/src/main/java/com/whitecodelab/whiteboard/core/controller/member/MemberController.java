package com.whitecodelab.whiteboard.core.controller.member;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.whitecodelab.whiteboard.common.base.BaseController;
import com.whitecodelab.whiteboard.common.exception.APIException;
import com.whitecodelab.whiteboard.core.model.service.member.MemberService;

/**
 * 
 * @author KimHanKyul
 *
 */
@Controller
public class MemberController extends BaseController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) throws APIException {

		ModelAndView modelAndView = new ModelAndView("jsonView");
		
		try {
			//TO-DO : Id, Pass 유효성 체크 후 성공일경우 세션키 취득
			modelAndView.addObject("", memberService.memberCheck());
		} catch(Exception e) {
			modelAndView.addObject("", null);
		}
		return modelAndView;
	}
}
