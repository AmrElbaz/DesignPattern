package designPattern.structural.facade.dbreport.impl;

import designPattern.structural.facade.dbreport.DBReport;

import java.sql.Connection;

public class MySqlDBReportImpl implements DBReport {
    
    @Override
    public void generatePDFReport(String tableName, Connection con) {
        System.out.println("generating MySqlPDFReport on table " + tableName);
    }

    @Override
    public void generateHTMLReport(String tableName, Connection con) {
        System.out.println("generating MySqlHTMLReport on table " + tableName);
    }
}
