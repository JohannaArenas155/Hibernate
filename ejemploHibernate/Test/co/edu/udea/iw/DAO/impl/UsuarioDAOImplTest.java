package co.edu.udea.iw.DAO.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.udea.iw.DAO.UsuarioDAO;
import co.edu.udea.iw.DTO.Usuario;
import co.edu.udea.iw.Exception.MyException;

public class UsuarioDAOImplTest {


	@Test
	public void ObtenerUsuario() {
		UsuarioDAO usuarioDAO = null;
		Usuario usuario= null;
		try
		{
			usuarioDAO = new UsuarioDAOImpl();
			usuario = usuarioDAO.obtener("elver");
			assertEquals(usuario.getNombres(),"Elver");
			
			System.out.println(usuario.getRol());
	        
		}
		catch(MyException e)
		{
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
