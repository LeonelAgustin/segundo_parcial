package Datos;

public abstract class Socio {
	private int id_socio;
	private int num_tarjeta;
	
	public Socio(int id_socio, int num_tarjeta) {
		super();
		this.id_socio = id_socio;
		this.num_tarjeta = num_tarjeta;
	}
	public int getId_socio() {
		return id_socio;
	}
	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
	}
	public int getNum_tarjeta() {
		return num_tarjeta;
	}
	public void setNum_tarjeta(int num_tarjeta) {
		this.num_tarjeta = num_tarjeta;
	}
	@Override
	public String toString() {
		return "Socio [id_socio=" + id_socio + ", num_tarjeta=" + num_tarjeta + "]";
	}
	
	
}
