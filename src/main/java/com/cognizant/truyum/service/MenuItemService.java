package com.cognizant.truyum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.Exceptions.MenuItemNotFoundException;
import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.model.MenuItem;

@Service
public class MenuItemService {
	@Autowired
	private MenuItemDao menuItemDao;

	public List<MenuItem> getAllMenuItems() {
		return menuItemDao.getMenuItemListCustomer();
	}

	public void modifyMenuItem(MenuItem menuItem) throws MenuItemNotFoundException {
		getMenuItem(menuItem.getId());
		menuItemDao.modifyMenuItem(menuItem);
	}

	public MenuItem getMenuItem(long id) throws MenuItemNotFoundException {
		MenuItem menuItem = menuItemDao.getMenuItem(id);
		if (menuItem == null)
			throw new MenuItemNotFoundException();
		return menuItem;
	}

	public void save(MenuItem menuItem) {
		menuItemDao.save(menuItem);
	}

}