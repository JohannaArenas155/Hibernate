package co.edu.udea.iw.DAO.impl;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

import co.edu.udea.iw.DAO.ClienteDAO;
import co.edu.udea.iw.DTO.Cliente;
import co.edu.udea.iw.DTO.Usuario;
import co.edu.udea.iw.Exception.MyException;

public class ClienteDAOImplTest {

	@Test
	public void testObtener() {
		ClienteDAO clienteDao = null;
		List<Cliente> resultado =null;
		
		
		
		try{
			clienteDao  = new ClienteDAOImpl();
			resultado = clienteDao.obtener();
			assertTrue(resultado.size()>0);
			
		}catch(MyException e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testGuardar() {
		
		Cliente cliente = null;
		ClienteDAO clienteDAO = null;
		Usuario usuario= null;
		
		try{
			cliente = new Cliente();
			cliente.setCedula("10");
			cliente.setNombres("Camilo");
			cliente.setApellidos("Apellidos");
			cliente.setEmail("dcamilo.bedoya@udea.edu.co");
			
			usuario = new Usuario();
			usuario.setLogin("elver");
			cliente.setUsuarioCrea(usuario);
			cliente.setFechaCreacion(new Date());
			clienteDAO = new ClienteDAOImpl();
			clienteDAO.agregar(cliente);
			
		}catch(MyException e){
			fail(e.getMessage());
		}
	}
	
}
