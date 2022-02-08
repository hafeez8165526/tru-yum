package com.cognizant.truyum.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.truyum.model.MenuItem;

@Repository
public class MenuItemDaoCollectionImpl implements MenuItemDao {

	private static ApplicationContext context;
	private static List<MenuItem> menuItemList;

	static {
		context = new ClassPathXmlApplicationContext("truyum.xml");
		menuItemList = (List<MenuItem>) context.getBean("menuItemList");
	}

	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		return MenuItemDaoCollectionImpl.menuItemList;
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() {

		List<MenuItem> filteredList = new ArrayList<>();
		Date now = new Date();

		for (MenuItem obj : MenuItemDaoCollectionImpl.menuItemList) {
			if (obj.isActive() && now.compareTo(obj.getDateOfLaunch()) >= 0) {
				filteredList.add(obj);
			}
		}

		return filteredList;
		
	}

	@Override
	public MenuItem getMenuItem(long menuItemId) {
		return getMenuItemListAdmin().stream().filter(m -> m.getId() == menuItemId).findAny().orElse(null);
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {

		MenuItem m = getMenuItem(menuItem.getId());
		int index = menuItemList.indexOf(m);
		menuItemList.set(index, menuItem);

	}

	public void save(MenuItem menuItem) {
		menuItemList.add(menuItem);
	}

}
