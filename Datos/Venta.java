package Datos;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Venta {
	private int id_venta;
	private int cantidad;// cantidad de cafes en 1 venta
	private Cafe cafe;
	public Venta(int id_venta, int cantidad, Cafe cafe) {
		super();
		this.id_venta = id_venta;
		this.cantidad = cantidad;
		this.cafe = cafe;
	}
	public int getId_venta() {
		return id_venta;
	}
	public void setId_venta(int id_venta) {
		this.id_venta = id_venta;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Cafe getCafe() {
		return cafe;
	}
	public void setCafe(Cafe cafe) {
		this.cafe = cafe;
	}
	@Override
	public String toString() {
		return "Venta [id_venta=" + id_venta + ", cantidad=" + cantidad + ", cafe=" + cafe + "]";
	}
	
	public LinkedList<Venta> cobrar(LinkedList<Venta> ventas, Cliente cliente) {
		int cantidad = 0;
		int a  = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido, que tipo de cafe quiere comprar?\n1-Latte\n2-Flat White\n3-Lagrima\n4-Expresso"));
		String agregar;
		do {			

			switch (a) {
			case 1:// Latte
				
				String res = JOptionPane.showInputDialog("El Latte cuesta $1.50, tiene tarjeta de socio para hacerle un 15% de descuento");
				if (res.equalsIgnoreCase("si")) {
					ventas.add(new Venta(1,cantidad++,new Cafe(1,1.50*0.85,"Latte")));
					cliente.setTarjeta(true);
					JOptionPane.showMessageDialog(null, "Cafe agregado al carrito");
				} else {
					ventas.add(new Venta(1,cantidad++,new Cafe(1,1.50,"Latte")));
					cliente.setTarjeta(false);
					JOptionPane.showMessageDialog(null, "Cafe agregado al carrito");
				}
				break;

			case 2://Flat White
				String res2 = JOptionPane.showInputDialog("El Flat White cuesta $1.50, tiene tarjeta de socio para hacerle un 15% de descuento");
				if (res2.equalsIgnoreCase("si")) {
					ventas.add(new Venta(1,cantidad++,new Cafe(1,2.50*0.85,"Latte")));
					cliente.setTarjeta(true);
					JOptionPane.showMessageDialog(null, "Cafe agregado al carrito");
				} else {
					ventas.add(new Venta(1,cantidad++,new Cafe(1,2.50,"Latte")));
					cliente.setTarjeta(false);
					JOptionPane.showMessageDialog(null, "Cafe agregado al carrito");
				}
				break;
			case 3:// Lagrima
				
				break;

			case 4:// Expresso
				break;
			}
			agregar = JOptionPane.showInputDialog("desea agregar otro cafe?");
		} while (agregar.equalsIgnoreCase("si"));
		
		return ventas;
	}
	
	
}
