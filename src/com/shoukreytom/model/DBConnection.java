package com.shoukreytom.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnection {

    private static Connection con = null;

    public static Connection getConnection() {
        try {
            con = DriverManager.getConnection("jdbc:sqlite:data.db");
            PreparedStatement ps = con.prepareStatement("CREATE TABLE IF NOT EXISTS topics(INT id, " +
                    "TEXT topic, TEXT description)");
            ps.execute();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
