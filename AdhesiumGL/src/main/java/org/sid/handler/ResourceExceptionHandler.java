package org.sid.handler;

import javax.servlet.http.HttpServletRequest;

import org.sid.exception.*;
import org.sid.entities.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ResourceExceptionHandler {

	// Client
	@ExceptionHandler(ClientAlreadyExistException.class)
	public ResponseEntity<Error> handlerClientAlreadyExistException(ClientAlreadyExistException e,
			HttpServletRequest request) {
		e.printStackTrace();
		Error error = new Error("Client Already Exist.", 1000L, System.currentTimeMillis(),
				"http://error.teste.com/1000", e.getMessage());
		return ResponseEntity.status(HttpStatus.CONFLICT).body(error);
	}

	@ExceptionHandler(ClientNotFoundException.class)
	public ResponseEntity<Error> handlerClientNotFoundException(ClientNotFoundException e,
			HttpServletRequest request) {
		e.printStackTrace();
		Error error = new Error("Client Not Found.", 1001L, System.currentTimeMillis(), "http://error.teste.com/1001",
				e.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
	// Produit
		@ExceptionHandler(ProduitAlreadyExistException.class)
		public ResponseEntity<Error> handlerClientAlreadyExistException(ProduitAlreadyExistException e,
				HttpServletRequest request) {
			e.printStackTrace();
			Error error = new Error("Produit Already Exist.", 1002L, System.currentTimeMillis(),
					"http://error.teste.com/1000", e.getMessage());
			return ResponseEntity.status(HttpStatus.CONFLICT).body(error);
		}

		@ExceptionHandler(ProduitNotFoundException.class)
		public ResponseEntity<Error> handlerProduitNotFoundException(ProduitNotFoundException e,
				HttpServletRequest request) {
			e.printStackTrace();
			Error error = new Error("Produit Not Found.", 1003L, System.currentTimeMillis(), "http://error.teste.com/1001",
					e.getMessage());
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
		}
}
