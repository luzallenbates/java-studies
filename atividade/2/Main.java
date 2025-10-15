public class Main {
public static void main(String[] args) {
    ImovelNovo imovelNovo = new ImovelNovo(100000, "Rua A, 123", 5000);
    imovelNovo.mostrarInfo();

    ImovelVelho imovelVelho = new ImovelVelho(80000, "Rua B, 456", 3000);
    imovelVelho.mostrarInfo();
}
    
} 
