/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(
                "joao",
                "99999-1111",
                "123456",
                "2024001"
        );

        Professor professor = new Professor(
                "wendel",
                "98888-2222",
                "654321",
                "2024002",
                "Mestre"
        );

        Funcionario funcionario = new Funcionario(
                "joao professor",
                "97777-3333",
                "111222",
                "F01",
                "professor"
        );

        Aluno[] lista = {aluno1};

        Responsavel responsavel = new Responsavel(
                "karla",
                "96666-4444",
                "333444",
                lista
        );

        aluno1.saudacao();
        aluno1.aprende();

        professor.ensina();

        funcionario.desempenhaFuncao();

        responsavel.mostrarAlunos();
    }
}