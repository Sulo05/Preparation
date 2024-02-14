package com.example.electronics.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.electronics.entity.Ac;


public interface AcRepo extends JpaRepository<Ac, Integer>{
	@Query(value = "select * from ac where model = ?" , nativeQuery = true)
	Optional<Ac> getByModel(String a);
	

}
