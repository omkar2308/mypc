package com.omkar.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class UserInfo {
	 private String username;
	 private String password;
	 
	 public UserInfo() {
	  super();
	 }
	 public UserInfo(String username, String password) {
	  super();
	  this.username = username;
	  this.password = password;
	 }
	 
	 public String getUsername() {
	  return username;
	 }
	 public void setUsername(String username) {
	  this.username = username;
	 }
	 public String getPassword() {
	  return password;
	 }
	 public void setPassword(String password) {
	  this.password = password;
	 }
	}
