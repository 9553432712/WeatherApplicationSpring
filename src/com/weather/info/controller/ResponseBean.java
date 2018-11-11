package com.weather.info.controller;

import org.apache.log4j.Logger;

public class ResponseBean 
{
	static Logger log = Logger.getLogger(AjaxController.class.getName());
	SampleBean response;

	public SampleBean getResponse() {
		return response;
	}

	public void setResponse(SampleBean response) {
		this.response = response;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "responseeeeee"+response.toString();
	}
}
