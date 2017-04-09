package co.edu.udea.iw.DAO;

import co.edu.udea.iw.DTO.Ciudad;
import co.edu.udea.iw.Exception.MyException;

public interface  CiudadDAO {

	public Ciudad obtener() throws MyException;
	public void guardar(Ciudad ciudad) throws MyException;
	public Ciudad obtener(Long codigo) throws MyException; 
	public void GuardarorActualizar  (Ciudad ciudad) throws MyException;
	public Ciudad obtener(long codigo) throws MyException;
	
	
	
	
}
