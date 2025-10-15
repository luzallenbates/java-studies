public abstract class Pessoafisica extends Pessoa {
    protected String cpf;
    protected String endereco;

    public Pessoafisica(String nome, String cpf, String endereco) {
        super(nome);
        this.cpf = cpf;
        this.endereco = endereco;
    }
}
