package com.sanyang.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.sanyang.vo.LoginsInfo;

public class InvInterceptor extends HandlerInterceptorAdapter{
	
	public boolean pre(HttpServletRequest request,HttpServletResponse response,Object tset) {
		try {
			HttpSession session = request.getSession();
			LoginsInfo ls = (LoginsInfo) session.getAttribute("all");
			if (ls==null) {
				String requestURI = request.getRequestURI();
				if (requestURI.indexOf("getAll")>0) {
//					����
					return super.preHandle(request, response, tset);
					
				} else {
					//������ת����¼ҳ��
					//��ת����¼ҳ��
					response.sendRedirect("login.jsp");
				}
			} else {
				return super.preHandle(request, response, tset);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		return false;
		
	}

}
