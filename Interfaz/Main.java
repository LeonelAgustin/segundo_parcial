package Interfaz;

import java.util.LinkedList;

import javax.swing.JOptionPane;
import Datos.Venta;

import Datos.Cliente;

public class Main {

	public static void main(String[] args) {
		int total = 0;
		String entrar = "si";
		LinkedList <Venta> ventas = new LinkedList <Venta>();
		// auxiliares para manejar y llamar los metodos 
		Cliente cliente =  new Cliente(49,1234,77,"Leo",100.50,true);
		Venta venta1 =new Venta (1, 0, null, 0, false);
		
		while (entrar.equalsIgnoreCase("si")) {
			entrar =  JOptionPane.showInputDialog("Bienvenido ¿desea seguir con el dia laboral?");
			ventas = venta1.cobrar(ventas, cliente);
			
		}
		
		
		String terminar = JOptionPane.showInputDialog("Antes de cerrar el dia laboral, desea eleminar una venta?");
		do {
			if (terminar.equalsIgnoreCase("si")) {
			int borrar = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero dela venta que desea borrar"));
			ventas.remove(borrar);
			terminar = JOptionPane.showInputDialog("Venta borrada, quiere eliminar otra?");
		}
		}while(terminar.equalsIgnoreCase("si"));		
		
		int b;
		do {
			b = Integer.parseInt(JOptionPane.showInputDialog("Termino el dia laboral, opciones\n1-Mostrar todas las ventas del dia\n2-Cafe mas vendido\3-Recaudacion total\4-Ventas con descuento\n5-Salir"));
			
			switch (b) {
			case 1:// todas las ventas
				String todas="";
				for (Venta venta : ventas) {
					todas = "Venta numero: "+ventas.indexOf(venta)+"\nTipo de cafe vendido: "+venta.getCafe().getTipo()+"\nPrecio: "+venta.getCafe().getPrecio()+"\n";
				}
				JOptionPane.showMessageDialog(null, todas);
				break;

			case 2:// mas vendido
				venta1.masVendido(ventas);			
				break;
			case 3:// ttoal recaudado
				for (Venta venta : ventas) {
					total+=venta.getTotalCobrado();
				}
				JOptionPane.showMessageDialog(null, "Recaudacion total: "+total);
				break;
			case 4:
				String ventasDescuentos="";
				for (Venta venta : ventas) {
					ventasDescuentos = "Venta con descuento numero: "+venta.getId_venta()+"\nTipo de cafe vendido: "+venta.getCafe().getTipo()+"\nPrecio: "+venta.getCafe().getPrecio()+"\n"; 
				}
				JOptionPane.showMessageDialog(null, ventasDescuentos);
				break;
			}	
		} while (b==5);
		
		
			
		
		
	}

}
