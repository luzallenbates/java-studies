import java.util.Scanner;
public class tabuads {
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        System.out.println("Tabuada do numero:");
        for (int i = 0; i < 10; i++) {
            System.out.println(n * (i+1));
            
            num.close();
        }
    }
}
