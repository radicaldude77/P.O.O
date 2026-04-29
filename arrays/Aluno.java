/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Aluno {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double[] notas = new double[10];

		double soma = 0;
		double maior, menor;

		for (int i = 0; i < 10; i++) {
			System.out.print("digite a nota do aluno " + (i+1) + ": ");
			notas[i] = sc.nextDouble();
			soma += notas[i];
		}

		maior = notas[0];
		menor = notas[0];

		for (int i = 0; i < 10; i++) {
			if (notas[i] > maior) {
				maior = notas[i];
			}
			if (notas[i] < menor) {
				menor = notas[i];
			}
		}

		double media = soma / 10;

		System.out.println("media: " + media);
		System.out.println("maior nota: " + maior);
		System.out.println("menor nota: " + menor);
	}
}