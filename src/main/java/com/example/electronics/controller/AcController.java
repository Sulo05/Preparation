package com.example.electronics.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.electronics.entity.Ac;
import com.example.electronics.exception.BrandNotFound;
import com.example.electronics.exception.ExpiredWarrantyYear;
import com.example.electronics.exception.IdNotFound;
import com.example.electronics.exception.ModelNotFound;
import com.example.electronics.exception.PriceNotFound;
import com.example.electronics.service.AcService;

@RestController
//@Controller
//@RequestMapping(value="/ac")
public class AcController {
	@Autowired
	AcService as;
	
	
	@PostMapping(value = "/home")
	public String up(@RequestBody List<Ac> e) {
		return as.up(e);
	}
	@GetMapping(value = "/all")
	public List<Ac> getAllData() {
		return as.getAllData();
	}

	
	@GetMapping(value = "/getbrand/{a}")
	public List<Ac> getbrand(@PathVariable String a) throws BrandNotFound {
		return as.getbrand(a);
	}
	
	@GetMapping(value = "/getpri/{a}")
	public List<Ac> getpri(@PathVariable int a) throws PriceNotFound {
		return as.getpri(a);
	}
	
	@GetMapping(value = "/getprice/{a}")
	public String getprice(@PathVariable int a) throws PriceNotFound {
		return as.getprice(a);
	}

	@GetMapping(value = "/getpr/{a}")
	public List<Ac> getpr(@PathVariable int a) throws PriceNotFound {
		return as.getpr(a);
	}

	@GetMapping(value = "/getyear/{a}")
	public List<Ac> getyear(@PathVariable int a) throws ExpiredWarrantyYear {
		return as.getyear(a);
	}
	@PostMapping(value = "/one")
	public String post(@RequestBody Ac a) throws PriceNotFound{
		return as.post(a);
	}
	@GetMapping(value = "/getmodel/{a}")
	public Ac getByModel(@PathVariable String a) throws NoSuchElementException {
		return as.getByModel(a);
	}
	
//	@GetMapping(value = "/getmod/{a}")
//	public List<Ac> getByMode(@PathVariable String a) throws ModelNotFound {
//		return as.getmode(a);
//	}

	
	@GetMapping(value = "/getid/{a}")
	public Ac getid(@PathVariable int a) throws IdNotFound {
		return as.getid(a);
	}
	
	@GetMapping(value = "/getbr/{a}")
	public String getbybrand(@PathVariable String a) throws BrandNotFound {
		return as.getbybrand(a);
	}
	
	@GetMapping(path = "/get")
	public String get() {
		return "hello.html";
	}
	


	

}
