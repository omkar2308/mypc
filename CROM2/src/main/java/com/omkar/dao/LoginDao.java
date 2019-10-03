package com.omkar.dao;

import java.util.List;


import java.util.List;

import com.omkar.model.UserInfo;

public interface LoginDao {

 UserInfo findUserInfo(String username);
 
 List getUserRoles(String username);
}
