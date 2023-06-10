package VentanasDelConversor;

import javax.swing.JOptionPane;

public class VentanaDivisaAPeso {
	

	public void DivisaPeso() {
		
		String[] opcionesDivisa = { "Dolar", "Euro","Libra Esterlinas", "Yen Japones", "Won Sul-Coreano"};

		boolean cancelar = false;
		while (!cancelar) {
			String ventanaPesoADivisa = (String) JOptionPane.showInputDialog(null, "¿Deseas convertir la Divisa ... a Peso Colombiano?",
					"Conversor", JOptionPane.PLAIN_MESSAGE, null, opcionesDivisa, opcionesDivisa[0]);

			if (ventanaPesoADivisa != null) {
				switch (ventanaPesoADivisa) {
				case "Dolar":
					
					break;
				case "Euro":
					//convertirTemperatura();
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
