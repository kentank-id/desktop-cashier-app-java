/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.cj.jdbc.MysqlDataSource;

/**
 *
 * @author Kentank-ID
 */
public class koneksiMYSQL {
    static Connection con;
    public static Connection getConnection()
    {
        if(con==null)
        {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("penjualan");
            data.setUser("root");
            data.setPassword("");
            
            try
            {
                con = data.getConnection();
                System.out.println("Koneksi Berhasil");
            }
            catch(SQLException e)
            {
                System.out.println("Gagal Konek "+e.toString());
            }
            
        }
        return con;
    }
    public static void main(String[] args) {
        getConnection();
    }
}
