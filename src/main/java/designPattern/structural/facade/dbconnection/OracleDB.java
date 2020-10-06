package designPattern.structural.facade.dbconnection;

import java.sql.Connection;

public class OracleDB {

    public static Connection getOracleDBConnection(){
        //get Oracle DB connection using connection parameters
        System.out.println("OracleDBConnection has been established");
        return null;
    }

}
