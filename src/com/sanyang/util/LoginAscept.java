package com.sanyang.util;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoginAscept {
	@Before("execution(* com.sanyang.dao.LoginDaoimpl.sel(..))")
	public void before() {
		System.out.println("请求方法前对方法进行拦截！~~~");
		
		
	}
	@AfterReturning(value="execution (* com.sanyang.dao.**.*(..))",returning="result")
	public void afterrunning(Joinpoint jp,Object result) {
		System.out.println("return"+result);
	}
	
}
