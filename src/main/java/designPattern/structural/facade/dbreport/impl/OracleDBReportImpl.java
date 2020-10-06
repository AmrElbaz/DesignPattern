package designPattern.structural.facade.dbreport.impl;

import designPattern.structural.facade.dbreport.DBReport;

import java.sql.Connection;

public class OracleDBReportImpl implements DBReport {
   
    @Override
    public void generatePDFReport(String tableName, Connection con) {
        System.out.println("generating OraclePDFReport on table " + tableName);
    }

    @Override
    public void generateHTMLReport(String tableName, Connection con) {
        System.out.println("generating OracleHTMLReport on table " + tableName);
    }
}
