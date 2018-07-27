package com.sanyang.test;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sanyang.dao.LoginDao;
import com.sanyang.vo.LoginsInfo;

@Controller
public class Test {
	@Autowired
	private LoginDao dao;
	ModelAndView mv =new ModelAndView();
	@RequestMapping("/getAll")
	public ModelAndView getAll(LoginsInfo loginsInfo,HttpServletRequest request) throws Exception {
		try {
			
			LoginsInfo sel = dao.sel(loginsInfo);
			if (sel==null) {
				System.out.println("µ«¬Ω ß∞‹");
				mv.setViewName("login");
				return mv;
			}else{
				List<LoginsInfo> all = dao.getAll();
				request.setAttribute("all", all);
				mv.addObject("all", all);
				mv.setViewName("list");
				return mv;
			}
			
		} catch (Exception e) {
			throw new Exception(" ÷∂Ø≈‰÷√µƒ“Ï≥£");
		}
		
		
		
		
		
		
		
	}

}
