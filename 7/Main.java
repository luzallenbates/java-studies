import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionário f1 = new Funcionário("João", "123.456.789-00", "Rua A, 123", "a", 5000, "senha123");
        f1.bonificacao(f1.tipo);
        f1.login();
        
        Funcionário f2 = new Funcionário("Maria", "987.654.321-00", "Rua B, 456", "b", 8000, "senha456");
        f2.bonificacao(f2.tipo);
        f2.login();

        Funcionário f3 = new Funcionário("Pedro", "111.222.333-44", "Rua C, 789", "c", 6000, "senha789");
        f3.bonificacao(f3.tipo);
        f3.login();
        scanner.close();
        
    }
}