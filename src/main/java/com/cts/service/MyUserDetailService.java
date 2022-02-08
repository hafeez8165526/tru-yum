//package com.cts.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.cts.model.UserBean;
//
//@Service
//public class MyUserDetailService implements UserDetailsService {
//	
//	@Autowired
//	private UserService service;
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		System.out.println("==========="+username+"==============");
//		UserBean u=service.getUser(username);
//		return new User(u.getUsername(), u.getPassword(), AuthorityUtils.createAuthorityList(u.getRole().toString()));
//		
//	}
//
//}
