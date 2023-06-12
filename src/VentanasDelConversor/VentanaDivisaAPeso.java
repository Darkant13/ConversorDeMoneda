package VentanasDelConversor;

import javax.swing.JOptionPane;

public class VentanaDivisaAPeso {
	
	int Opcion = 0;
	
	
	public void DivisaPeso() {
		
		
		String[] opcionesDivisa = { "Dolar", "Euro","Libra Esterlinas", "Yen Japones", "Won Sul-Coreano"};

		boolean cancelar = false;
		while (!cancelar) {
			String ventanaPesoADivisa = (String) JOptionPane.showInputDialog(null, "¿Deseas convertir la Divisa ... a Peso Colombiano?",
					"Conversor", JOptionPane.PLAIN_MESSAGE, null, opcionesDivisa, opcionesDivisa[0]);
			System.out.println(Opcion);
			if (ventanaPesoADivisa != null) {
				switch (ventanaPesoADivisa) {
				case "Dolar":
					Opcion = 0;
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
			} 
				else {
				cancelar = true;
				}
			}		
		}
	public int getOpcion() {
		System.out.println(Opcion);
		return this.Opcion;
	}

}
