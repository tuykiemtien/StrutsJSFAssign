/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Nguyen Ngoc Son
 */
public class DataAccess {
     public DataAccess() {
    }
    ;
    public static DataAccess instance = new DataAccess();

    public static DataAccess getInstance() {
        return instance;
    }
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        String url = "jdbc:sqlserver://localhost:1433;"
                + "databaseName=Struts;user=sa;password=12345678";
        return DriverManager.getConnection(url);

    }

    public PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException {

        PreparedStatement pstm = getConnection().prepareStatement(sql);
        return pstm;
    }
    
    //kiểm tra kết nối với dbs
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      
       Connection demo = getInstance().getConnection();
       System.out.println(demo.getMetaData().getDatabaseProductName());
    }

}
