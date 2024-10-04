/**
 * 
 */
package com.itsu.data.dao;

import java.sql.SQLException;
import java.util.List;

import com.itsu.data.entity.Carrera;

/**
 * 
 */
public interface CarreraDAO {
	
		/**
		 * metodo que permite guardar registro de usuario 
		 * @param usuario
		 * @return 1 o mas en caso de ser exitoso, 0 en caso de no guardar 
		 * @throws SQLException 
		 */
		
		int guardar(Carrera carrera) throws SQLException;
		/**
		 * Metodo que permite actualizar registro de tipos de restaurantes.
		 * @param usuario objeto a actualizar
		 * @return 1 o mas en caso de ser exitoso, 0 en caso de no actualizarlo
		 * @throws sqlException generada en caso de error de ejecucion en la sentencia sql
		 * */
		
		int actualizar(Carrera carrera);
		
		/**
		 * Metodo que permite eliminar un usuario
		 * @param usuario identificador del tipo de restaurante.
		 * @return 1 o mas en caso de ser exitoso, 0 en caso de no eliminarlo
		 */
		int eliminar(int idCarrera);
		/**
		 * Metodo que permite consultar los registros de usuarios
		 * @return lista de usuarios o null 
		 */
		List<Carrera> consultar();
		/**
		 * metodo que permite consultar un registro de tipo usuario por identificador
		 * @param idusuario identificador de usuario
		 * @return usuario consultado o null.
		 */
		Carrera cosultarPorId(int idCarrera);

	}

	

