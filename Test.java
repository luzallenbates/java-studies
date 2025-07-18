import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test{
    public static void main(String[] args) {
        int i = 0;
        BufferedReader palavra = new BufferedReader(new InputStreamReader(System.in));
        String foda = "";
        while (i<=  4) {
            System.out.println("Digite uma palavra: ");
            try {
                foda = foda + " " + palavra.readLine();
            }
            catch (IOException e){
                System.out.println("erro");
            }
            i++;
        }
        System.out.println("Sua frase é: " + foda);
    }
}