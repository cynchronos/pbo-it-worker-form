package pbo_responsi_5210411399;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class KoneksiDB {
    private static Connection koneksi;
    
    public static Connection getKoneksi() {
        try {
            String url = "jdbc:mysql://localhost:3306/db_pegawai";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            koneksi = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi Berhasil");
            
        } catch (SQLException e) {
            System.out.println("Koneksi Error: " + e.getMessage());
        }
        
        return koneksi;
    }
}
