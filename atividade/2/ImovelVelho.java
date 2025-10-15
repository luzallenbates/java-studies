public class ImovelVelho extends Imovel{
    public double desconto; 
    public ImovelVelho(double valor, String localizacao, double desconto) {
        super(valor, localizacao);
        this.desconto = desconto;
        this.valor -= desconto;
    }
    public void mostrarInfo(){
        System.out.println("Valor do Imovel Velho: " + this.valor);
        System.out.println("Localizacao do Imovel Velho: " + this.localizacao);
        System.out.println("Desconto do Imovel Velho: " + this.desconto);
    }
    
}
