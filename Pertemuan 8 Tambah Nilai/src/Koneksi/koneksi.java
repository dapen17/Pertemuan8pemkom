/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Koneksi;

/**
 *
 * @author ACER
 */
import java.sql.*;
import javax.swing.JOptionPane;




public class koneksi {
    Connection cn;

    public static Connection BukaKoneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/mahasiswa", "root", "");
            return cn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
     
}
