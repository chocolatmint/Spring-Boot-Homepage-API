package com.api.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserIdNotFoundException extends RuntimeException {
	private int idUser;

	public UserIdNotFoundException(int idUser) {
		super(String.format("User id %s not found!", idUser));
		this.idUser = idUser;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	
}
