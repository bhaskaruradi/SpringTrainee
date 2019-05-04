package com.dao;

import java.util.ArrayList;

import com.src.model.Traineee;



public interface TrainerDao {

	int addTrainer(Traineee traineee);
    int updateTrainer(Traineee traineee);
	int deleteTrainer(int pId);
	ArrayList<Traineee> getAll();
	Traineee getByPid(int pId);
}
