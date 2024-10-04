/**
 * 
 */
package com.itsu.data.dao;
import java.sql.SQLException;
import java.util.List;

import com.itsu.data.entity.Usuario;


/**
 * 
 */
public interface UsuarioDAO {
	/**
	 * metodo que permite guardar registro de usuario 
	 * @param usuario
	 * @return 1 o mas en caso de ser exitoso, 0 en caso de no guardar 
	 * @throws SQLException excepcion generada en caso de error al ejecutar la sentencia SQl
	 */
	
	int guardar(Usuario usuario) throws SQLException;
	
	
	/**
	 * Metodo que permite actualizar registro de tipos de restaurantes.
	 * @param usuario objeto a actualizar
	 * @return 1 o mas en caso de ser exitoso, 0 en caso de no actualizarlo
	 * @throws SQLException 
	 * @throws sqlException generada en caso de error de ejecucion en la sentencia sql
	 * */
	
	int actualizar(Usuario usuario) throws SQLException;
	
	/**
	 * Metodo que permite eliminar un usuario
	 * @param usuario identificador del tipo de restaurante.
	 * @return 1 o mas en caso de ser exitoso, 0 en caso de no eliminarlo
	 * @throws SQLException 
	 */
	int eliminar(int idusuario) throws SQLException;
	/**
	 * Metodo que permite consultar los registros de usuarios
	 * @return lista de usuarios o null 
	 * @throws SQLException 
	 */
	List<Usuario> consultar() throws SQLException;
	/**
	 * metodo que permite consultar un registro de tipo usuario por identificador
	 * @param idusuario identificador de usuario
	 * @return usuario consultado o null.
	 * @throws SQLException 
	 */
	


	Usuario consultarPorId(int idUsuario) throws SQLException;

}
