package com.utilities.datastore.communications;

import java.sql.*;

/**
 * 
 * @author Viswanatha
 *
 */

public class Communicator {

	//Variables.
	private static Statement _statement;
	
	public static ResultSet getResultSet(Connection datastoreConnection, String sqlQuery) throws SQLException{
		_statement = datastoreConnection.createStatement();
		return _statement.executeQuery(sqlQuery);
	}
	
}
