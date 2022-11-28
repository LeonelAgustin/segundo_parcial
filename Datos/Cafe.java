package Datos;

public class Cafe {
	private int id_cafe;
	private double precio;
	private String tipo;
	
	public Cafe(int id_cafe, double precio, String tipo) {
		super();
		this.id_cafe = id_cafe;
		this.precio = precio;
		this.tipo = tipo;
	}
	public int getId_cafe() {
		return id_cafe;
	}
	public void setId_cafe(int id_cafe) {
		this.id_cafe = id_cafe;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Cafe [id_cafe=" + id_cafe + ", precio=" + precio + ", tipo=" + tipo + "]";
	}
	
	
	
}
