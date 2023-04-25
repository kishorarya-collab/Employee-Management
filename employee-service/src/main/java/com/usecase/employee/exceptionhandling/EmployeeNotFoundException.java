package com.usecase.employee.exceptionhandling;

public class EmployeeNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	String errorCode;
	String errorMsg;
	public EmployeeNotFoundException() {
		super();
		}
	public EmployeeNotFoundException(String errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "EmployeeNotFoundException [errorCode=" + errorCode + ", errorMsg=" + errorMsg + "]";
	}

	

}