package com.weather.info.controller;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;


@RestController
@RequestMapping(value = "/search/getSearchResult")
public class AjaxController 
{
	static Logger log = Logger.getLogger(AjaxController.class.getName());
	@RequestMapping(value = "/{city}" ,method = RequestMethod.POST)
	public void getSearchResultViaAjax(@PathVariable String city, HttpServletRequest req, HttpServletResponse response) throws IOException
	{
		RestTemplate restTemplate = new RestTemplate();;
		System.out.println("In controller");
		//ObjectMapper mapper = new ObjectMapper();
		ResponseBean documentObj = null;
		    try
		    {
		        documentObj = restTemplate.getForObject("http://api.wunderground.com/api/0febb2c6dfdd1e46/conditions/q/"+city+".json",ResponseBean.class);
		    } 
		    catch (Exception e) 
		    {
		    	log.error("error------------------------>"+e);
		        throw new RuntimeException("Failed to convert JSON String document into a JSON Object.", e);
		    }
		//ResponseBean result = restTemplate.getForObject("http://api.wunderground.com/api/0febb2c6dfdd1e46/conditions/q/Miami.json",ResponseBean.class);
		   // req.setAttribute("msg", documentObj.toString());
		  
		    String result ="<h1>Weather report</h1>";
		    if(documentObj.getResponse().getResults()!=null && documentObj.getResponse().getResults().size()>0)
		    {
		    	result += "<table border=1 cellspacing=5 cellpadding=5><tr><th>Name</th><th>city</th><th>state</th><th>country</th><th>country name</th><th>zmw</th></tr>";
	    		for(int i=0;i<documentObj.getResponse().getResults().size();i++) 
	    		{
	    			result+= "<tr><td>"+documentObj.getResponse().getResults().get(i).getName()+"</td>"
	    		    		+ "<td>"+documentObj.getResponse().getResults().get(i).getCity()+"</td><td>"+documentObj.getResponse().getResults().get(i).getState()+"</td>"
	    		    		+ "<td>"+documentObj.getResponse().getResults().get(i).getCountry()+"</td><td>"+documentObj.getResponse().getResults().get(i).getCountry_name()+"</td>"
	    		    		+ "<td>"+documentObj.getResponse().getResults().get(i).getZmw()+"</td></tr>";
	    		}
	    		log.info("Got the reponse");
	    		result+= "</table>";
		    }
		    else {
		    	result+="<span style='color:red'>No results found</span>";
		    	log.info("No results found");
		    }
		    
		    
		  
			
		    
		    response.setContentType("text/plain");
		    response.getWriter().write(result);
			//mapper.writeValue(response.getOutputStream(), documentObj);
		    

	}
}


