package model;

public class Monitor {
	
	private String id_m;
	private String nombre;
	private String apellido;
	private String formacion;
	private String contrasenia;
	
	public Monitor(String id_m, String nombre, String apellido, String formacion, String contrasenia) {
		this.id_m = id_m;
		this.nombre = nombre;
		this.apellido = apellido;
		this.formacion = formacion;
		this.contrasenia = contrasenia;
	}

	public String getId_m() {
		return id_m;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getFormacion() {
		return formacion;
	}

	public String getContrasenia() {
		return contrasenia;
	}
}
