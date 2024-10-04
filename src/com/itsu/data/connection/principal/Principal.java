package com.itsu.data.connection.principal;

import java.sql.SQLException;
import java.util.List;

import com.itsu.data.dao.impl.UsuarioDAOImpl;
import com.itsu.data.entity.Años;
import com.itsu.data.entity.Carrera;
import com.itsu.data.entity.Rol;
import com.itsu.data.entity.Usuario;

public class Principal {
	

	public static void main(String[] args) {
		//PRUEBA INSERT O AGREGAR USUARIO
		
		UsuarioDAOImpl usuarioDAOImpl = new UsuarioDAOImpl();
		//Usuario usuario = new Usuario();
		Rol rol = new Rol(); //PARA TRAER. LOS ID Y PASARLOS COMO PARAMETRO
		Carrera carrera = new Carrera();//PARA TRAER LOS ID Y PASARLOS COMO PARAMETRO
		rol.setIdRol(1);//PARA TRAER LOS ID Y PASARLOS COMO PARAMETRO
		carrera.setIdCarrera(1);//PARA TRAER LOS ID Y PASARLOS COMO PARAMETRO
//		
		usuario.setNombreUsuario("123");
		usuario.setApellidoUsuario("yoli");
		usuario.setContraseñaUsuario("jgj");
		usuario.setTelefonoUsuario("alumno");
//		usuario.setEmailUsuario("fggfgf");
//		usuario.setDniUsuario("");
//		usuario.setDireccionUsuario("");
//		usuario.setPaisUsuario("");
//		usuario.setFechaNacimientoUsuario("2024-02-20");
//		usuario.setIdRol(rol);
//		usuario.setIdCarrera(carrera);
//		
//		try {
//			int guardado = usuarioDAOImpl.guardar(usuario);
//			if (guardado > 0) {
//				System.out.println("El usuario " + usuario.getApellidoUsuario() +" "+  usuario.getNombreUsuario() + " fue guardado con exito")
//			;
//			} else {
//				System.err.println("no se pudo completar la accion");
//			}
//		} catch (SQLException e) {
//			System.err.println("error: "+ e.getMessage());
//			e.printStackTrace();
//		}
		
	//PRUEBA UPDATE O MODIFICAR USUARIO
//		usuario.setNombreUsuario("Ruben");
//		usuario.setApellidoUsuario("Grau");
//		usuario.setContraseñaUsuario("123");
//		usuario.setTelefonoUsuario("12345");
//		usuario.setEmailUsuario("r@g");
//		usuario.setDniUsuario("23708");
//		usuario.setDireccionUsuario("cdelu");
//		usuario.setPaisUsuario("arg");
//		usuario.setFechaNacimientoUsuario("2024-02-20");
//		usuario.setIdRol(rol);
//		usuario.setIdCarrera(carrera);
//		usuario.setIdUsuario(1);
//		
//		try {
//			int guardado = usuarioDAOImpl.actualizar(usuario);
//			if (guardado > 0) {
//				System.out.println("El usuario " + usuario.getApellidoUsuario() +" "+  usuario.getNombreUsuario() + " fue actualizado con exito");
//			
//			} else {
//				System.err.println("no se pudo completar la accion");
//			}
//		} catch (SQLException e) {
//			System.err.println("error: "+ e.getMessage());
//			e.printStackTrace();
//		}
		
		
	//PRUEBA DE BORRADO O  DELETE
//	try {
//		int eliminado = usuarioDAOImpl.eliminar(2);
//		
//		if (eliminado > 0) {
//			System.out.println("El usuario " + usuario.getApellidoUsuario() +" "+  usuario.getNombreUsuario() + " fue eliminado con exito");
//		
//		} else {
//			System.err.println("no se pudo completar la accion");
//		}
//	} catch (SQLException e) {
//		System.err.println("error: "+ e.getMessage());
//		e.printStackTrace();
//	}
//	
//PRUEBA DE CONSULTAS SELECT
//	try {
//		List<Usuario>usuarios = usuarioDAOImpl.consultar(); 
//		
//		for (Usuario usuario : usuarios) {
//			
//			System.out.println("id "+ usuario.getIdUsuario());
//			System.out.println("apellido "+ usuario.getApellidoUsuario());
//			System.out.println("nombre "+usuario.getNombreUsuario());
//			System.out.println("contraseña " +usuario.getContraseñaUsuario());
//			System.out.println("telefono "+ usuario.getTelefonoUsuario());
//			System.out.println("email "+usuario.getEmailUsuario());
//			System.out.println("dni "+usuario.getDniUsuario());
//			System.out.println("direccion "+usuario.getDireccionUsuario());
//			System.out.println("pais "+usuario.getPaisUsuario());
//			System.out.println("fecha nac "+usuario.getFechaNacimientoUsuario()+"\n");
//			
//			
//		}
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		System.err.println("error: "+ e.getMessage());
//		e.printStackTrace();
//	}
//	PRUEBA  SELECT WHERE
		try {
			Usuario usuarioconsultado = usuarioDAOImpl.consultarPorId(1); 
			
			if ( usuarioconsultado !=null) {
				
				System.out.println("id "+ usuarioconsultado.getIdUsuario());
				System.out.println("apellido "+ usuarioconsultado.getApellidoUsuario());
				System.out.println("nombre "+usuarioconsultado.getNombreUsuario());
				System.out.println("contraseña " +usuarioconsultado.getContraseñaUsuario());
				System.out.println("telefono "+ usuarioconsultado.getTelefonoUsuario());
				System.out.println("email "+usuarioconsultado.getEmailUsuario());
				System.out.println("dni "+usuarioconsultado.getDniUsuario());
				System.out.println("direccion "+usuarioconsultado.getDireccionUsuario());
				System.out.println("pais "+usuarioconsultado.getPaisUsuario());
				System.out.println("fecha nac "+usuarioconsultado.getFechaNacimientoUsuario()+"\n");
						
			}else {
				System.err.println("no encontrado");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("error: "+ e.getMessage());
			e.printStackTrace();
		}}
	Años años = new Años();
	
}
