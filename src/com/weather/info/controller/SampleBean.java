package com.weather.info.controller;

import java.util.List;

import org.apache.log4j.Logger;

public class SampleBean 
{
	static Logger log = Logger.getLogger(AjaxController.class.getName());
	String version;
	String termsofService;
	features features;
	List <CityBean> results;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getTermsofService() {
		return termsofService;
	}
	public void setTermsofService(String termsofService) {
		this.termsofService = termsofService;
	}
	public features getFeatures() {
		return features;
	}
	public void setFeatures(features features) {
		this.features = features;
	}
    public void setResults(List<CityBean> results) {
        this.results = results;
    }
    public List<CityBean> getResults() {
        return results;
    }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return version+"hello";
	}
}
