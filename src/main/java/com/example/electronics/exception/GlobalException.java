package com.example.electronics.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException  {
	@ExceptionHandler(PriceNotFound.class)
	public ResponseEntity<Object> noprice(PriceNotFound pe) {
		return new ResponseEntity<> ("price is not found" , HttpStatus.BAD_REQUEST);
		
	}
	@ExceptionHandler(BrandNotFound.class)
	public ResponseEntity<Object> nobrand(BrandNotFound be) {
		return new ResponseEntity<> ("Brand is not present" , HttpStatus.BAD_REQUEST);
		
	}
	@ExceptionHandler(ColorNotFound.class)
	public ResponseEntity<Object> nocolor(ColorNotFound ce) {
		return new ResponseEntity<> ("Invalid color" , HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(TypeNotFound.class)
	public ResponseEntity<Object> notype(TypeNotFound te) {
		return new ResponseEntity<> ("Type is not here" , HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(ExpiredWarrantyYear.class)
	public ResponseEntity<Object> noyear(ExpiredWarrantyYear ye) {
		return new ResponseEntity<> ("This year is Expired" , HttpStatus.BAD_REQUEST);
		
	}


	@ExceptionHandler(ModelNotFound.class)
	public ResponseEntity<Object> nomodel(ModelNotFound ee) {
		return new ResponseEntity<> ("no such model" , HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(IdNotFound.class)
	public ResponseEntity<Object> noid(IdNotFound ee) {
	return new ResponseEntity<> ("no such id" , HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(AgeNotEligible.class)
	public ResponseEntity<Object> age(AgeNotEligible ee) {
		return new ResponseEntity<> (ee.getMessage(), HttpStatus.NOT_FOUND);
		
	}
	




}
