
public class Aluno extends Pessoa {

    private String mtr;

    public Aluno(String nome, String fone, String cpf, String mtr) {
        super(nome, fone, cpf);
        this.mtr = mtr;
    }

    public void aprende() {
        System.out.println(nome + " está aprendendo.");
    }
}
