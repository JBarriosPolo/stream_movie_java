package io.github.jbarriospolo.movie.movie;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConsultasDB {
    public static boolean consulta(String tabla, String campo, String arg) {
        String sql = "SELECT * FROM " + tabla + " WHERE " + campo + " = ?";
        try (Connection conexion = ConexionController.getConexion();
             PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, arg);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next(); // Retorna true si hay al menos un resultado.
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al realizar la consulta", e);
        }
    }
}
