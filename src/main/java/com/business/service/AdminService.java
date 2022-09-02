package com.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.business.bean.Answerkey;
import com.business.bean.Questions;
import com.business.bean.Quiz;
import com.business.dao.AdminDAO;

@Service
public class AdminService {
	@Autowired
	AdminDAO AdminDao;

	public String storeQuiz(Quiz quiz) {
		if (AdminDao.storeQuiz(quiz) > 0) {
			return "Quiz details stored";
		} else {
			return "Quiz details didn't store";
		}
	}

	public String storeQuestions(Questions questions) {
		if (AdminDao.storeQuestions(questions) > 0) {
			return "Questions stored";
		} else {
			return "Questions didn't store";
		}
	}

	public String storeAnswerkey(Answerkey ans) {
		if (AdminDao.storeAnswerkey(ans) > 0) {
			return "Answer stored";
		} else {
			return "Answer didn't store";
		}
	}
}
