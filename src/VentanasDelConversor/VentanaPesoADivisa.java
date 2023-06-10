package VentanasDelConversor;

import javax.swing.JOptionPane;

public class VentanaPesoADivisa {
	

	public void PesoDivisa() {
		
		String[] opcionesDivisa = { "Dolar", "Euro","Libra Esterlinas", "Yen Japones", "Won Sul-Coreano"};

		boolean cancelar = false;
		while (!cancelar) {
			String ventanaPesoADivisa = (String) JOptionPane.showInputDialog(null, "¿Deseas convertir el Peso Colombiano a ...?",
					"Conversor", JOptionPane.PLAIN_MESSAGE, null, opcionesDivisa, opcionesDivisa[0]);
			
			String Valor = JOptionPane.showInputDialog("Ingrese la cantidad en Pesos Colombianos: ");
   

			if (ventanaPesoADivisa != null) {
				switch (ventanaPesoADivisa) {
				case "Dolar":
					
					
					
					break;
				case "Euro":
					
					break;
				case "Libra Esterlinas":
					
					break;
				case "Yen Japoness":
					
					break;
				case "Won Sul-Coreano":
	
					break;
				}
			} else {
				cancelar = true;
			}
		}
	}

}
