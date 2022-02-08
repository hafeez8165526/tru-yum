package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.bean.MenuItem;
import com.cts.proxy.truYumMenuItemProxy;

@Controller
public class MenuController {
	@Autowired
	private truYumMenuItemProxy proxy;
	
	@RequestMapping("/")
	public String getAll(Model m) {
		m.addAttribute("MenuItemList",proxy.getMenuItems());
		return "index";
	}
	@RequestMapping("/viewItems/{uId}/{cId}")
	public String viewItems(@PathVariable String uId,@PathVariable String cId,Model m) {
		m.addAttribute("MenuItemList",proxy.getMenuItems());
		m.addAttribute("uid", uId);
		m.addAttribute("cid", cId);
		return "viewItems";
	}
	@RequestMapping(value="/addMenuItem", method = RequestMethod.POST)
	public String addNewMenuItem(@ModelAttribute MenuItem m) {
		proxy.addMenuItem(m);
		return "redirect:/";
	}
	@RequestMapping(value="/addnewMenuItem")
	public String addNewEmp() {
		return "addEmp";
	}
	@RequestMapping(value="/index")
	public String Home() {
		return "index";
	}
	@RequestMapping(value="/user")
	public String showCart(Model m) {
		m.addAttribute("user",proxy.getAllUsers());
		return "User";
	}
	
	@RequestMapping(value="/updateMenuItem/{id}")
	public String updateEmp(@PathVariable String id,Model m) {
		m.addAttribute("MenuItem",proxy.getMenuById(id));
		return "updateEmp";
	}
	@RequestMapping(value="/{uId}/cart/{cId}")
	public String showCart(@PathVariable String uId,@PathVariable String cId,Model m) {
		m.addAttribute("cartItems",proxy.getUserCart(uId, cId).getMenuItemList());
		m.addAttribute("total", proxy.getUserCart(uId, cId).getTotal());
		m.addAttribute("uid", uId);
		m.addAttribute("cid", cId);
		return "cart";
	}
	@RequestMapping(value="/addCartItem/{uId}/cart/{cId}/{mId}",method = RequestMethod.GET)
	public String addCartItem(@PathVariable String uId,@PathVariable String cId,@PathVariable String mId,Model m) {
		proxy.addUserCart(uId, cId, mId);
		return "redirect:/{uId}/cart/{cId}";
	}
	@RequestMapping(value="/delete/{uId}/cart/{cId}/{mId}",method = RequestMethod.GET)
	public String removeCartItem(@PathVariable String uId,@PathVariable String cId,@PathVariable String mId,Model m) {
//		m.addAttribute("cartItems",proxy.getUserById(uId, cId));
		
		proxy.deleteUserCart(uId, cId, mId);
		return "redirect:/{uId}/cart/{cId}";
	}
	@RequestMapping(value="/delete/{id}",method = RequestMethod.GET)
	public String deleteMenuItem(@PathVariable String id) {
		proxy.deleteMenuItem(id);
		return "redirect:/";
	}
//	@RequestMapping(value="/",method = RequestMethod.POST)
//	public String addEmp(@ModelAttribute emp emp) {
//		proxy.createEmp(emp);
//		return "redirect:/";
//	}
	@RequestMapping(value="/update",method = RequestMethod.POST)
	public String update(@ModelAttribute("MenuItem") MenuItem m) {
		proxy.upodate(m);
		return "redirect:/";
	}
	
	/** 
	 * SPring Security
	 */
//	@GetMapping("/hello")
//	public String helloWorld() {
//		return "User Panel";
//	}
//	@RequestMapping("/admin")
//	public String helloWorld1() {
//		return "index";
//	}
//	@GetMapping("/403")
//	public String errorPage() {
//		return "You are not authorized!";
//	}

}
