package com.api.exception;

public class UserModuleNotFoundException extends RuntimeException {
	private int idUser;

	public UserModuleNotFoundException(int idUser) {
		super(String.format("Modules for user id: %s not found!", idUser));
		this.idUser = idUser;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
}
