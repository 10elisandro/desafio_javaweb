package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conexao {
	
	private static final String url = "jdbc:postgresql://192.168.0.3/projeto_java_web";
	private static final String usuario = "USUARIO";
	private static final String senha = "SENHA";			
	private static Connection con = null;

	private static Connection getConnection() throws Exception {
		if (con == null) {
			Class.forName("org.postgresql.Driver").newInstance();
			con = DriverManager.getConnection(url + "?user=" + usuario + "&password=" + senha);
		}
		return con;
	}
	
	public static Statement getStatement() throws Exception {
		return Conexao.getConnection().createStatement();
	}
}