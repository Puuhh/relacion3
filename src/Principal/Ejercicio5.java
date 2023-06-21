package Principal;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Algoritmo que sume los n primeros números enteros, siendo n un número 
		//introducido por el usuario
		Scanner teclado = new Scanner(System.in);
		int num;
		int res = 0;
		System.out.println("Introduce un numero");
		num =teclado.nextInt();
		for (int x =1; x<=num; x++ ) {
			res =res + x;}
			
		System.out.printf("El resultado es %d",res);
		teclado.close();
		
			
		}

	}


