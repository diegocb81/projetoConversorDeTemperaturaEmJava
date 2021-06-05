package br.com.diegobarcellos.git;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double c,f,k;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Selecione o tipo de conversão: \n1.Celsius para Fahrenheit \n2.Celsius para Kelvin \n3.Fahrenheit para Celsius \n4.Fahrenheit para Kelvin \n5.Kelvin para Celsius \n6.Kelvin para Fahrenheit");
			
		int seletor = sc.nextInt();
			
		switch(seletor) {
		case 1: 
			System.out.println("Informe a temperatura em Celsius: ");
			c = sc.nextDouble();
			f = c * 1.8 + 32;
			System.out.printf("Temperatura em Fahrenheit = %.2f%n", f);
			break;
			
		case 2: 
			System.out.println("Informe a temperatura em Celsius: ");
			c = sc.nextDouble();
			k = c + 273.15;
			System.out.println("Temperatura em Kelvin = " + k);
			break;
			
		case 3: 
			System.out.println("Informe a temperatura em Fahrenheit: ");
			f = sc.nextDouble();
			c = (f - 32) / 1.8;
			System.out.printf("Temperatura em Celsius = %.2f%n", c);
			break;
			
		case 4: 
			System.out.println("Informe a temperatura em Fahrenheit: ");
			f = sc.nextDouble();
			k = (f - 32) * 5/9 + 273.15;
			System.out.printf("Temperatura em Kelvin = %.2f%n", k);
			break;
			
		case 5: 
			System.out.println("Informe a temperatura em Kelvin: ");
			k = sc.nextDouble();
			c = k - 273.15;
			System.out.printf("Temperatura em Celsius = %.2f%n", c);
			break;
			
		case 6:
			System.out.println("Informe a temperatura em Kelvin: ");
			k = sc.nextDouble();
			f = (k - 273.15) * 1.8 + 32;
			System.out.printf("Temperatura em Fahrenheit = %.2f%n", f);
			break;
		
		}
		
	}

}
