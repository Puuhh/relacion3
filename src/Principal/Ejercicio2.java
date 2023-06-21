package Principal;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Algoritmo que imprima la tabla de multiplicar correspondiente a un número 
		//comprendido entre uno y diez, introducido por el usuario, usando un esquema 
		//while
		Scanner teclado = new Scanner (System.in);
		int num;
		int x =1;
		System.out.println("Introduce un numero");
		num=teclado.nextInt();
		System.out.println("su tabla es");
		while (x<=10) {
			System.out.printf("%d x %d = %d \n", num,x,num*x);
			x++;
			teclado.close();
		}

	}

}
