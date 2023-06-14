package VentanasDelConversor;

import javax.swing.JOptionPane;

public class VentanaMoneda {
	
	int ventanaMoneda;
		
	public void PreguntaDivisa() {

		String[] opcionesMoneda = { "Convertir de Peso Colombiano a divisa", "Convertir divisa a Peso Colombiano","salir"};

		boolean cancelar = false;
		while (!cancelar) {
			
			ventanaMoneda = JOptionPane.showOptionDialog(null, "¿Que te gustaria hacer?",
					"Conversor", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcionesMoneda, opcionesMoneda[0]);
			
			VentanaCambioDivisa ventanaCambioDivisa = new VentanaCambioDivisa();
			
			if (ventanaMoneda == 2) {
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
	            System.exit(0);
				
				}
			if (ventanaMoneda == 1) {				
				System.out.println("OK" + ventanaMoneda);
				ventanaCambioDivisa.CambioDivisa(this.ventanaMoneda);
				}
			if (ventanaMoneda == 0) {
				System.out.println("OK" + ventanaMoneda);
				ventanaCambioDivisa.CambioDivisa(this.ventanaMoneda);
			}
			else {
				cancelar = true;
			}
		
		}
	}	
}
