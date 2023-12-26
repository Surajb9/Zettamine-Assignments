package com.zettamine.rra.exceptions;

public class InvalidCityPincodeException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidCityPincodeException() {
		System.out.println("Enter Valid Pincode with 5 digits only");
		// TODO Auto-generated constructor stub
	}

	public InvalidCityPincodeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InvalidCityPincodeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidCityPincodeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InvalidCityPincodeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	
	

}
