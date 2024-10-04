package com.itsu.data.dao;

import java.sql.SQLException;
import java.util.List;

import com.itsu.data.entity.Mesas_Examenes;

public interface Mesas_ExamenesDAO {
	
		/**
		 * metodo que permite guardar registro de usuario 
		 * @param usuario
		 * @return 1 o mas en caso de ser exitoso, 0 en caso de no guardar 
		 * @throws SQLException 
		 */
		
		int guardar(Mesas_Examenes mesas_Examenes) throws SQLException;
		/**
		 * Metodo que permite actualizar registro de tipos de restaurantes.
		 * @param usuario objeto a actualizar
		 * @return 1 o mas en caso de ser exitoso, 0 en caso de no actualizarlo
		 * @throws sqlException generada en caso de error de ejecucion en la sentencia sql
		 * */
		
		int actualizar(Mesas_Examenes mesas_Examenes);
		
		/**
		 * Metodo que permite eliminar un usuario
		 * @param usuario identificador del tipo de restaurante.
		 * @return 1 o mas en caso de ser exitoso, 0 en caso de no eliminarlo
		 */
		int eliminar(int idMesaExamanes);
		/**
		 * Metodo que permite consultar los registros de usuarios
		 * @return lista de usuarios o null 
		 */
		List<Mesas_Examenes> consultar();
		/**
		 * metodo que permite consultar un registro de tipo usuario por identificador
		 * @param idusuario identificador de usuario
		 * @return usuario consultado o null.
		 */
		Mesas_Examenes cosultarPorId(int idMesaexamenes);

	}
	


