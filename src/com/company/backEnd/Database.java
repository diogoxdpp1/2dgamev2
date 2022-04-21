package com.company.backEnd;
import java.sql.Connection;
import java.sql.DriverManager;
public class Database {

    //the location of the access database
    private static final String DatabaseLocation = System.getProperty("user.dir") + "\\2DGame Database.accdb";

    //Connects to the access database
    public static Connection getConnection() {

        try {
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://" + DatabaseLocation, "", "");
            return con;
        } catch (Exception e) {
            System.out.println("Error in database connection" + e);
        }
        return null;
    }



}
