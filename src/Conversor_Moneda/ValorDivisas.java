package Conversor_Moneda;

import java.util.ArrayList;

public class ValorDivisas {
	
	public void main(String[] args) {
		 
	        ArrayList<String> Divisas = new ArrayList<>();
	        Divisas.add("Dolar");
	        Divisas.add(1, "Euro");
	        Divisas.add(2, "Libre Esterlina");
	        Divisas.add(3, "Yen Japones");
	        Divisas.add(4, "Won Sul-Coreano");
	        System.out.println(Divisas);
	        
	        ArrayList<Double> Peso = new ArrayList<>();
	        Peso.add(4171.57);
	        Peso.add(1, 4488.40);
	        Peso.add(2, 5243.87);
	        Peso.add(3, 29.93);
	        Peso.add(4, 3.24);
	        System.out.println(Peso);
	 }
	
	double Dolar = 4171.57;
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
	}
	
}
