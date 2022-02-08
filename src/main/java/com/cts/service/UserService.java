//package com.cts.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.cts.model.UserBean;
//import com.cts.repository.UserRepository;
//
//@Service
//public class UserService {
//	@Autowired
//	private UserRepository repo;
//	
//	public UserBean getUser(String username) {
//		System.out.println("************"+username+"*********");
//		return repo.findById(username).get();
//	}
//}
