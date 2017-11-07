package main.con;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import personas.*;

public class Coneccion {
	
	private Connection conexion;
	private Statement S;
	private String Url = "jdbc:mysql://localhost:3306/LosTresPino";
	private String User = "root";
	private String Pass = "fcua29hd-";
	
	public Coneccion() {
		try {
			conexion = DriverManager.getConnection(Url,User,Pass);
			S = conexion.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	public void InsertarPersona(Persona perso) {
		
		String Prepara= "insert into tabla_1 (rut,nombre,apellidop,apellidom,telefono"
				+ ",celular,correo,correo_respaldo,) value ()");
		
	}
	

}
