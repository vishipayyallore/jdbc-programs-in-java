package com.jdbc.day1.classes;

import java.io.*;
import java.sql.*;
import com.jdbc.day1.utilities.DataStoreCommunicator;
import com.jdbc.day1.utilities.DisplayData;

/**
 * 
 * @author Viswanatha
 *
 */

public class DataStoreDemo {

	//Variables.
	private DataStoreCommunicator _datastoreCommunicator;
	private ResultSet _resultSet;
	
	/**
	 * 
	 * @param propertiesFileName
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public DataStoreDemo(String propertiesFileName) throws ClassNotFoundException, IOException {
		_datastoreCommunicator = new DataStoreCommunicator(propertiesFileName);
	}
	
	/**
	 * 
	 * @param sqlQuery
	 * @return
	 * @throws SQLException
	 */
	public DataStoreDemo getDataFromStore(String sqlQuery) throws SQLException{
		_resultSet = _datastoreCommunicator.getData(sqlQuery);
		return this;
	}
	
	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	public DataStoreDemo displayData() throws SQLException{
		DisplayData.displayData(_resultSet);
		return this;
	}
	
}
