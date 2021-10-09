/*
 * ---------------------------------------------------------------------
 *  Copyright (c) CDM-SW-SYSTEMS. All rights reserved.
 *  Licensed under the SriLankan Information License.
 *  See LICENSE .txt in the project root for license. information.
 * ----------------------------------------------------------------------
 */

package utils;

import db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Charith Darshana <darshanacharith4@gmail.com>
 * @since 2021-10-09 10:44 AM
 */
public class CrudUtils {
        private static PreparedStatement getPreparedStatement(String sql, Object... data) throws SQLException, ClassNotFoundException {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement stm = connection.prepareStatement(sql);
            for (int i = 0; i < data.length; i++) {
                stm.setObject(i+1,data[i]);
            }
            return stm;
        }

    }
