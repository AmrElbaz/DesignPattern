package designPattern.structural.facade.dbconnection;

import java.sql.Connection;

public class MySqlDB {
    public static Connection getMySqlDBConnection(){
        //get MySql DB connection using connection parameters
        System.out.println("MySqlDBConnection has been established");
        return null;
    }

}
