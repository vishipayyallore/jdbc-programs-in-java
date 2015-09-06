package com.utilities.datastore.interfaces;

import java.sql.*;

/**
 * 
 * @author Viswanatha
 *
 */

public interface IManager {

	Connection getConnection() throws SQLException;
	void closeConnection() throws SQLException;
	
}
