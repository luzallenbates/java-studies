import java.util.Scanner;
public class Main {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		Carro c1 = new Carro();
		System.err.println("Digite o modelo di carrinho: ");
		c1.modelo = scanner.nextLine();
		System.out.println("Modelo: " + c1.modelo);
	}
}

