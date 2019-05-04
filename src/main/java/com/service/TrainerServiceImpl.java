package com.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.TrainerDao;
import com.src.model.Traineee;

@Component("ts")
@Service
@Transactional
public class TrainerServiceImpl  implements TrainerService{
	
	@Autowired
	TrainerDao td;

	@Override
	public int addTrainer(Traineee traineee) {
		// TODO Auto-generated method stub
		return td.addTrainer(traineee);
	}

	@Override
	public int updateTrainer(Traineee traineee) {
		// TODO Auto-generated method stub
		return td.updateTrainer(traineee);
	}

	@Override
	public int deleteTrainer(int pId) {
		// TODO Auto-generated method stub
		return td.deleteTrainer(pId);
	}

	@Override
	public ArrayList<Traineee> getAll() {
		// TODO Auto-generated method stub
		return td.getAll();
	}

	@Override
	public Traineee getByPid(int pId) {
		// TODO Auto-generated method stub
		return td.getByPid(pId);
	}

}
