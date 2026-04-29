/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {

    public static int contarCaracteres(String frase) {
        return frase.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite uma frase: ");
        String frase = scanner.nextLine();

        int quantidade = contarCaracteres(frase);

        System.out.println("a frase tem " + quantidade + " caracteres.");

        scanner.close();
    }
}