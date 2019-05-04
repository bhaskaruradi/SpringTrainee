package com.service;

import java.util.ArrayList;

import com.src.model.Traineee;

public interface TrainerService {

	int addTrainer(Traineee traineee);
    int updateTrainer(Traineee traineee);
	int deleteTrainer(int pId);
	ArrayList<Traineee> getAll();
	Traineee getByPid(int pId);
}
