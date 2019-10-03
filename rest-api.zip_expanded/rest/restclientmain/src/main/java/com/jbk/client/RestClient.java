package com.jbk.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RestClient {
	private static final String REST_URI = "http://localhost:8080/restwsnew/rest/country/list";
	private static final String REST_URI_ADD = "http://localhost:8080/RESTWS/rest/country/addCountry";
	private Client client = ClientBuilder.newClient();

	public Country getJsonEmployee(int id) {
		return client.target(REST_URI).path(String.valueOf(id)).request(MediaType.APPLICATION_JSON).get(Country.class);
	}

	public Response createJsonEmployee(Country ctry) {
		return client.target(REST_URI_ADD).request(MediaType.APPLICATION_JSON)
				.post(Entity.entity(ctry, MediaType.APPLICATION_JSON));
	}
}
