/**
 * 
 */
package com.itsu.data.dao.impl;
import java.sql.SQLException;
import java.util.List;

import com.itsu.data.connection.ConnectionFactory;
import com.itsu.data.dao.AñosDAO;
import com.itsu.data.entity.Años;


/**
 * 
 */
public class AñosDAOImpl implements AñosDAO {
	static {
		try { ConnectionFactory.conectar();
	} catch (ClassNotFoundException| SQLException e) {
		e.printStackTrace();
		System.err.println("Error de bdd: " + e.getMessage());
	}
		// TODO: handle exception
	}

	@Override
	public int guardar(Años años) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO Años (descripcionAños)" + "VALUES ('"+años.getDescripcionAños() +"')";
		
		int ejecutado = ConnectionFactory.ejecutarSQL(sql);
	    return ejecutado;
	}

	@Override
	public int actualizar(Años años) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(int idAños) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Años> consultar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Años cosultarPorId(int idAños) {
		// TODO Auto-generated method stub
		return null;
	}

}
