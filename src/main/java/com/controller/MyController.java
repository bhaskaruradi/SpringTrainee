package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.TrainerService;
import com.src.model.Traineee;



@RestController
public class MyController {

	@Autowired
	TrainerService ts;
	@GetMapping("/")
	public String sayHi() {
		return "Hello";
	}
	@PostMapping("/add")
	public ResponseEntity insertData(@RequestBody Traineee traineee) {
		ts.addTrainer(traineee);
		return new ResponseEntity(HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity updateData(@RequestBody Traineee traineee) {
		ts.updateTrainer(traineee);
		return new ResponseEntity(HttpStatus.OK);
	}
	@DeleteMapping("/delete")
	public ResponseEntity deleteData(@RequestBody int pId) {
		ts.deleteTrainer(pId);
		return new ResponseEntity(HttpStatus.OK);
		
	}
	@GetMapping("/getById")
	public Traineee getByPid(@RequestBody int pId) {
		Traineee traineee=ts.getByPid(pId);
			return traineee;
	}

	@GetMapping("/getAll")
	public ArrayList<Traineee> getAllProducts(){
		ArrayList<Traineee> products = ts.getAll();
		return products;
	}
}
