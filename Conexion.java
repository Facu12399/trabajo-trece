package trabajotrece;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "Fnm20102017");
			System.out.println("Conexion OK");
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el contolador");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("Error al cargar el contolador");
			e.printStackTrace();
		}
		
	}

}
