package io.github.jbarriospolo.movie.movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionController {
    private static final String URL = "jdbc:postgresql://localhost:5432/movies";
    private static final String USER = "admin";
    private static final String PASS = "1234";

    public static Connection getConexion() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException("Error al conectar a la base de datos", e);
        }
    }
}
