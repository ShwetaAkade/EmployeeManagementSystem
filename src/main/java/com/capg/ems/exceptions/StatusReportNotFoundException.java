package com.capg.ems.exceptions;

public class StatusReportNotFoundException extends RuntimeException {
	
    public StatusReportNotFoundException(int Id){
        super();
    }

    public StatusReportNotFoundException(int Id,Throwable e){
        super(e);
    }

}
