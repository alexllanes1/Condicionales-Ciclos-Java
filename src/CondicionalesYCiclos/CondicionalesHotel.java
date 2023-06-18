package CondicionalesYCiclos;

import java.util.Scanner;

public class CondicionalesHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Servicios Adicionales
		
		System.out.println("Servicios Adicionales");
		System.out.println("Usted solicito Servicios Adicionales? 1.- Sí, escriba true, 2.-No, escriba false");
		//Pedir al usuario elegir una opcion 
		Scanner solicitudServiciosAdicionales = new Scanner(System.in);
		
		boolean ServiciosAdicionales = solicitudServiciosAdicionales.nextBoolean();
		
		if(ServiciosAdicionales) { //Si hay servicios se le hara el cargo de lo que ocupo a su cuenta
			System.out.println("Usted solicito Servicios Adicionales, , se le hara un cargo extra");
		} else { //Se imprime si el usuario no ocupa Servicios Adicionales
			System.out.println("Usted NO solicito Servicios Adicionales");
		}
		
		solicitudServiciosAdicionales.close(); //cierre del scanner
		
		//Temporada
		
		System.out.println("Temporada");
		System.out.println("Escriba el numero del mes que les gustaría visitarnos para ver si son temporada alta o baja.");
		Scanner solicitudTemporada = new Scanner(System.in);
		int mes = solicitudTemporada.nextInt();
		
		if(mes >=1 && mes <=3) {
			System.out.println("Es temportada baja. Descuentos especiales disponibles."); // Aquí irían las acciones adicionales para la temporada baja.
		}else if (mes >= 4 && mes <=9) {
			System.out.println("Es temporada alta. Tarifas regulares aplican.");
		}else if(mes >= 10 && mes <=12) {
			System.out.println("Es temporada baja. Descuentos especiales disponibles.");
			
		}else {
			System.out.println("El mes proporcionado no es válido");
		}
		
		
		solicitudTemporada.close(); //cierre del scanner
		
		
		//Horario
		
			System.out.println("Ingrese el horario de check-in(HH:mm): ");
			Scanner check = new Scanner(System.in);
			
			String checkIn = check.nextLine();
			
			System.out.println("Ingrese el horario de check-out(HH:mm): ");
			String checkOut = check.nextLine();
			
			//Para mostrar el horario ingresado
			System.out.println("Horario de Check-In: " + checkIn);
			System.out.println("Horario de Check-Out: " + checkOut);
			
			check.close(); //cierre del scanner
		
		//Room Service
			
			System.out.println("Room service");
			System.out.println("Usted solicito el Room Service? 1.- Si escriba true 2.- No, escriba false"); //Se pregunta si hubo usos de servicios adicionales
			Scanner solicitudRS = new Scanner(System.in);
			
			boolean roomService = solicitudRS.nextBoolean();
			
			if(roomService) { //Si hay servicios se le hara el cargo de lo que ocupo a su cuenta
			System.out.println("Usted solicito Room Service, se le hara un cargo extra");
			}else { //Como no ocupo 
			System.out.println("Usted NO solicito Room Service");

			}
			
			solicitudRS.close(); //cierre del scanner

		//huesped adicional

			System.out.println("Ingrese el numero total de huespuedes que le gustaria en su habitacion");
			//Preguntar la cantidad de huespuedes extra
			Scanner huespuedes = new Scanner(System.in);
			
			int huespuedesAdicionales = huespuedes.nextInt();
			
			int capacidadMaxima = 4;
			
			if(huespuedesAdicionales < capacidadMaxima) {
				System.out.println("Puede agregar un huésped adicional a la habitación. ");
				
			}else {
				System.out.println("La habitación ha alcanzado su capacidad máxima de huéspedes.");
			}
			
			huespuedes.close(); //cierre del scanner
		


	}

}
