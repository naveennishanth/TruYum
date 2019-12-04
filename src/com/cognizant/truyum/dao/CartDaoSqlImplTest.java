/**
 * 
 */
package com.cognizant.truyum.dao;

/**
 * @author Naveen
 *
 */
public class CartDaoSqlImplTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CartDaoSqlImpl cartDaoSqlImpl = new CartDaoSqlImpl();
		cartDaoSqlImpl.removeCartItem(1, 5);
		System.out.println("MenuItem deleted");

	}

}
