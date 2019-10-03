package com.jbk.client;

import javax.ws.rs.core.Response;

import org.junit.Assert;
import org.junit.Test;

public class JerseyClientLiveTest {
	public static final int HTTP_CREATED = 200;
	private RestClient client = new RestClient();

	@Test
	public void givenCorrectObject_whenCorrectJsonRequest_thenResponseCodeCreated() {
		Country ctry = new Country(6, "Inn", "India11");

		Response response = client.createJsonEmployee(ctry);

		Assert.assertEquals(response.getStatus(), HTTP_CREATED);
	}
}
