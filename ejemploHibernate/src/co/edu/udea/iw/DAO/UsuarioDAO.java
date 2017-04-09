package co.edu.udea.iw.DAO;

import co.edu.udea.iw.DTO.Usuario;
import co.edu.udea.iw.Exception.MyException;

public interface UsuarioDAO {

	public Usuario obtener(String login) throws MyException;
}
