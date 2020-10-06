package designPattern.structural.facade;

import designPattern.structural.facade.dbconnection.MySqlDB;
import designPattern.structural.facade.dbconnection.OracleDB;
import designPattern.structural.facade.dbreport.DBReport;
import designPattern.structural.facade.dbreport.impl.MySqlDBReportImpl;
import designPattern.structural.facade.dbreport.impl.OracleDBReportImpl;

import java.sql.Connection;

public class HelperFacade {
    public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName){
        switch (dbType){
            case MYSQL:
                generateReportBasedOnReportType(reportType , new MySqlDBReportImpl(), tableName, MySqlDB.getMySqlDBConnection());
                break;
            case ORACLE:
                generateReportBasedOnReportType(reportType , new OracleDBReportImpl(), tableName, OracleDB.getOracleDBConnection());
                break;
        }

    }
    private static void generateReportBasedOnReportType(ReportTypes reportType , DBReport dbReport, String tableName , Connection con) {
        switch(reportType){
            case HTML:
                dbReport.generateHTMLReport(tableName, con);
                break;
            case PDF:
                dbReport.generatePDFReport(tableName, con);
                break;
        }
    }

    public enum DBTypes{
        MYSQL,ORACLE;
    }

    public  enum ReportTypes{
        HTML,PDF;
    }
}
