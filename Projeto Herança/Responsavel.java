
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
