package com.cognizant.truyum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.truyum.Exceptions.MenuItemNotFoundException;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.service.MenuItemService;

@RestController
@RequestMapping("/menu-items")
public class MenuItemController {

	@Autowired
	private MenuItemService menuItemService;

	@GetMapping
	public List<MenuItem> getAllMenuItems() {
		return menuItemService.getAllMenuItems();
	}

	@GetMapping("/{id}")
	public MenuItem getMenuItem(@PathVariable long id) throws MenuItemNotFoundException {
		return menuItemService.getMenuItem(id);
	}

	@PutMapping()
	public void updateMenuItem(@RequestBody MenuItem menuItem) throws MenuItemNotFoundException {
		menuItemService.modifyMenuItem(menuItem);
	}

	@PostMapping
	public void save(@RequestBody MenuItem menuItem) throws MenuItemNotFoundException {
		menuItemService.save(menuItem);
	}

}
