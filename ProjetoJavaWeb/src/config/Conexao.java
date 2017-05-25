package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.flywaydb.core.Flyway;

public class Conexao {
	
	private static final String url = "jdbc:postgresql://192.168.0.3/projeto_java_web";
	private static final String usuario = "cresol";
	private static final String senha = "%%cresol";			
	private static Connection con = null;

	private static Connection getConnection() throws Exception {
		if (con == null) {
			Class.forName("org.postgresql.Driver").newInstance();
			con = DriverManager.getConnection(url + "?user=" + usuario + "&password=" + senha);
		}
		migrarBancoDados();
		return con;
	}
	
	public static Statement getStatement() throws Exception {
		return Conexao.getConnection().createStatement();
	}
	
	private static void migrarBancoDados() {
		try {
			Flyway fly = new Flyway();
			fly.setEncoding("ISO-8859-1");
			fly.setDataSource(url, usuario, senha);
			fly.setBaselineOnMigrate(true);
			fly.setIgnoreFailedFutureMigration(true);
			fly.setOutOfOrder(true);
			fly.migrate();
		} catch (Exception e) {
			System.out.println("** ERRO NA MIGRACAO DE BANCO DE DADOS **");
			e.printStackTrace();
			System.exit(0);
		}
	}
}