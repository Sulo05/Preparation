package com.example.electronics.service;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.electronics.dao.LaptopDao;
import com.example.electronics.entity.Laptop;
import com.example.electronics.exception.AgeNotEligible;
import com.example.electronics.exception.BrandNotFound;
import com.example.electronics.exception.ColorNotFound;
import com.example.electronics.exception.TypeNotFound;
@Service
public class LaptopService {
	@Autowired
	LaptopDao ld;

	public String down(List<Laptop> e) {
		return ld.down(e);
	}
	public String post(List<Laptop> l) {
	return ld.post(l);
	}
	
	public String up(Laptop z) {
		return ld.up(z);
	}
	
	
	public String pos(List<Laptop> l) {
		try {
			if(((Laptop) l).getPrice() < 500)   {
				throw new AgeNotEligible("price is too low");
			}
			else {
				return ld.post(l);
				
			}
		}
		catch(Exception ae) {
			return ("posted");
		}
		
		}
	    
	
	
    public List<Laptop> getAllData() {
		return ld.getAllData();
	}
	
	public List<Laptop> getcolor(String a) throws ColorNotFound {
		List<Laptop> c = ld.getAllData().stream().filter(x -> x.getColor().equalsIgnoreCase(a)).collect(Collectors.toList());
		if(c.isEmpty()) {
			throw new ColorNotFound();
			}
		else {
			return c;
		}
	}

	public List<Laptop> gettype(String a) throws TypeNotFound {
		List<Laptop> c = ld.getAllData().stream().filter(x -> x.getType().equalsIgnoreCase(a)).collect(Collectors.toList());
		if(c.isEmpty()) {
			throw new TypeNotFound();
			}
		else {
			return c;
		}
	}
	public List<Laptop> getcol(String a) throws ColorNotFound {
		List<Laptop> c = ld.getAllData().stream().filter(x -> x.getColor().equalsIgnoreCase(a)).collect(Collectors.toList());
		if(c.isEmpty()) {
			throw new ColorNotFound();
			}
		else {
			return c;
		}
	}

	public List<Laptop> getByPrice(int price) {
		return ld.getByPrice(price);
	}
	public List<String> getbrand() {
		return ld.getbrand();
	}
	public Laptop getprice() {
		return ld.getprice();
	}
	
	
	public List<Laptop> getb(String a) throws BrandNotFound {
		List<Laptop> c = ld.getAllData().stream().filter(x -> x.getBrand().equalsIgnoreCase(a)).collect(Collectors.toList());
		if(c.isEmpty()) {
			throw new BrandNotFound("Brand not found");
			}
		else {
			return c;
		}
	}
	
	public List<Laptop> post(int a) throws AgeNotEligible {
		List<Laptop> d = ld.getAllData().stream().filter(x -> x.getPrice() == (a)).collect(Collectors.toList());
		if(((Laptop) d).getPrice()>200000) {
			throw new AgeNotEligible("over prize");
		}
		else {
			return d;
		}
	}
	
	public List<Laptop> getbrand(String brand) throws BrandNotFound {
		List<Laptop> allBrand = this.getAllData();
		List<Laptop> temp = allBrand.stream().filter(x->x.getBrand().equals(brand)).collect(Collectors.toList());
		if(temp.isEmpty()) {
			throw new BrandNotFound(brand);
		}
		else {
			return temp;
}
		}
	
//	 public String update(Laptop l, int id) {
//	    	Laptop x = ld.findById(id).get();
//	    	if(l.getPrice() > 0) {
//	    		x.setPrice(l.getPrice());
//	    	}
//	    	((Object) ld).save(x);
//	    	return "Price updated Successfully";
//	    }



	

}
