package com.capg.ems.exceptions;

public class ComplianceNotFoundException extends RuntimeException {
	
	public ComplianceNotFoundException(int Id) {
		super();
	}
	
	public ComplianceNotFoundException(int Id,Throwable e) {
		super(e);
	}

}
