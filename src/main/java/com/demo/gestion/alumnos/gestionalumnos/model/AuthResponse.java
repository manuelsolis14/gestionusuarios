package com.demo.gestion.alumnos.gestionalumnos.model;

import java.io.Serializable;

public class AuthResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1245254735177228396L;

	private String token;

	private long expiresIn;

	public String getToken() {
		return token;
	}

	public long getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(long expiresIn) {
		this.expiresIn = expiresIn;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
