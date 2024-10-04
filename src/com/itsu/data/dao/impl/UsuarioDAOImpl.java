	/**
 * 
 */
package com.itsu.data.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.itsu.data.connection.ConnectionFactory;
import com.itsu.data.dao.UsuarioDAO;
import com.itsu.data.entity.Usuario;



/**
 * clase que implementa el CRUD y otross metodos personalizados de transacciones 
 * a la BD en la tabla USUARIO
 */
public class UsuarioDAOImpl implements UsuarioDAO {
	
	static {
		try { ConnectionFactory.conectar();
	} catch (ClassNotFoundException| SQLException e) {
		e.printStackTrace();
		System.err.println("Error de bdd: " + e.getMessage());
	}
		// TODO: handle exception
	}

	@Override
	public int guardar(Usuario usuario) throws SQLException {
	    String sql = "INSERT INTO bdd190924.usuario (nombreUsuario, apellidoUsuario, contraseñaUsuario, telefonoUsuario,"
	    		+ "emailUsuario, dniUsuario, direccionUsuario, paisUsuario, fechaNacimientoUsuario ,"
	    		+ " Rol_idRol, Carrera_idCarrera) "            + "VALUES ('" + usuario.getNombreUsuario() + "','" 
	            + usuario.getApellidoUsuario() + "','" 
	            + usuario.getContraseñaUsuario() + "','" 
	            + usuario.getTelefonoUsuario() + "','" 
	            + usuario.getEmailUsuario() + "','" 
	            + usuario.getDniUsuario() + "','" 
	            + usuario.getDireccionUsuario() + "','" 
	            + usuario.getPaisUsuario() + "','"
	            + usuario.getFechaNacimientoUsuario() + "',"
	            + usuario.getIdRol().getIdRol()+","
	            + usuario.getIdCarrera().getIdCarrera() + ");";
	    
	    int ejecutado = ConnectionFactory.ejecutarSQL(sql);
	    return ejecutado;
	}


	@Override
	
		public int actualizar(Usuario usuario) throws SQLException {
		    // TODO Auto-generated method stub
		    String sql = "UPDATE usuario SET nombreUsuario = '" + usuario.getNombreUsuario() + 
		                 "', apellidoUsuario = '" + usuario.getApellidoUsuario() + 
		                 "', contraseñaUsuario = '" + usuario.getContraseñaUsuario() + 
		                 "', telefonoUsuario = '" + usuario.getTelefonoUsuario() + 
		                 "', emailUsuario = '" + usuario.getEmailUsuario() + 
		                 "', dniUsuario = '" + usuario.getDniUsuario() + 
		                 "', direccionUsuario = '" + usuario.getDireccionUsuario() + 
		                 "', paisUsuario = '" + usuario.getPaisUsuario() + 
		                 "', fechaNacimientoUsuario = '" + usuario.getFechaNacimientoUsuario() + 
		                 "', Rol_idRol = " + usuario.getIdRol().getIdRol() + 
		                 ", Carrera_idCarrera = " + usuario.getIdCarrera().getIdCarrera() + 
		                 " WHERE idUsuario = " + usuario.getIdUsuario(); // Asegúrate de tener una condición WHERE
		    

		    
		    int ejecutado = ConnectionFactory.ejecutarSQL(sql);
		    return ejecutado;
		
	}

	@Override
	public int eliminar(int idusuario) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM usuario WHERE idUsuario  = "+idusuario+";";
	    
	    int ejecutado = ConnectionFactory.ejecutarSQL(sql);
	    return ejecutado;
	}
		
	
	
	/**
	 * @throws SQLException 
	 * 
	 */
	@Override
	public List<Usuario> consultar() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM Usuario order by apellidoUsuario;";
		
		ResultSet rs= ConnectionFactory.ejecutarSQLSelect(sql);
		
		List <Usuario> usuarios = new ArrayList<Usuario>();
		
		if (rs != null) {
			while (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setIdUsuario(rs.getInt("IdUsuario"));
				usuario.setNombreUsuario(rs.getString("NombreUsuario"));
	            usuario.setApellidoUsuario(rs.getString("ApellidoUsuario"));
	            usuario.setContraseñaUsuario(rs.getString("ContraseñaUsuario"));
	            usuario.setTelefonoUsuario(rs.getString("TelefonoUsuario")) ;
	            usuario.setEmailUsuario(rs.getString("EmailUsuario")) ;
	            usuario.setDniUsuario(rs.getString("DniUSuario")) ;
	            usuario.setDireccionUsuario(rs.getString("DireccionUsuario")); 
	            usuario.setPaisUsuario(rs.getString("PaisUsuario")) ;
	            usuario.setFechaNacimientoUsuario(rs.getString("FechaNacimientoUsuario"));
	           
				usuarios.add(usuario);
			}
			
			
				
				
				
		
		}
		
		return usuarios;
	}

	@Override
	public Usuario consultarPorId (int idUsuario) throws SQLException {
		
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM Usuario WHERE idUsuario = "+idUsuario+";";
		
		ResultSet rs= ConnectionFactory.ejecutarSQLSelect(sql);
		
		Usuario usuario = null;
		
		if (rs != null) {
			if (rs.next()) {
				
				usuario = new Usuario();
				usuario.setIdUsuario(rs.getInt("IdUsuario"));
				usuario.setNombreUsuario(rs.getString("NombreUsuario"));
	            usuario.setApellidoUsuario(rs.getString("ApellidoUsuario"));
	            usuario.setContraseñaUsuario(rs.getString("ContraseñaUsuario"));
	            usuario.setTelefonoUsuario(rs.getString("TelefonoUsuario")) ;
	            usuario.setEmailUsuario(rs.getString("EmailUsuario")) ;
	            usuario.setDniUsuario(rs.getString("DniUSuario")) ;
	            usuario.setDireccionUsuario(rs.getString("DireccionUsuario")); 
	            usuario.setPaisUsuario(rs.getString("PaisUsuario")) ;
	            usuario.setFechaNacimientoUsuario(rs.getString("FechaNacimientoUsuario"));
	           
				
			}
		
	}
		return usuario;
	}
}