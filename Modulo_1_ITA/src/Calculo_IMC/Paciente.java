package Calculo_IMC;

import java.util.Scanner;

public class Paciente  {
		private double altura;
		private double peso;
public Paciente(double altura, double peso) {
	this.altura = altura;
	this.peso = peso;
}
public double calcular_imc() {
	double imc = this.peso/(this.altura*this.altura);
	return imc;
}
public String diaginostico() {
	double imc = this.calcular_imc();
	String resultado_imc = "";
	if (imc < 16) {
		resultado_imc = "Baixo peso muito grave";
	} else if(imc == 16 && imc < 16.99){
		resultado_imc = "Baixo peso grave";
		
	}  else if(imc == 17 && imc < 18.49){
		resultado_imc = "Baixo peso";
		
	}  else if(imc == 18.5 && imc < 24.99){
		resultado_imc = "Peso normal";
		
	}  else if(imc == 25 && imc < 29.99){
		resultado_imc = "Sobrepeso";
		
	}  else if(imc == 30 && imc < 34.99){
		resultado_imc = "Obsidade grau I";
		
	}	else {
		resultado_imc = "Obsidade grau II";
		
	}
	return resultado_imc;
}
}
			
			
