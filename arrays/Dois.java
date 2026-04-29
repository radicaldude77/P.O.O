/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Arrays;
import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[20];
        int[] c = new int[30];

        for (int i = 0; i < 10; i++) {
            System.out.print("digite A[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            System.out.print("digite B[" + i + "]: ");
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < 20; i++) {
            c[i + 10] = b[i];
        }

        Arrays.sort(c);

        System.out.println("vetor c ordenado:");
        for (int i = 0; i < 30; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
