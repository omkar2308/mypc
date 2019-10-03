package com.jbk.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class JerseyClientPost {

	public static void main(String[] args) {

		try {

			Client client = ClientBuilder.newClient();
			WebTarget webTarget = client.target("http://localhost:8080/restwsnew/rest/country/list");
			// For XML format, MediaType.APPLICATION_XML can be used.
			Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
			// for get
			Country response = invocationBuilder.get(Country.class);
			System.out.println(response.getCode());
			// for post
			Response response1 = invocationBuilder.post(Entity.entity(response, MediaType.APPLICATION_JSON));
	
		
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
