import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaCorrente cc = new ContaCorrente(111, 222, "André");
        cc.deposito(1000);
        cc.saque(200); //Saque permitido nessa operação por ser exatos 20% (o limite)
        System.out.println(cc.getInfo());
        cc.deposito(200); //teste de deposito
        System.out.println(cc.getInfo());
        cc.saque(500); //teste de saque acima do permitido
        System.out.println(cc.getInfo());
        
        //testes com input do usuário
        System.out.println("Digite o valor do saque: ");
        cc.saque(sc.nextDouble());
        System.out.println(cc.getInfo());
        System.out.println("Digite o valor do deposito: ");
        cc.deposito(sc.nextDouble());
        System.out.println(cc.getInfo());
        sc.close();
    }
}
