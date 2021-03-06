package com.jdbc.day1.main;

import java.sql.SQLException;

import com.jdbc.day1.classes.*;

/**
 * 
 * @author Viswanatha
 *
 */

public class HelloJdbcMainCls {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		String mysqlFileName = "mysqlconfig.properties";
		String sqlServerFileName = "sqlserverconfig.properties";
		String sqlQuery = "SELECT * FROM city";
		DataStoreDemo _dataStore;
		
		_dataStore = new MySqlDemo(mysqlFileName);
		performDataStoreActions(_dataStore, sqlQuery);
		
		_dataStore = new SqlServerDemo(sqlServerFileName);
		performDataStoreActions(_dataStore, sqlQuery);

	}

	/**
	 * 
	 * @param _dataStore
	 * @param sqlQuery
	 * @throws SQLException
	 */
	private static void performDataStoreActions(DataStoreDemo _dataStore, String sqlQuery) throws SQLException{
		_dataStore
		.getDataFromStore(sqlQuery)
		.displayData();
	}
	
}

/*
String odbcDriverName = "org.gjt.mm.mysql.Driver";
		
		Object theClass = Class.forName(odbcDriverName);
		System.out.println(theClass.toString());
		
		System.out.printf("\nHello JDBC!");

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		      System.out.println("\ncom.microsoft.sqlserver.jdbc.SQLServerDriver found");
		    } catch (ClassNotFoundException cnfe) {
		      System.out.println("\n\nError: com.microsoft.sqlserver.jdbc.SQLServerDriver not found");
		    }
		System.out.printf("\nHello JDBC-ODBC!");
*/



//stmt = _datastoreConnection.createStatement();
//rs = stmt.executeQuery(SQL);
		
//ConfigurationReader mySqlHelper = new ConfigurationReader(propFileName);
//mySqlHelper.readDataStoreProperties();

//System.out.printf("\n\nDriver Name: %s\nConnection Url: %s", 
		//mySqlHelper.getDriverName(),
		//mySqlHelper.getConnectionUrl());
/*
String mySqlDriverName = "org.gjt.mm.mysql.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/world?user=root&password=sample123$";
Class.forName(mySqlDriverName);
Connection con = DriverManager.getConnection(connectionUrl);
Statement stmt = null;
ResultSet rs = null;
*/

// Create and execute an SQL statement that returns some data.
/*		
String SQL = "SELECT * FROM city";
		stmt = con.createStatement();
		rs = stmt.executeQuery(SQL);
*/
		
		
/*
String connectionUrl = "jdbc:sqlserver://LORDKRISHNA-PC:1433;databaseName=world;user=sa;password=sample123$;";
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection con = DriverManager.getConnection(connectionUrl);
Statement stmt = null;
ResultSet rs = null;

// Create and execute an SQL statement that returns some data.
String SQL = "SELECT * FROM city";
stmt = con.createStatement();
rs = stmt.executeQuery(SQL);

// Iterate through the data in the result set and display it.
while (rs.next()) {
	System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
}*/

/*
//Data Store Variables.
Manager _datastoreManager;
Connection _datastoreConnection;
ResultSet _resultSet;

_datastoreManager = new Manager(mysqlFileName);
_datastoreConnection = _datastoreManager.getConnection();
_resultSet = Communicator.getResultSet(_datastoreConnection, sqlQuery);
DisplayData.displayData(_resultSet);

_datastoreManager = new Manager(sqlServerFileName);
_datastoreConnection = _datastoreManager.getConnection();
_resultSet = Communicator.getResultSet(_datastoreConnection, sqlQuery);
DisplayData.displayData(_resultSet);
	*/
