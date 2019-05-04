package com.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import com.src.model.Traineee;

@Component("td")
@Repository
@ComponentScan("com")
public class TrainerDaoImpl implements TrainerDao {

	@PersistenceContext
	EntityManager entityManager;
	@Override
	public int addTrainer(Traineee traineee) {
		// TODO Auto-generated method stub
		entityManager.persist(traineee);
		return 0;
	}

	@Override
	public int updateTrainer(Traineee traineee) {
		// TODO Auto-generated method stub
		entityManager.merge(traineee);
		return 0;
	}

	@Override
	public int deleteTrainer(int pId) {
		// TODO Auto-generated method stub
		Traineee tr =new Traineee();
		tr.setTrainingId(pId);
		entityManager.remove(getByPid(pId));
		return 0;
	}

	@Override
	public ArrayList<Traineee> getAll() {
		// TODO Auto-generated method stub
		Query query = (Query) entityManager.createQuery("from Traineee");
		ArrayList<Traineee> list = (ArrayList<Traineee>) query.list();
		return list;
	
	}

	@Override
	public Traineee getByPid(int pId) {
		// TODO Auto-generated method stub
		Traineee t=entityManager.find(Traineee.class, pId);
		return t;
	}

}
