package com.utilities.datastore.connection;


import java.io.*;
import java.sql.*;
import com.utilities.datastore.configuration.*;
import com.utilities.datastore.interfaces.*;

/**
 * 
 * @author Viswanatha
 *
 */

public class Manager implements IManager {

	//Variables
	private Connection _datastoreConnection = null;
	private ConfigurationReader _configurationReader;
	
	/**
	 * 
	 * @param propertyFileName
	 * @throws IOException
	 * @throws ClassNotFoundException 
	 */
	public Manager(String propertyFileName) throws IOException, ClassNotFoundException{
		_configurationReader = new ConfigurationReader(propertyFileName)
				.readDataStoreProperties();
	}

	@Override
	public Connection getConnection() throws SQLException {
		if(_datastoreConnection == null){
			try{
				//Loading the Driver Class.
				Class.forName(_configurationReader.getDriverName());
			} catch (ClassNotFoundException e) {
				System.out.println(e.toString());
			}
			_datastoreConnection = DriverManager.getConnection(_configurationReader.getConnectionUrl());
		}
		return _datastoreConnection;
	}

	@Override
	public void closeConnection() throws SQLException {
		if(_datastoreConnection != null){
			_datastoreConnection.close();
			_datastoreConnection = null;
		}
	}
	
}
