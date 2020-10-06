package designPattern.structural.facade;

import designPattern.structural.facade.dbconnection.MySqlDB;
import designPattern.structural.facade.dbconnection.OracleDB;
import designPattern.structural.facade.dbreport.DBReport;
import designPattern.structural.facade.dbreport.impl.MySqlDBReportImpl;
import designPattern.structural.facade.dbreport.impl.OracleDBReportImpl;

import java.sql.Connection;

public class App {

    /*
    *
    * Provide a unified interface to a set of interfaces in a subsystem.
    *       therefore it hides the complexities of the subsystem from the client.
    * Facade defines a higher-level interface that makes the subsystem easier to use.
    *
    * */
    public static void main(String[] args) {
        String tableName="Employee";

        //generating MySql HTML report and Oracle PDF report without using Facade
        Connection con = MySqlDB.getMySqlDBConnection();
        DBReport mySqlHelper = new MySqlDBReportImpl();
        mySqlHelper.generateHTMLReport(tableName, con);
        System.out.println("================================================================================");
        Connection con1 = OracleDB.getOracleDBConnection();
        DBReport oracleHelper = new OracleDBReportImpl();
        oracleHelper.generatePDFReport(tableName, con1);
        System.out.println("================================================================================");
        //generating MySql HTML report and Oracle PDF report using Facade
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
        System.out.println("================================================================================");
    }
}
