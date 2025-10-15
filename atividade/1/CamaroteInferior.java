public class CamaroteInferior extends IngressoVIP {
    private String localizacao;

    public CamaroteInferior(double valor, String localizacao, double adicional) {
        super(valor, adicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localização do camarote inferior: " + localizacao);
    }
    void imprimeValor() {
        System.out.println("Valor do ingresso VIP: " + valor);
    }
    
}
