package com.zaw.CoinGame_Exception.exceptionhandling;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@RestControllerAdvice
public class ExceptionHandling {
	
	@ExceptionHandler(MissingServletRequestParameterException.class)
	public ResponseEntity<Map<String, String>> inputError(MissingServletRequestParameterException ex){
		Map<String, String> error=new HashMap<>();
		error.put("time", LocalDateTime.now()+"");
		error.put("message" , ex.getMessage());
		error.put("error", "have to put parameter for name");
		return new ResponseEntity<Map<String, String>> (error, HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(NoResourceFoundException.class)
	public ResponseEntity<Map<String, String>> inputError(NoResourceFoundException ex){
		Map<String, String> error=new HashMap<>();
		error.put("time", LocalDateTime.now()+"");
		error.put("message" , ex.getMessage());
		error.put("error", "URL Link wrong");
		return new ResponseEntity<Map<String, String>> (error, HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> inputError(MethodArgumentNotValidException ex){
		Map<String, String> error=new HashMap<>();
		error.put("time", LocalDateTime.now()+"");
		List<FieldError> errors=  ex.getBindingResult().getFieldErrors();
		for(FieldError err :errors) {
			error.put(err.getField(), err.getDefaultMessage());			
		}		
		return new ResponseEntity<Map<String, String>> (error, HttpStatus.BAD_REQUEST);
	}
	
//	@ExceptionHandler(CoinCheckException.class)
//	public ResponseEntity<Map<String, String>> inputError(CoinCheckException ex){
//		Map<String, String> error=new HashMap<>();
//		error.put("time", LocalDateTime.now()+"");
//		error.put("message" , ex.getMessage());		
//		return new ResponseEntity<Map<String, String>> (error, HttpStatus.BAD_REQUEST);
//	}
//	@ExceptionHandler(IDNotFoundException.class)
//	public ResponseEntity<Map<String, String>> inputError(IDNotFoundException ex){
//		Map<String, String> error=new HashMap<>();
//		error.put("time", LocalDateTime.now()+"");
//		error.put("message" , ex.getMessage());		
//		return new ResponseEntity<Map<String, String>> (error, HttpStatus.BAD_REQUEST);
//	}
	@ExceptionHandler(CoinException.class)
	public ResponseEntity<Map<String, String>> inputError(CoinException ex){
		Map<String, String> error=new HashMap<>();
		error.put("time", LocalDateTime.now()+"");
		error.put("message" , ex.getMessage());		
		return new ResponseEntity<Map<String, String>> (error, HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Map<String, String>> inputError(Exception ex){
		Map<String, String> error=new HashMap<>();
		error.put("time", LocalDateTime.now()+"");
		error.put("message" , "Sorry somethng wrong");		
		return new ResponseEntity<Map<String, String>> (error, HttpStatus.BAD_REQUEST);
	}

}
