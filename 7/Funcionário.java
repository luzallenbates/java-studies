import java.util.Scanner;
public class Funcionário extends Pessoafisica {
    String tipo;
    double porcentagem;
    double salario;
    String senha;
    Scanner scanner = new Scanner(System.in);
    public Funcionário(String nome, String cpf, String endereco, String tipo, double salario, String senha) {
        super(nome, cpf, endereco);
        this.tipo = tipo;
        this.salario = salario;
        this.senha = senha;
    }
    void bonificacao(String tipo){
        if (tipo == "a"){
            this.porcentagem = 0.1;
        }
        else if (tipo == "b"){
            this.porcentagem = 0.07;
        }
        else if (tipo == "c"){
            this.porcentagem = 0.04;
        }
        this.salario = this.salario + (this.salario * this.porcentagem);
    }
    void mostrarDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Salário com bonificação: " + this.salario);
    }
    void login(){
        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();
        if (this.senha.equals(senha)){
            System.out.println("Login realizado com sucesso!");
            this.mostrarDados();
        }
        else{
            System.out.println("Senha incorreta!");
        }
    }
}

