package Interfaz;

import java.util.LinkedList;

import javax.swing.JOptionPane;
import Datos.Venta;
import Datos.Cafe;
import Datos.Cliente;

public class Main {

	public static void main(String[] args) {
		String agregar="no";
		int total = 0;
		int cantidad = 0;
		LinkedList <Venta> ventas = new LinkedList <Venta>();
		//int id_socio, int num_tarjeta, int id_cleinte, String nombre, double saldo, boolean tarjeta
		Cliente cliente =  new Cliente(49,1234,77,"Leo",100.50,true);
		Venta venta1 = null;
		int entrar = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido como quiere ingresar\n1-Encargado\n2-Cliente"));
		
		if (entrar == 1) {
			
		} else {
			ventas = venta1.cobrar(ventas, cliente);
			
			for (Venta venta : ventas) {
				total += venta.getCafe().getPrecio();
			}
			String pagar = JOptionPane.showInputDialog("En total seria"+total+" tiene con que pagar?");
			if (pagar.equalsIgnoreCase("si")) {
				JOptionPane.showMessageDialog(null, "gracias vuelva pronto");
			} else {
				
			}
		}
		
		
	}

}
