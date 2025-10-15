public class CamaroteSuperior extends IngressoVIP {
    private String localizacao;
    private double adicionalcamarote;

    public CamaroteSuperior(double valor, String localizacao, double adicional,double adicionalcamarote) {
        super(valor, adicional);
        this.localizacao = localizacao;
        this.adicionalcamarote = adicionalcamarote;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localização do camarote superior: " + localizacao);
    }
    void imprimeValor() {
        System.out.println("Valor do ingresso VIP: " + (valor + adicionalcamarote));
    }
    
}
