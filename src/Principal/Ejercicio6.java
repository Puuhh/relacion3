package Principal;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Algoritmo que calcule el factorial de un número entero introducido por el usuario.
		Scanner teclado = new Scanner(System.in);
		int num;
		int res=1;
		System.out.println("Introduce un numero");
		num=teclado.nextInt();
		for (int x=num; x>0; x--) {
			res=res*x;
		}

		System.out.printf("El resultado es %d \n", res);
		teclado.close();
	}

}