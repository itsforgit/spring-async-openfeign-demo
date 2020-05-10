package com.pg.asyncdemo.exception;

public class CustomeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int status;
	private String response;

	public CustomeException() {
		super();
	}

	public CustomeException(String response) {
		super();
		this.response = response;
	}

	public CustomeException(int status, String response) {
		super();
		this.status = status;
		this.response = response;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the response
	 */
	public String getResponse() {
		return response;
	}

	/**
	 * @param response the response to set
	 */
	public void setResponse(String response) {
		this.response = response;
	}

}
