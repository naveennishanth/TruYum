/**
 * 
 */
package com.cognizant.truyum.dao;

import com.cognizant.truyum.model.MenuItem;

/**
 * @author Naveen
 *
 */
public class MenuItemDaoSqlImplTest {
	public static void main(String args[]) {
		
		MenuItemDaoSqlImpl menuItemDaoSqlImpl = new MenuItemDaoSqlImpl();
		MenuItem menuItem = menuItemDaoSqlImpl.getMenuItem(3);
		System.out.println("MenuItem:" + menuItem);

	}
}
