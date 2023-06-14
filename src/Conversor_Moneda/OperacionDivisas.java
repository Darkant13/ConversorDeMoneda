package Conversor_Moneda;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class OperacionDivisas {
	
	public void Operacion(Double valor, int opcion, int i) {
		
		ValorDivisas valorDivisas = new ValorDivisas(opcion);
		Double Peso = valorDivisas.getPosicionPeso();	
		String Divisa = valorDivisas.getPosicionDivisa();
		DecimalFormat Decimal = new DecimalFormat("#.##");
		
		if (i == 0) {
			
			Double Resultado = valor / Peso;
			System.out.println(Resultado);
			JOptionPane.showMessageDialog(null,
	                 valor + " Pesos Colombianos Son : " + Decimal.format(Resultado) + " " + Divisa);
		}
		if(i == 1) {
			
			
			Double Resultado = Peso * valor;
			
			System.out.println(Resultado);
			JOptionPane.showMessageDialog(null,
	                 valor + " " + Divisa + " Son $ " + Decimal.format(Resultado) + " Pesos Colombianos");
		}

		
		
	}

	

}
