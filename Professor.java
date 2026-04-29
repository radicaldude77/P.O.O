/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Professor extends Aluno {

    private String titulo;

    public Professor(String nome, String fone, String cpf,
                     String mtr, String titulo) {

        super(nome, fone, cpf, mtr);
        this.titulo = titulo;
    }

    public void ensina() {
        System.out.println(nome + " está ensinando.");
    }
}