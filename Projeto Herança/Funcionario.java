
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
