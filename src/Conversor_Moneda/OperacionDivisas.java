package Conversor_Moneda;

import VentanasDelConversor.VentanaDivisaAPeso;

public class OperacionDivisas{
	
	int Opcion;
	double Valor;
	
	public OperacionDivisas(int opcion, String valor) {
		Opcion = opcion;
		Valor = Double.parseDouble(valor);
		
	}

	public void Operacion() {
		
		ValorDivisas valorDivisas = new ValorDivisas();
		double Peso = valorDivisas.getDolar();
		System.out.println(Peso);
		
		VentanaDivisaAPeso valorUsuario = new VentanaDivisaAPeso();
		int Op = valorUsuario.getOpcion();
		double Resultado = Peso * Valor;
		
		System.out.println(Resultado);
				
		  
		
	}

}
