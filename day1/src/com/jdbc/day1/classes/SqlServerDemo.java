package com.jdbc.day1.classes;

import java.io.IOException;
import java.sql.SQLException;

/**
 * 
 * @author Viswanatha
 *
 */

public class SqlServerDemo extends DataStoreDemo {

	/**
	 * 
	 * @param propertiesFileName
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public SqlServerDemo(String propertiesFileName) throws ClassNotFoundException, IOException{
		super(propertiesFileName);
	}
	
	/**
	 * 
	 */
	public SqlServerDemo getDataFromStore(String sqlQuery) throws SQLException{
		super.getDataFromStore(sqlQuery);
		return this;
	}
	
	/**
	 * 
	 */
	public SqlServerDemo displayData() throws SQLException{
		super.displayData();
		return this;
	}
	
}
