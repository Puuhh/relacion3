package Principal;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Algoritmo que escriba los números impares comprendidos entre dos enteros 
		//introducidos por el usuario. 
		Scanner teclado = new Scanner (System.in);
		int num;
		int num2;
		System.out.println("Introduce un numero");
		num = teclado.nextInt();
		System.out.println("Introduce un segundo numero");
		num2 = teclado.nextInt();
		if (num%2==0) {
			num++;}
		for (int x=num; x<num2; x=x+2) {
			System.out.printf("los numeros primos son %d \n", x);
			teclado.close();
		}
		

	}

}
