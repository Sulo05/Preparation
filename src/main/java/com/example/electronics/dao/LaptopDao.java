package com.example.electronics.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.electronics.entity.Laptop;
import com.example.electronics.repo.LaptopRepo;


@Repository
public class LaptopDao {
	@Autowired
	LaptopRepo lr;
	public String down(List<Laptop> l) {
		lr.saveAll(l);
		return "saved";
	}
	
	public String up(Laptop z) {
		lr.save(z);
		return "Saved";
	}

	
	
	public String post(List<Laptop> l) {
		lr.saveAll(l);
		return "saved";
	}
	
	public List<Laptop> get() {
		return lr.findAll();
		
	}
	public List<Laptop> getAllData() {
		return lr.findAll();
	}
	
	
	public List<Laptop> getByPrice(int price) {
    	return lr.getByPrice(price);
    }
	
	public List<String> getbrand() {
		return lr.getbrand();
	}


    public Laptop getprice() {
    	return lr.getprice();
    }
    
//    public List<String> getb() {
//		return lr.getb();
//	}
    
    public String update(Laptop l, int id) {
    	Laptop x = lr.findById(id).get();
    	if(l.getPrice() > 0) {
    		x.setPrice(l.getPrice());
    	}
    	lr.save(x);
    	return "Price updated Successfully";
    }

	public LaptopDao findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	
}
