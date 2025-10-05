package com.mycompany.loginproyect.clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuarios {

    public boolean registrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nombre, apellido, email, username, clave, rol) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conector.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3, usuario.getEmail());
            ps.setString(4, usuario.getUsername());
            ps.setString(5, usuario.getClave());
            ps.setString(6, usuario.getRol());

            ps.executeUpdate();
            System.out.println("Usuario registrado correctamente.");
            return true;

        } catch (SQLException e) {
            System.out.println("Error al registrar usuario: " + e.getMessage());
            return false;
        }
    }

    public Usuario validarUsuario(String username, String clave) {
        String sql = "SELECT * FROM usuarios WHERE username = ? AND clave = ?";
        try (Connection conn = Conector.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, clave);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setEmail(rs.getString("email"));
                usuario.setUsername(rs.getString("username"));
                usuario.setRol(rs.getString("rol"));
                return usuario;
            } else {
                System.out.println("Usuario o contraseña incorrectos.");
                return null;
            }

        } catch (SQLException e) {
            System.out.println("Error al validar usuario: " + e.getMessage());
            return null;
        }
    }
}