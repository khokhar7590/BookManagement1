package com.example.BookManagement1.Exception;

public class CustomException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomException(){
		super("My Custom Exception");
	}
	
	public CustomException(String Errmsg,int errcd){
		super("My Custom Exception");
		this.errorCode=errcd;
		this.errorMsg= Errmsg;
	}
	int errorCode;
	String errorMsg;
	
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
