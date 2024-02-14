package com.example.electronics.controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.electronics.entity.Laptop;
import com.example.electronics.exception.AgeNotEligible;
import com.example.electronics.exception.BrandNotFound;
import com.example.electronics.exception.ColorNotFound;
import com.example.electronics.exception.TypeNotFound;
import com.example.electronics.service.LaptopService;
@RestController
@RequestMapping(value="/laptop")

public class LaptopController {
@Autowired
LaptopService ls;

@PostMapping(value = "/school")
public String post(@RequestBody List<Laptop> e) {
	return ls.post(e);
}
@GetMapping(value = "/all")
public List<Laptop> getAllData() {
	return ls.getAllData();
}
	
	@PutMapping(value = "/no/{z}")
	public String up(@RequestBody Laptop z) {
		return ls.up(z);
	}	
	


@GetMapping(value = "/getcolor/{a}")
public List<Laptop> getcolor(@PathVariable String a) throws ColorNotFound {
	return ls.getcolor(a);
}
@GetMapping(value = "/gettype/{a}")
public List<Laptop> gettype(@PathVariable String a) throws TypeNotFound {
	return ls.gettype(a);
}
@GetMapping(value = "/getcol/{a}")
public List<Laptop> getcol(@PathVariable String a) throws ColorNotFound {
	return ls.getcol(a);
}



@GetMapping(value = "/getbyprice/{price}")
public List<Laptop> getByPrice(@PathVariable int price) {
	return ls.getByPrice(price);
}

@GetMapping(value = "/getname")
public List<String> getbrand() {
	return ls.getbrand();
}

@GetMapping(value = "/getsal")
public Laptop getprice() {
	return ls.getprice();
}

@GetMapping(value = "/getb/{a}")
public List<Laptop> getb(@PathVariable String a) throws BrandNotFound {
	return ls.getb(a);
}

//@GetMapping(value = "/getp/{b}")
//public List<Laptop> pos(@PathVariable int b) throws AgeNotEligible {
//	return ls.pos(b);
//}


//@PutMapping(value = "/modify")
//public String update (@RequestBody Laptop l, @PathVariable int id) {
//	return ls.update(l,id);
//}
//







}
