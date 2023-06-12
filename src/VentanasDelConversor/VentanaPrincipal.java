package VentanasDelConversor;

import javax.swing.JOptionPane;

public class VentanaPrincipal {

	
	public static void main(String[] args) {
		
			
			String[] opcionesPrincipales = { "Conversor de Monedas", "Conversor de peso","Conversor de Temperatura"};

			boolean cancelar = false;
			while (!cancelar) {
				String ventanaPrincipal = (String) JOptionPane.showInputDialog(null, "¿Que te gustaria hacer?",
						"Conversor", JOptionPane.PLAIN_MESSAGE, null, opcionesPrincipales, opcionesPrincipales[0]);

				if (ventanaPrincipal != null) {
					switch (ventanaPrincipal) {
					case "Conversor de Monedas":
						
						VentanaMoneda ventanaMoneda = new VentanaMoneda();
						ventanaMoneda.PreguntaDivisa();
						break;
					case "Conversor de Temperatura":
						//convertirTemperatura();
						break;
					case "Salir":
						cancelar = true;
						JOptionPane.showMessageDialog(null, "Gracias por usar el programa.");
						break;
					}
				} else {
					cancelar = true;
				}
			}

	}

	
}
