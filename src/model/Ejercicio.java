package model;

public class Ejercicio {
	
	private int id_e;
	private String tipo;
	private String descripcion;
	private String nombre;
	private String monitor;
	
	public Ejercicio(int id_e, String tipo, String descripcion, String nombre, String monitor) {
		this.id_e = id_e;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.monitor = monitor;
	}
	
	public int getId_e() {
		return id_e;
	}

	public String getTipo() {
		return tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getMonitor() {
		return monitor;
	}
}
