/**
 * Clase de variable int y String
 * 
 * @author camila
 *
 */
public class Variables {
	public static void main(String[] args) {
		System.out.println("Haré un ejercicio de suma");
		int variable1;
		int variable2;
		variable1 = 1;
		variable2 = 2;

		System.out.println("varible1= " + variable1);
		System.out.println("varible2= " + variable2);
		System.out.println("la suma es " + (variable1 + variable2));

		System.out.println("\n···········\t·············\n");
		/*
		 * back slach: "\" significa que algo especial viene a su derecha. En
		 * este caso "n" es un salto de línea
		 */

		String variable3;
		String variable4;
		variable3 = "s";
		variable4 = "i";

		System.out.println("varible3= " + variable3);
		System.out.println("varible4= " + variable4);
		System.out.println("la suma es " + (variable3 + variable4));

		System.out.println("\n__________________________\n");

		/*
		 * al usar la variable de enteros "int" se sumaron números a la
		 * operación, así también al usar la variable "String" se sumaron
		 * palabras, entonces al colocar varible3 = a 4 y variable 4= a 5, se
		 * sumaron, una al lado de la otra "la suma es 45" lo mismo con la
		 * palabras "si"
		 * 
		 * String es un objeto, así que siempre va con mayúscula int en cambio
		 * es un primitivo, al igual que binarios, operaciones
		 * 
		 * 
		 * comandos como Ctrl ____ (espacio) para que java finiquite la
		 * operaciòn ej. syso Ctrl (espacio) y termina con System.out.println ()
		 * Ctrl f = justifica las oraciones
		 */
		short variable5;
		short variable6;
		variable5 = 3;
		variable6 = 4;

		System.out.println("varible5= " + variable5);
		System.out.println("varible6= " + variable6);
		System.out.println("la multiplicación es " + (variable5 * variable6));

		System.out.println("\n$$$$$$$$$$$$$$$$$$$$$\n");

		long variable7;
		long variable8;
		variable7 = 190;
		variable8 = -19;

		System.out.println("varible7= " + variable7);
		System.out.println("varible8= " + variable8);
		System.out.println("la división es" + (variable7 / variable8));

		System.out.println("\n-----------------------\n");

		float a;
		float b;
		a = 0.1f;
		b = 0.2f;

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("la resta entre es" + (a - b));

		System.out.println("\njajjajajajjajajajja\n");

		/*
		 * al utilizar float, debes señalar que es un float, es decir al final
		 * del nùmero declarado le agregas una f
		 */

		double c;
		double d;
		c = 14.34d;
		d = 34.98d;

		System.out.println("lA SUMA ES=" + (c + d));

		System.out.println("\n..a..a..a..a..\n");

		int e = 1;
		int f = 2;
		boolean g = (e + f == 2);
		
		System.out.println("Entonces es= "+ (g));
	
		System.out.println("\n............\n");
		
		char h;
		h = 64;
		char i = '@';
		
		
		System.out.println("h == i " + (h==i));
		
		
	}
}
