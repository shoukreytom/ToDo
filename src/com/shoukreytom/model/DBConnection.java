package com.shoukreytom.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static Connection con = null;

    public static Connection getConnection() {
        try {
            con = DriverManager.getConnection("sqlit://data.db");
        }catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
