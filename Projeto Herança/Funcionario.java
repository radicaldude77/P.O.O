/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Funcionario extends Pessoa {

    private String cod;
    private String funcao;

    public Funcionario(String nome, String fone, String cpf,
                       String cod, String funcao) {

        super(nome, fone, cpf);
        this.cod = cod;
        this.funcao = funcao;
    }

    public void desempenhaFuncao() {
        System.out.println(nome + " trabalha como " + funcao);
    }
}