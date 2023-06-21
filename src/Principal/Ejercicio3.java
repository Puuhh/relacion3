package Principal;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/* Algoritmo que imprima la tabla de multiplicar correspondiente a un número 
		comprendido entre uno y diez, introducido por el usuario, usando un esquema do 
			while. Nota: En los tres ejercicios anteriores, el programa ha de controlar mediante 
			un esquema do-while, que el número está comprendido entre 1 y 10. 
*/
		Scanner teclado = new Scanner (System.in);
		int num;
		int x =1;
		System.out.println("Introduce un numero");
		num=teclado.nextInt();
		do { 
			System.out.printf("%d x %d = %d \n", num,x,num*x);
		x++;}
		while (x<=10);
		teclado.close();
			
		}
	}


