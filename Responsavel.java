/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Responsavel extends Pessoa {

    private Aluno[] alunos;

    public Responsavel(String nome, String fone, String cpf,
                       Aluno[] alunos) {

        super(nome, fone, cpf);
        this.alunos = alunos;
    }

    public void mostrarAlunos() {

        System.out.println("Alunos do responsável " + nome + ":");

        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.nome);
        }
    }
}