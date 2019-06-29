/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.unmsm.sgojp.api.conexion;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LaboratorioFISI
 */
public class Conexion {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/bdlabocalificado3";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static Connection _connection = null;
    private static Conexion instancia = null;

    private Conexion() {
        initialize();
    }

    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    public Connection getConnectionBD() {
        return _connection;
    }

    public static Connection initialize() {
        try {
            DriverManager.registerDriver(new Driver());
            _connection = DriverManager.getConnection(URL + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();;
            System.out.println(
                    "Error al registrar el controlador"
                    + e.getMessage());
        }
        return _connection;
    }

    public static void main(String[] args) {
        Conexion jdbc = new Conexion();
        jdbc.initialize();
        System.out.println("conectado");
    }
}
