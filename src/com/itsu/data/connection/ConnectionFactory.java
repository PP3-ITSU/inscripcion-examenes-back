/**
 * 
 */
package com.itsu.data.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**Ruben Grauberger
 * clase que se encarga de realizar la configuracion, la conexion y
 * habilitar las transacciones de una base de datos
 * 
 */


public class ConnectionFactory {
	/**objeto encargado de mantener la conexion a la BD
	 * 
	 */
	private static Connection connection;
	/**objeto encargado de habilitar y ejecutar sentencias sql
	 * 
	 */
	
	private static Statement statement;
	/**metodo que permite conectarse a la BD
	 * 
	 * @return objeto Connection con la informacion de la BD conectada / null
	 * @throws ClassNotFoundException Exception generada al no cargar el driver de conexion
	 * @throws SQLException exception generada al no conectarse a la BD
	 */
	
	public static Connection conectar () throws ClassNotFoundException, SQLException {
		//paso1 cargar el driver de conexion
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establecer los datos de conexion
		String url="jdbc:mysql://localhost:3306/bdd190924";
		String user="root";
		String password ="12345";
		
		//paso 3 establecer la conexion
		connection = DriverManager.getConnection(url, user, password);
		statement = connection.createStatement(); //habiltando proceso para ejecutar sql
		
		return connection;
	}
	/**
	 * Permite ejecutar sentencia INSERT, UPDATE, DELETE
	 * @param sql  parametro con la sentencia a ejecutarse
	 * @return 1 en caso de ser exitoso o 0 en caso de error
	 * @throws SQLException excepcion generada al ejecutar la sentencia sql
	 */
	public static int ejecutarSQL(String sql) throws SQLException {
		System.out.println("Query:" + sql);
		
		
		return statement.executeUpdate(sql);
	}
	/**
	 * permite ejecutar sentencias SELECT
	 *  @param sql  parametro con la sentencia a ejecutarse
	 * @return objeto con la informacion obtenida de la sentencia select 
	 * @throws SQLException excepcion generada al ejecutar la sentencia sql
	 */
	
	public static  ResultSet ejecutarSQLSelect( String sql) throws SQLException {
		System.out.println("Query:"+sql);
		return statement.executeQuery(sql);
		
	}
	
}

