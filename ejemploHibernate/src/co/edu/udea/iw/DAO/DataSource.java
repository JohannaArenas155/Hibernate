package co.edu.udea.iw.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import co.edu.udea.iw.Exception.MyException;

public class DataSource {

	 private static DataSource instancia;
	 private SessionFactory factory =null;
	 private Configuration conf = new Configuration();
	 
	 private DataSource(){
		 
		 
	 }
	 
	 //singlenton
	 public static DataSource getInstance(){
		 
		 if(instancia==null){
			 
			 instancia = new DataSource();
		 }
		 return instancia;
	 }
	
	
	public Session getSession() throws MyException{
		try{
			if(factory ==null){
				 conf.configure("hibernate.cfg.xml");
				 factory = conf.buildSessionFactory();
			 }
			return factory.openSession();
		}catch (HibernateException e){
			throw new MyException("Error configurando la session", e);
		}
		 

		
	}
	
}
