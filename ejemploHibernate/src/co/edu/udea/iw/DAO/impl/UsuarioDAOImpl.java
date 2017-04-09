package co.edu.udea.iw.DAO.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import co.edu.udea.iw.DAO.DataSource;
import co.edu.udea.iw.DAO.UsuarioDAO;
import co.edu.udea.iw.DTO.Usuario;
import co.edu.udea.iw.Exception.MyException;

public class UsuarioDAOImpl implements UsuarioDAO {

	@Override
	public Usuario obtener(String login) throws MyException {
		Usuario usuario= new Usuario();
		Session session = null;
		try{
			session = DataSource.getInstance().getSession();
			session.get(Usuario.class,login);
			usuario = (Usuario) session.get(Usuario.class,login);
		}
		catch(HibernateException e)
		{
			throw new MyException("Error consultando usuarios", e);
		}finally{
			if(session!=null){
				session.close();
			}
		}
		
		return usuario;
	}

}
