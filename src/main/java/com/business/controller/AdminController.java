package com.business.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.business.bean.Answerkey;
import com.business.bean.Questions;
import com.business.bean.Quiz;
import com.business.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	AdminService adminService;

	@RequestMapping(value = "admin/storeQuiz", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public String storeParticipant(@RequestBody Quiz quiz) { // scanning value from body json
		return adminService.storeQuiz(quiz);
	}

	@RequestMapping(value = "admin/storeQuestions", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public String storeQuestions(@RequestBody Questions questions) {
		return adminService.storeQuestions(questions);
	}

	@RequestMapping(value = "admin/storeAnswer", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public String storeParticipant(@RequestBody Answerkey ans) {
		return adminService.storeAnswerkey(ans);
	}

}
