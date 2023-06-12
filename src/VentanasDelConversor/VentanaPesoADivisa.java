package VentanasDelConversor;

import java.util.function.ToIntFunction;

import javax.swing.JOptionPane;
import javax.swing.Spring;

import Conversor_Moneda.OperacionDivisas;

public class VentanaPesoADivisa {
	
	String Valor;
	int Opcion;
	


	public void PesoDivisa() {
		
		String[] opcionesDivisa = { "Dolar", "Euro","Libra Esterlinas", "Yen Japones", "Won Sul-Coreano"};

		boolean cancelar = false;
		while (!cancelar) {
			String ventanaPesoADivisa = (String) JOptionPane.showInputDialog(null, "¿Deseas convertir el Peso Colombiano a ...?",
					"Conversor", JOptionPane.PLAIN_MESSAGE, null, opcionesDivisa, opcionesDivisa[0]);
			
			Valor = JOptionPane.showInputDialog("Ingrese la cantidad en Pesos Colombianos: ");
   

			if (ventanaPesoADivisa != null) {
				switch (ventanaPesoADivisa) {
				
				case "Dolar":
					Opcion = 0;
					System.out.println(Valor);
					OperacionDivisas operacion = new OperacionDivisas(this.Opcion, this.Valor);
					operacion.Operacion();				
					
					break;
				case "Euro":
					Opcion = 1;
					//convertirTemperatura();
					break;
				case "Libra Esterlinas":
					Opcion = 2;
					break;
				case "Yen Japoness":
					Opcion = 3;
					break;
				case "Won Sul-Coreano":
					Opcion = 4;
					break;
				}
			} else {
				cancelar = true;
			}
		}	
			
	}


	public String getValor() {
		
		return Valor;
	}


	public int getOpcion() {
		//System.out.println(Opcion);
		return Opcion;
	}
	
	

}
