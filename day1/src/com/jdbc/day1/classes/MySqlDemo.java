package com.jdbc.day1.classes;

import java.io.IOException;
import java.sql.SQLException;

/**
 * 
 * @author Viswanatha
 *
 */

public class MySqlDemo extends DataStoreDemo {
	
	/**
	 * 
	 * @param propertiesFileName
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public MySqlDemo(String propertiesFileName) throws ClassNotFoundException, IOException{
		super(propertiesFileName);
	}
	
	/**
	 * 
	 * @param propertiesFileName
	 * @param sqlQuery
	 * @throws SQLException 
	 */
	public MySqlDemo getDataFromStore(String sqlQuery) throws SQLException{
		super.getDataFromStore(sqlQuery);
		return this;
	}
	
	/**
	 * @throws SQLException 
	 * 
	 */
	public MySqlDemo displayData() throws SQLException{
		super.displayData();
		return this;
	}
	
}
