package VentanasDelConversor;

import javax.swing.JOptionPane;

import Conversor_Moneda.OperacionDivisas;

public class VentanaCambioDivisa {
	
	String Cantidad;
	Double Valor;
	int Opcion;
	String ventanaPesoADivisa;
	
	public void CambioDivisa(int ventanaMoneda) {
		
		
		String[] opcionesDivisa = { "Dolar", "Euro","Libra Esterlinas", "Yen Japones", "Won Sul-Coreano"};

		boolean cancelar = false;
		while (!cancelar) {
			
			int i = ventanaMoneda;
			System.out.println("i = " + i);
			if (i == 0) {
				
				ventanaPesoADivisa = (String) JOptionPane.showInputDialog(null, "¿Deseas convertir el peso Colombiano a ...?",
						"Conversor", JOptionPane.PLAIN_MESSAGE, null, opcionesDivisa, opcionesDivisa[0]);				
			}if (i == 1) {
				
				ventanaPesoADivisa = (String) JOptionPane.showInputDialog(null, "¿Deseas convertir la Divisa ... a Peso Colombiano?",
						"Conversor", JOptionPane.PLAIN_MESSAGE, null, opcionesDivisa, opcionesDivisa[0]);
			}
			 Cantidad = JOptionPane.showInputDialog("Ingrese la cantidad");
			 Valor = Double.parseDouble(Cantidad);
			 
			
			if (ventanaPesoADivisa != null) {
				
				OperacionDivisas operacion = new OperacionDivisas();
				switch (ventanaPesoADivisa) {
				
				case "Dolar":
					Opcion = 0;
					System.out.println(Opcion);
					operacion.Operacion(Valor,Opcion,i);	
					break;
				case "Euro":
					Opcion = 1;
					System.out.println(Opcion);
					operacion.Operacion(Valor,Opcion,i);	
					break;
				case "Libra Esterlinas":
					Opcion = 2;
					System.out.println(Opcion);
					operacion.Operacion(Valor,Opcion,i);	
					break;
				case "Yen Japones":
					Opcion = 3;
					operacion.Operacion(Valor,Opcion,i);	
					break;
				case "Won Sul-Coreano":
					Opcion = 4;
					operacion.Operacion(Valor,Opcion,i);	
					break;
				}
			} 
				else {
				cancelar = true;
				}
			}		
		}
	
	

}
