package CondicionalesYCiclos;

import java.util.Scanner;

public class CondicionalesYCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int edad=31;
		edad=55;
		System.out.println("La edad es: " + edad);
		
		double sueldo = 167.8989899d;
		float sueldo2 = 167.8989f;
		long sueldo4 = 1678930202801923948l;
		int sueldo3 = 167;*/
		
		/*
		 * Condicionales
		 * 
		 * if
		 * else
		 * else if
		 * switch
		 * 
		 */
		System.out.println("Programa para calcular la hora");
		
		Scanner valorIngresado = new Scanner(System.in);
		
		System.out.println("Ingresa una hora en un formato de 24hrs por favor");
		int hora = valorIngresado.nextInt();
		
		if(hora >= 0 && hora <= 24) {
			System.out.println("Hora bien ingresada");
			if(hora>=0 && hora<=11) {
				System.out.println("Buenos Días");
			}else if(hora>=12 && hora<=18) {
			System.out.println("Buenas Tardes");
			}else if(hora>=19 && hora<=24) {
			System.out.println("Buenas Noches");
			}else {
			System.out.println("Es de madrugada");
			}
			
		}else{
			System.out.println("Hora mal ingresada");
		}
		valorIngresado.close();
	}
}
