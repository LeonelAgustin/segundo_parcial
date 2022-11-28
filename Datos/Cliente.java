package Datos;

import java.util.LinkedList;


public class Cliente extends Socio {
	private int id_cleinte;
	private String nombre;
	private double saldo;
	private boolean tarjeta;
	
	public Cliente(int id_socio, int num_tarjeta, int id_cleinte, String nombre, double saldo, boolean tarjeta) {
		super(id_socio, num_tarjeta);
		this.id_cleinte = id_cleinte;
		this.nombre = nombre;
		this.saldo = saldo;
		this.tarjeta = tarjeta;
	}
	
	
	
	public int getId_cleinte() {
		return id_cleinte;
	}



	public void setId_cleinte(int id_cleinte) {
		this.id_cleinte = id_cleinte;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public boolean isTarjeta() {
		return tarjeta;
	}



	public void setTarjeta(boolean tarjeta) {
		this.tarjeta = tarjeta;
	}



	@Override
	public String toString() {
		return "Cliente [id_cleinte=" + id_cleinte + ", nombre=" + nombre + ", saldo=" + saldo + ", tarjeta=" + tarjeta
				+ "]";
	}
	
	
	
}
