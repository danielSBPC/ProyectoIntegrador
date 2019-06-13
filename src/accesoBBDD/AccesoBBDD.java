package accesoBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoBBDD {
	
	private String driver;
	private String url;
	
	public AccesoBBDD() {
		this.driver = "org.sqlite.JDBC";
		this.url = "jdbc:sqlite:dbSQLite/GIMNASIO.db";
	}
	
	public Connection getConexion() throws ClassNotFoundException, SQLException {
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url);
		return con;
	}
}
