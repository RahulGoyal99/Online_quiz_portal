package com.business.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.business.bean.Participant;
import com.business.bean.Questions;
import com.business.bean.Quiz;
import com.business.bean.Responses;

@Repository
public class ParticipantDAO {

	@Autowired
	EntityManagerFactory emf;

	public int storeParticipant(Participant participant) {
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			tran.begin();
			manager.persist(participant);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}

	public List<Quiz> getQuizDetails() {
		EntityManager manger = emf.createEntityManager();
		Query qry = manger.createQuery("select q from Quiz q");
		List<Quiz> listOfQuiz = qry.getResultList();
		return listOfQuiz;
	}

	public List<Questions> getQuestions() {
		EntityManager manger = emf.createEntityManager();
		Query qry = manger.createQuery("select q from Questions q");
		List<Questions> listOfQuestions = qry.getResultList();
		return listOfQuestions;
	}

	public int storeResponse(Responses response) {
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			tran.begin();
			manager.persist(response);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
}
