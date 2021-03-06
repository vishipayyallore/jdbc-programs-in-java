package com.jdbc.day1.utilities;

import com.utilities.datastore.communications.Communicator;
import com.utilities.datastore.connection.Manager;
import java.io.*;
import java.sql.*;

/**
 * 
 * @author Viswanatha
 *
 */

public class DataStoreCommunicator {
	
	//Data Store Variables.
	Manager _datastoreManager;
	Connection _datastoreConnection;
	ResultSet _resultSet;
	
	/**
	 * 
	 * @param propertyFileName
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public DataStoreCommunicator(String propertyFileName) throws ClassNotFoundException, IOException{
		_datastoreManager = new Manager(propertyFileName);
	}
	
	/**
	 * 
	 * @param sqlQuery
	 * @return
	 * @throws SQLException
	 */
	public ResultSet getData(String sqlQuery) throws SQLException{
		_datastoreConnection = _datastoreManager.getConnection();
		return Communicator.getResultSet(_datastoreConnection, sqlQuery);
	}
	
}
