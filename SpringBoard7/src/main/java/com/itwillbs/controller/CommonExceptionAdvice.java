package com.itwillbs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/*
 * 예외처리를 수행하는 클래스
 */
//@Controller
//=>해당클래스가 예외처리를 전문적으로 수행하는 클래스
//@ControllerAdvice
//에러를 잘다루는 역할

@ControllerAdvice
public class CommonExceptionAdvice{
	
	private static final Logger logger = LoggerFactory.getLogger(CommonExceptionAdvice.class);
	
	
//	@ExceptionHandler(Exception.class)
	
	//=> 예외가 발생시 처리하는 메서드 정의

	@ExceptionHandler(Exception.class)
	//컨트롤러는 아니지만 컨트롤러처럼 동작
	public String common(Exception e) {
		logger.info("e:{}",e.getMessage());
		return "errPage";
		
				
	}
	
	
	
}