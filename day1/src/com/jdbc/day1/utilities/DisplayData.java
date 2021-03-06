package com.jdbc.day1.utilities;

import java.sql.*;

public class DisplayData {

	/**
	 * 
	 * @param _resultSet
	 * @throws SQLException
	 */
	public static void displayData(ResultSet _resultSet) throws SQLException{
		// Iterate through the data in the result set and display it.
		while (_resultSet.next()) {
			System.out.printf("\n%s %s %s", _resultSet.getString(1), 
										  _resultSet.getString(2), _resultSet.getString(3));
		}
	}
	
}
