package Principal;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Algoritmo que imprima la tabla de multiplicar correspondiente a un número 
		// comprendido entre uno y diez, introducido por el usuario, usando un esquema for. 
		Scanner teclado = new Scanner (System.in);
		int num;
		System.out.println("Introduce un numero");
		num=teclado.nextInt();
		System.out.println("su tabla es");
		for (int x =1; x <=10;  x++) {
			System.out.printf("%d x %d = %d \n", num,x,num*x);
			teclado.close();
		}
	}

}
