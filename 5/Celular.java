public class Celular {
    int ram;
    int armazenamento;
    String tela;
    String resolucao;
    String processador;
    String modelo;
    int armazenamento_extra;
    Celular(){
        
    }
    Celular(String modelo, int ram, String processador, int armazenamento, String tela, String resolucao){
        this.ram = ram;
        this.processador = processador;
        this.armazenamento = armazenamento;
        this.tela = tela;
        this.resolucao = resolucao;
    }
    Celular(String modelo, int ram, String processador, int armazenamento, String tela, String resolucao, int armazenamento_extra){
        this.ram = ram;
        this.processador = processador;
        this.armazenamento = armazenamento;
        this.tela = tela;
        this.resolucao = resolucao;
        this.armazenamento_extra = armazenamento_extra;
    }

    public void sysInfo(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Armazenamento" + this.armazenamento);
        System.out.println("Chipset: " + this.processador);
        System.out.println("Resolução: " + this.resolucao);
        System.out.println("Tela: " + this.tela);
        System.out.println("RAM: " + this.ram);
        System.out.println("Expansão de armazenamento: " + this.armazenamento_extra);
    }
    
}
