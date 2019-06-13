package model;

public class Usuario {
	
	private int id_u;
	private String nombre;
	private String apellido;
	private double altura;
	private double peso;
	private String contrasenia;
	
	public Usuario(int id_u, String nombre, String apellido, double altura, double peso, String contrasenia) {
		this.id_u = id_u;
		this.nombre = nombre;
		this.apellido = apellido;
		this.altura = altura;
		this.peso = peso;
		this.contrasenia = contrasenia;
	}

	public int getId_u() {
		return id_u;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public double getAltura() {
		return altura;
	}

	public double getPeso() {
		return peso;
	}

	public String getContrasenia() {
		return contrasenia;
	}
}
