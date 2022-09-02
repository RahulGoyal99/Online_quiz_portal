package com.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.business.bean.Participant;
import com.business.bean.Questions;
import com.business.bean.Quiz;
import com.business.bean.Responses;
import com.business.dao.ParticipantDAO;

@Service
public class ParticipantService {
	@Autowired
	ParticipantDAO participantDao;

	public String storeParticipant(Participant participant) {
		if (participantDao.storeParticipant(participant) > 0) {
			return "Participant details stored";
		} else {
			return "Participant details didn't store";
		}
	}

	public List<Quiz> getQuizDetails() {
		return participantDao.getQuizDetails();
	}

	public List<Questions> getQuestions() {
		return participantDao.getQuestions();
	}

	public String storeResponse(Responses response) {
		if (participantDao.storeResponse(response) > 0) {
			return "Response stored";
		} else {
			return "Response didn't store";
		}
	}
}
