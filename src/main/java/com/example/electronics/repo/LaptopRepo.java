package com.example.electronics.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.electronics.entity.Laptop;


public interface LaptopRepo extends JpaRepository<Laptop,Integer>{

	//List<Laptop> getColor(String a);
	//List<Laptop> getb(String a);
	
	@Query(value = "select * from laptop where price >= ?" , nativeQuery = true)
	public List<Laptop> getByPrice(int price);
	
	@Query(value = "select brand from laptop " , nativeQuery = true)
	public List<String> getbrand();
	
	@Query(value = " select * from laptop where price =(select min(price) from laptop)" , nativeQuery = true)
	public Laptop getprice();

	//List<String> getb();
	

}
