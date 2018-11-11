package com.weather.info.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Scanner;


public class jsonradar 
{
	
	
	public static void main(String ar[]) throws Exception
	{
		/* URL url = new URL("http://api.wunderground.com/api/0febb2c6dfdd1e46/conditions/q/Miami.json"); 
		 HttpURLConnection conn = (HttpURLConnection)url.openConnection(); 
		 conn.setRequestMethod("GET"); 
		 
		 conn.connect(); 
		  int responsecode = conn.getResponseCode(); 
		  System.out.println(responsecode);*/
		 /* Scanner sc = new Scanner(url.openStream());
		  
		  
		  String inline="";
		  while(sc.hasNext())

		  {

		  inline+=sc.nextLine();

		  }

		  System.out.println("\nJSON data in string format");

		  System.out.println(inline);

		  sc.close();
*/
		  
		  
		  InputStream is = new URL("http://api.wunderground.com/api/0febb2c6dfdd1e46/conditions/q/Miami.json").openStream();
		    try {
		      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
		      String jsonText = readAll(rd);
		   /*   JSONObject json = new JSONObject(jsonText);
		    System.out.println(json);*/
		    }
			catch(Exception e)
		    {
				System.out.println(e);
				
		    }


	}
	
	private static String readAll(Reader rd) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    int cp;
	    while ((cp = rd.read()) != -1) {
	      sb.append((char) cp);
	    }
	    return sb.toString();
	  }


}
