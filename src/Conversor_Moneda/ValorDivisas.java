package Conversor_Moneda;

import java.util.ArrayList;

public class ValorDivisas {
	
	Double PosicionPeso;
	String PosicionDivisa;
	
	public ValorDivisas(int opcion) {
		
	        ArrayList<String> Divisas = new ArrayList<>();
	        Divisas.add("Dolares");
	        Divisas.add(1, "Euro");
	        Divisas.add(2, "Libras Esterlinas");
	        Divisas.add(3, "Yenes Japones");
	        Divisas.add(4, "Wons Sul-Coreano");
	        
	        ArrayList<Double> Peso = new ArrayList<>();
	        Peso.add(4171.57);
	        Peso.add(1, 4488.40);
	        Peso.add(2, 5243.87);
	        Peso.add(3, 29.93);
	        Peso.add(4, 3.24);
	        
	        
	        PosicionDivisa = Divisas.get(opcion);
	        System.out.println("Valor Divisa:" + PosicionDivisa);
	        PosicionPeso = Peso.get(opcion);
	        System.out.println("Valor Divisa:" + PosicionPeso);
	        
			}
	
		public Double getPosicionPeso() {
			return PosicionPeso;
		}
		
		public String getPosicionDivisa() {
			return PosicionDivisa;
		}
	}

	/*double Dolar = 4171.57;
	double Euro = 4488.40;
	double LibraEsterlina = 5243.87;
	double yen = 29.93;
	double Won = 3.24;
	
	public double getDolar() {
		return this.Dolar;
	}
	public double getEuro() {
		return this.Euro;
	}
	public double getLibraEsterlina() {
		return this.LibraEsterlina;
	}
	public double getYen() {
		return this.yen;
	}
	public double getWon() {
		return this.Won;
	}*/
	

