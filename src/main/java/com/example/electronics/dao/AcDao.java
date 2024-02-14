package com.example.electronics.dao;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.electronics.entity.Ac;
import com.example.electronics.exception.BrandNotFound;
import com.example.electronics.exception.IdNotFound;
import com.example.electronics.repo.AcRepo;

@Repository
public class AcDao {
	@Autowired
	AcRepo ar;
	public String up(List<Ac> e) {
		ar.saveAll(e);
		return "Saved";
	}
	
	public List<Ac> get() {
		return ar.findAll();
	}
	
	public String post(Ac a) {
		ar.save(a);
		return "Saved";
	}
	
	public Ac getByModel(String a) throws NoSuchElementException {
		return ar.getByModel(a).orElseThrow(()-> new NoSuchElementException());
	}
		public Ac getid(int a) throws IdNotFound {
		return ar.findById(a).orElseThrow(()-> new IdNotFound());
	}
//	public List<Ac> getbybrand(String brand) throws BrandNotFound {
//		return ar.findAll(brand).orElseThrow(() -> new BrandNotFound());
//	}
//	

	public String getbybrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}
	}
	