package co.edu.udea.iw.DTO;

public class Direcciones{

	private DireccionId id;
	private String Direccion;
	private String Telefono;
	private int Ciudad;
	private boolean Preferidad;
	public DireccionId getId() {
		return id;
	}
	public void setId(DireccionId id) {
		this.id = id;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public int getCiudad() {
		return Ciudad;
	}
	public void setCiudad(int ciudad) {
		Ciudad = ciudad;
	}
	public boolean getPreferidad() {
		return Preferidad;
	}
	public void setPreferidad(boolean Preferidad) {
		this.Preferidad = Preferidad;
	}
	
	
}
