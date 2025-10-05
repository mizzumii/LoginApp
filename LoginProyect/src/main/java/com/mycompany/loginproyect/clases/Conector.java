package com.mycompany.loginproyect.clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {

    private static final String URL = "jdbc:mysql://localhost:3306/sistema_usuarios";
    private static final String USER = "root";
    private static final String PASS = "admin";

    public static Connection conectar() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexion exitosa");
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos:");
            System.out.println(e.getMessage());
        }
        return conexion;
    }
}