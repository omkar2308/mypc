package com.jbk.client;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

import org.junit.Test;

import io.restassured.http.ContentType;

public class ClinetRestAssured {

	@Test
	public void resource_returns_200_with_expected_id() {
		given().when().get("http://localhost:8080/RESTWS/rest/country/info/IN").then().statusCode(200).body("countryId",
				equalTo(101), "name", equalTo("India"), "code", equalTo("IN"));
	}

	/*
	 * @Test public void test_ResponseHeaderData_ShouldBeCorrect() {
	 * 
	 * given().when().get("circuits.json").then().assertThat().statusCode(200).
	 * and() .contentType(ContentType.JSON).and().header("Content-Length",
	 * equalTo("4567")); }
	 */

	/*
	 * @Test public void test_NumberOfCircuitsFor2017Season_ShouldBe20() {
	 * 
	 * given().when().get("addCountry.json").then().assertThat().body(
	 * "MRData.CircuitTable.Circuits.circuitId", hasSize(20)); }
	 * 
	 * @Test public void test_ResponseHeaderData_ShouldBeCorrect() {
	 * 
	 * given().when().get("addCountry.json").then().assertThat().statusCode(200)
	 * .and().contentType(ContentType.JSON) .and().header("Content-Length",
	 * equalTo("4567")); }
	 */
}
