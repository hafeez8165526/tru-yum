package com.cts.proxy;

import java.util.List;
import java.util.Set;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cts.bean.Cart;
import com.cts.bean.MenuItem;
import com.cts.bean.User;

@FeignClient(name="truYumProxy",url = "http://localhost:9090")
public interface truYumMenuItemProxy {
	
	@GetMapping("/menu-items")
	public List<MenuItem> getMenuItems();
	
	@GetMapping("/{id}")
	public MenuItem getMenuById(@PathVariable String id);
	
	@PostMapping
	public void addMenuItem(@RequestBody MenuItem m);
	
	@DeleteMapping("/{id}")
	public void deleteMenuItem(@PathVariable String id);
	
	@PutMapping
	public void upodate(@RequestBody MenuItem m);
	
	
	
	@GetMapping("/users/all")
	public List<User> getAllUsers();
	
	@GetMapping("/users/{uId}/cart/{cId}")
	public Set<MenuItem> getUserById(@PathVariable String uId,@PathVariable String cId);

	@GetMapping("/users/{uId}/cart/{cId}")
	public Cart getUserCart(@PathVariable String uId,@PathVariable String cId);

	
	@PostMapping("/users/{uId}/cart/{cId}/{mId}")
	public void addUserCart(@PathVariable String uId,@PathVariable String cId,@PathVariable String mId);
	
	@DeleteMapping("/users/{uId}/cart/{cId}/{mId}")
	public void deleteUserCart(@PathVariable String uId,@PathVariable String cId,@PathVariable String mId);
	
	@PutMapping("/users/{uId}/cart/{cId}")
	public void updateUserCart(@PathVariable String uId,@PathVariable String cId,@RequestBody MenuItem m);
	

	@PostMapping
	public void addCartI(@RequestBody User u);

	@DeleteMapping("/{uid}")
	public void deleteCartItem(@PathVariable String uid);

	@PutMapping
	public void updateCartItem(@RequestBody User u);
}
