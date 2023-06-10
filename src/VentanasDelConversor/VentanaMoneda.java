package VentanasDelConversor;

import javax.swing.JOptionPane;

public class VentanaMoneda {
		

	public void PreguntaDivisa() {

		String[] opcionesMoneda = { "Convertir de Peso Colombiano a divisa", "Convertir divisa a Peso Colombiano","salir"};

		boolean cancelar = false;
		while (!cancelar) {
			int ventanaMoneda = JOptionPane.showOptionDialog(null, "¿Que te gustaria hacer?",
					"Conversor", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcionesMoneda, opcionesMoneda[0]);

			if (ventanaMoneda == 2) {
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
	            System.exit(0);
				
				}
			if (ventanaMoneda == 1) {
				VentanaDivisaAPeso ventanaDivisaAPeso = new VentanaDivisaAPeso();
				ventanaDivisaAPeso.DivisaPeso();
				}
			if (ventanaMoneda == 0) {
				//PesoADivisa();
				VentanaPesoADivisa ventanaPesoADivisa = new VentanaPesoADivisa();
				ventanaPesoADivisa.PesoDivisa();
			}
			else {
				cancelar = true;
			}
		
		}
	}
	
}
