/*
 * ---------------------------------------------------------------------
 *  Copyright (c) CDM-SW-SYSTEMS. All rights reserved.
 *  Licensed under the SriLankan Information License.
 *  See LICENSE .txt in the project root for license. information.
 * ----------------------------------------------------------------------
 */

package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Charith Darshana <darshanacharith4@gmail.com>
 * @since 2021-10-09 10:11 AM
 */
public class DBConnection {
    private static DBConnection dbConnection;
    private Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "1234");
    }

    public static void getInstance() throws Exception {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
    }
}
