package com.utilities.datastore.configuration;

import java.io.*;
import java.util.*;

public class ConfigurationReader {
	
	//Variables.
	private InputStream inputStream;
	private Properties _properties;
	private String _driverName;
	private String _connectionString;
	
	/**
	 * 
	 * @param propertyFileName
	 * @throws FileNotFoundException
	 */
	public ConfigurationReader(String propertyFileName) throws FileNotFoundException{
		inputStream = getClass().getClassLoader().getResourceAsStream(propertyFileName);
		if (inputStream == null){
			throw new FileNotFoundException( String.format( "Property file '{0}' not found in the classpath", propertyFileName) );
		}
		_properties = new Properties();
	}
	
	/**
	 * 
	 * @throws IOException
	 */
	public ConfigurationReader readDataStoreProperties() throws IOException{
		_properties.load(inputStream);
		System.out.printf("\n\nLoaded the properties file.");
		
		_driverName = _properties.getProperty("DriverName");
		_connectionString = _properties.getProperty("ConnectionUrl");
		_connectionString = String.format(_connectionString, 
				_properties.getProperty("ServerInformation"),
				_properties.getProperty("Database"),
				_properties.getProperty("UserName"),
				_properties.getProperty("Password"));
		
		return this;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String getDriverName(){
		return _driverName;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getConnectionUrl(){
		return _connectionString;
	}
	
}
