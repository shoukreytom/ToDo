package com.shoukreytom.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {

    private static Connection con = null;

    public static Connection getConnection() {
        try {
            con = DriverManager.getConnection("jdbc:sqlite:data.db");
            Statement statement = con.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS topics(id INTEGER PRIMARY KEY AUTOINCREMENT,start TEXT,end TEXT,topic TEXT," +
                    "description TEXT)");
            statement.execute("CREATE TABLE IF NOT EXISTS projects(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "start TEXT,end TEXT,project TEXT,description TEXT)");
//            PreparedStatement reportsTable = con.prepareStatement("CREATE TABLE IF NOT EXISTS topics(id INTEGER, " +
//                    "start TEXT, end TEXT, topic TEXT, description TEXT)");
        }catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
