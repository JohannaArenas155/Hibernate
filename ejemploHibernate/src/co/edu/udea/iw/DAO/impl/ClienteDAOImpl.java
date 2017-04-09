package co.edu.udea.iw.DAO.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import co.edu.udea.iw.DAO.ClienteDAO;
import co.edu.udea.iw.DAO.DataSource;
import co.edu.udea.iw.DAO.UsuarioDAO;
import co.edu.udea.iw.DTO.Cliente;
import co.edu.udea.iw.DTO.Usuario;
import co.edu.udea.iw.Exception.MyException;

public class ClienteDAOImpl implements ClienteDAO {

	@Override
	public List<Cliente> obtener() throws MyException {
	
		List<Cliente> clientes = new ArrayList<Cliente>();
		Session session = null;
		Criteria criteria = null;
		
		
		try{
			
			session = DataSource.getInstance().getSession();
			criteria = session.createCriteria(Cliente.class);
			criteria.addOrder(Order.asc("FechaCreacion"));
			clientes = criteria.list(); 
		}catch(HibernateException e){
			throw new MyException("Error consultando en la lista de clientes", e);
		}
		
		
		
		return clientes;
	}

	@Override
	public void agregar(Cliente cliente) throws MyException {
		
		Transaction tx =  null;
		Session session = null;
		try
		{
			session = DataSource.getInstance().getSession();
			tx = session.beginTransaction();
			session.save(cliente);
			tx.commit();
		}
		catch(HibernateException e)
		{
			throw new MyException("Error agregando cliente", e);
		}
	}

	

}
