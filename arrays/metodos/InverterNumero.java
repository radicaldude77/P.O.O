/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class InverterNumero {

    public static int inverter(int numero) {
        int invertido = 0;

        while (numero != 0) {
            int digito = numero % 10;          
            invertido = invertido * 10 + digito; 
            numero = numero / 10;              
        }

        return invertido;
    }

    public static void main(String[] args) {
        int num = 123;
        int resultado = inverter(num);

        System.out.println("Número invertido: " + resultado);
    }
}
