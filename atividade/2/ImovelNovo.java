public class ImovelNovo extends Imovel{
    double adicional;
    public ImovelNovo(double valor, String localizacao, double adicional) {
        super(valor, localizacao);
        this.adicional = adicional;
        this.valor += adicional;

    }
    public void mostrarInfo(){
        System.out.println("Valor do Imovel Novo: " + this.valor);
        System.out.println("Localizacao do Imovel Novo: " + this.localizacao);
        System.out.println("Adicional do Imovel Novo: " + this.adicional);
    }
    
}
