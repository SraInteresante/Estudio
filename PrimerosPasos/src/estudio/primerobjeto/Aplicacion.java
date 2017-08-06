package estudio.primerobjeto;

import java.util.Scanner;

public class Aplicacion {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		System.out.println("Aplicación de Persona");
		System.out.println("_______________________________");
		
		Scanner scn = new Scanner(System.in);
		String nombre;
		String apellido;
		
		System.out.println("Ingrese Nombre");
		nombre = scn.next();
		System.out.println("Ingrese Apellido");
		apellido = scn.next();
		
		System.out.println("\nSu nombre es: " + new Persona(nombre, apellido));
		System.out.println("Adios...");
		
		/*
		System.out.println("Aplicación de figura geometrica");
		System.out.println("_______________________________");
		
		Geometria obj = new Geometria();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Ingrese alto");
		obj.setAlto(scn.nextInt());
		System.out.println("Ingrese ancho");
		obj.setAncho(scn.nextInt());
		System.out.println("Ingrese largo");
		obj.setLargo(scn.nextInt());
		
		System.out.println("\nEl volumen de su figura es: " + obj.getVolumen());
		System.out.println("Adios...");
		*/
	}
}
