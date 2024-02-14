package com.example.electronics.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.electronics.dao.AcDao;
import com.example.electronics.entity.Ac;
import com.example.electronics.exception.BrandNotFound;
import com.example.electronics.exception.ExpiredWarrantyYear;
import com.example.electronics.exception.IdNotFound;
import com.example.electronics.exception.PriceNotFound;

@Service
public class AcService {
	@Autowired
	AcDao ad;
	
	public String up(List<Ac> e) {
		return ad.up(e);
	}
	
	 public List<Ac> getAllData() {
			return ad.get();
		}
	 //Exception handling
		
	
	public List<Ac> getbrand(String a) throws BrandNotFound {
		List<Ac> c = ad.get().stream().filter(x -> x.getBrand().equalsIgnoreCase(a)).collect(Collectors.toList());
		if(c.isEmpty()) {
			throw new BrandNotFound("brand not found");
			}
		else {
			return c;
		}
	}
	
	
	public List<Ac> getpri(int a) throws PriceNotFound {
		List<Ac> c = ad.get().stream().filter(x -> x.getPrice() == (a)).collect(Collectors.toList());
		if(c.isEmpty()) {
			throw new PriceNotFound();
			}
		else {
			return c;
		}
	}
	
	
	
	
	
	public String getprice(int a) throws PriceNotFound {
		List<Ac> c = ad.get().stream().filter(x -> x.getPrice() == (a)).collect(Collectors.toList());
		try {
			if(c.isEmpty()) {
		throw new PriceNotFound();
			}
		else {
			return ("price is present");
		}
	}
	catch(PriceNotFound ae) {
		return ("invalid price");
}
	}
	
	
	public List<Ac> getpr(int a) throws PriceNotFound {
		List<Ac> c = ad.get().stream().filter(x -> x.getPrice() == (a)).collect(Collectors.toList());
		if(c.isEmpty()) {
			throw new PriceNotFound();
			}
		else {
			return c;
		}
	}
	
	public List<Ac> getyear(int a) throws ExpiredWarrantyYear {
		List<Ac> c = ad.get().stream().filter(x -> x.getWarantyyear() == (a)).collect(Collectors.toList());
		if(c.isEmpty()) {
			throw new ExpiredWarrantyYear();
			}
		else {
			return c;
		}
	}
	
//	public Object post(Ac e) {
//		return ad.post(e);
//	}
//	
	public String post(Ac a) throws PriceNotFound {
		if(a.getPrice()<50000) {
			return ad.post(a);
			}
		else {
			throw new PriceNotFound();
			
		}
	}
	
	public Ac getByModel(String a) throws NoSuchElementException {
		return ad.getByModel(a);
		 	}
	
	public Ac getid(int a) throws IdNotFound {
		return ad.getid(a);
		 	}
	
	public String getbybrand(String brand) throws BrandNotFound {
		if(ad.getbybrand(brand).isEmpty()) {
		   throw new BrandNotFound(brand);
		}
		else {
			return ad.getbybrand(brand);
		}
	}
	
	




}
