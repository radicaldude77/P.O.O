
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
