package com.weather.info.controller;

import org.apache.log4j.Logger;

public class CityBean 
{
	static Logger log = Logger.getLogger(AjaxController.class.getName());
	
	String name;
	String city;
	String state;
	String country;
	String country_iso3166;
	String country_name;
	String zmw;
	String l;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountry_iso() {
		return country_iso3166;
	}
	public void setCountry_iso(String country_iso) {
		this.country_iso3166 = country_iso;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public String getZmw() {
		return zmw;
	}
	public void setZmw(String zmw) {
		this.zmw = zmw;
	}
	public String getL() {
		return l;
	}
	public void setL(String l) {
		this.l = l;
	}
	@Override
	public String toString() {
		return city+"gjhhhhhhhhhh";
	}
	
	
	

}
