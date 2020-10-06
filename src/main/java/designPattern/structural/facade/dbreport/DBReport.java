package designPattern.structural.facade.dbreport;

import java.sql.Connection;

public interface DBReport {
    public void generatePDFReport(String tableName, Connection con);
    public void generateHTMLReport(String tableName, Connection con);
}
