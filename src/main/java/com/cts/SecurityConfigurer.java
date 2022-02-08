//package com.cts;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import com.cts.service.MyUserDetailService;
//
//import ch.qos.logback.core.pattern.color.BoldCyanCompositeConverter;
//@Configuration
//@EnableWebSecurity
//public class SecurityConfigurer extends WebSecurityConfigurerAdapter {
//	@Autowired
//	private MyUserDetailService myUserDetailService; 
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		System.out.println("======Security Configuration called==========");
//		auth.userDetailsService(myUserDetailService);
//	}
//
//	@Bean
//	public AuthenticationManager authenticationManagerBean() throws Exception {
//		
//		return super.authenticationManagerBean();
//	}
//
//	@Override
//	protected void configure(final HttpSecurity http) throws Exception {
//		http.csrf().disable()
//		.authorizeRequests()
////		.antMatchers("/hello").hasAuthority("USER")
////		.antMatchers("/admin").hasAuthority("ADMIN")
////		.anyRequest().authenticated()
//		.and()
//		.formLogin()
////		.httpBasic()
//		.and()
//		.exceptionHandling().accessDeniedPage("/403");
//	}
////	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//
//}
