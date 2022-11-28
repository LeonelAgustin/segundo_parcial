package Datos;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Venta {
	private int id_venta;
	private int cantidad;// cantidad de cafes en 1 venta
	private Cafe cafe;
	private int totalCobrado;
	private boolean descuento;
	
	public Venta(int id_venta, int cantidad, Cafe cafe, int totalCobrado, boolean descuento) {
		super();
		this.id_venta = id_venta;
		this.cantidad = cantidad;
		this.cafe = cafe;
		this.totalCobrado = totalCobrado;
		this.descuento = descuento;
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
	
	public int getTotalCobrado() {
		return totalCobrado;
	}
	public void setTotalCobrado(int totalCobrado) {
		this.totalCobrado = totalCobrado;
	}
	
	public boolean isDescuento() {
		return descuento;
	}
	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}
	@Override
	public String toString() {
		return "Venta [id_venta=" + id_venta + ", cantidad=" + cantidad + ", cafe=" + cafe + "]";
	}
	
	public LinkedList<Venta> cobrar(LinkedList<Venta> ventas, Cliente cliente) {
		
		int cantidad = 0;
		int a  = 0;
		String agregar;
		do {			
			a = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido, que tipo de cafe quiere comprar?\n1-Latte\n2-Flat White\n3-Lagrima\n4-Expresso"));
			switch (a) {
			case 1:// Latte
				
				String res = JOptionPane.showInputDialog("El Latte cuesta $1.50, tiene tarjeta de socio para hacerle un 15% de descuento");
				if (res.equalsIgnoreCase("si")) {
					cliente.setTarjeta(true);
					ventas.add(new Venta(1,cantidad++,new Cafe(1,1.50*0.85,"Latte"),this.totalCobrado+= 1.50*0.85,true));
					
					JOptionPane.showMessageDialog(null, "Cafe agregado al carrito");
				} else {
					cliente.setTarjeta(false);
					ventas.add(new Venta(1,cantidad++,new Cafe(1,1.50,"Latte"),this.totalCobrado += 1.50,false));
					
					JOptionPane.showMessageDialog(null, "Cafe agregado al carrito");
				}
				break;

			case 2://Flat White
				String res2 = JOptionPane.showInputDialog("El Flat White cuesta $2.50, tiene tarjeta de socio para hacerle un 15% de descuento");
				if (res2.equalsIgnoreCase("si")) {
					cliente.setTarjeta(true);
					ventas.add(new Venta(2,cantidad++,new Cafe(2,2.50*0.85,"Flat White"),this.totalCobrado += 2.50*0.85,true));
					
					JOptionPane.showMessageDialog(null, "Cafe agregado al carrito");
				} else {
					cliente.setTarjeta(false);
					ventas.add(new Venta(2,cantidad++,new Cafe(2,2.50,"Flat White"),this.totalCobrado += 2.50,false));
					
					JOptionPane.showMessageDialog(null, "Cafe agregado al carrito");
				}
				break;
			case 3:// Lagrima
				String res3 = JOptionPane.showInputDialog("El Lagrima cuesta $1.30, tiene tarjeta de socio para hacerle un 15% de descuento");
				if (res3.equalsIgnoreCase("si")) {
					cliente.setTarjeta(true);
					ventas.add(new Venta(3,cantidad++,new Cafe(3,1.30*0.85,"Lagrima"),this.totalCobrado += 1.30*0.85,true));
					
					JOptionPane.showMessageDialog(null, "Con el descuento seria "+1.30*0.85);
				} else {
					cliente.setTarjeta(false);
					ventas.add(new Venta(3,cantidad++,new Cafe(3,1.30,"Lagrima"),this.totalCobrado += 1.30,false));
					
					JOptionPane.showMessageDialog(null, "Cafe agregado al carrito sin descuento");
				}
				break;
			case 4:// Expresso
				String res4 = JOptionPane.showInputDialog("El Expresso cuesta $1.00, tiene tarjeta de socio para hacerle un 15% de descuento");
				if (res4.equalsIgnoreCase("si")) {
					cliente.setTarjeta(true);
					ventas.add(new Venta(3,cantidad++,new Cafe(4,1.0*0.85,"Expresso"),this.totalCobrado += 1.00*0.85,true));
					
					JOptionPane.showMessageDialog(null, "Con el descuento seria "+1.00*0.85);
				} else {
					cliente.setTarjeta(false);
					ventas.add(new Venta(3,cantidad++,new Cafe(4,1.00,"Expresso"),this.totalCobrado += 1.00,false));
					
					JOptionPane.showMessageDialog(null, "Cafe agregado al carrito sin descuento");
				}
				break;
			}
			agregar = JOptionPane.showInputDialog("desea agregar otro cafe?");
		} while (agregar.equalsIgnoreCase("si"));
		
		JOptionPane.showMessageDialog(null, "El total de la compra seria "+this.totalCobrado+" por "+cantidad+" Cafe/s");
		
		if (cliente.getSaldo()<this.totalCobrado) {
			JOptionPane.showMessageDialog(null, "Dinero insuficiente, venta cancelada");
		} else {
			cliente.setSaldo(cliente.getSaldo()-this.totalCobrado);
			JOptionPane.showMessageDialog(null, "gracias vuelva pronto");
		}
		
		return ventas;
	}
	
	public void masVendido (LinkedList<Venta> ventas) {
		int[] lista = {0,0,0,0};
		int maximo=0;
		int posicionCafe = 0;
		for (Venta venta : ventas) {
			switch (venta.getCafe().getId_cafe()) {
			case 1:
				lista[0]++;
				break;
			case 2:
				lista[1]++;
				break;
			case 3:
				lista[2]++;
				break;
			case 4:
				lista[3]++;
				break;
			}
		}
		
		for (int i = 0; i < lista.length; i++){
			if (maximo < lista[i])
				maximo = lista[i];
				posicionCafe = i;
		}
		
		switch (posicionCafe) {
		case 0:
			JOptionPane.showMessageDialog(null, "El cafe mas vendido fue el de tipo Latte");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "El cafe mas vendido fue el de tipo Flat White");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "El cafe mas vendido fue el de tipo Lagrima");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "El cafe mas vendido fue el de tipo Expresso");
			break;
		}
	}
	
	
}
