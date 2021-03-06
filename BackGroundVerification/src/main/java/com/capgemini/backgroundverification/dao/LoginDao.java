package com.capgemini.backgroundverification.dao;
import java.util.List;

import com.capgemini.backgroundverification.entity.Logindata;
import com.capgemini.backgroundverification.entity.Verification;

public interface LoginDao {

	Logindata addUser(Logindata u);

	List<Logindata> getAllUsers();

	Logindata deleteUser(int userId);

	Logindata updateUser(Logindata u);

	String loginUser(Logindata u);
	
	Verification addVer(Verification u);
}