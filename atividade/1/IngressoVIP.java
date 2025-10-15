public class IngressoVIP extends Ingresso {
    double adicional;
    public IngressoVIP(double valor, double adicional) {
        super(valor);
        this.valor = valor + adicional;
        this.adicional = adicional;
    }
    
}
