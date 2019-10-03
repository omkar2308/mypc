package com.jbk.client;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Country {
	public Country(long countryId, String name, String code) {
		super();
		this.countryId = countryId;
		this.name = name;
		this.code = code;
	}
	private long countryId;
	private String name;
	private String code;
	public long getCountryId() {
		return countryId;
	}
	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
