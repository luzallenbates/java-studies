public class Computador {
    int ram;
    String processador;
    String gpu;
    int armazenamento;
    String tela;
    String resolução;
    String modelo;

    Computador(String modelo, int ram, String processador, int armazenamento, String tela, String resolução) {
        this.ram = ram;
        this.processador = processador;
        this.armazenamento = armazenamento;
        this.tela = tela;
        this.resolução = resolução;
    }
    Computador(){

    }
    Computador(String modelo, int ram, String processador, String gpu, int armazenamento, String tela, String resolução) {
        this.ram = ram;
        this.processador = processador;
        this.gpu = gpu;
        this.armazenamento = armazenamento;
        this.tela = tela;
        this.resolução = resolução;
    }
    public void sysInfo(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("RAM: " + this.ram);
        System.out.println("Processador: " + this.processador);
        System.out.println("GPU: " + this.gpu);
        System.out.println("Armazenamento: " + this.armazenamento);
        System.out.println("Tela:  " + this.tela);
        System.out.println("Resolução: " + this.resolução);
    }
}
