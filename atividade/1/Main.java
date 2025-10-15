public class Main {

    public static void main(String[] args) {
       CamaroteInferior ci = new CamaroteInferior(100, "Lateral", 45);
        ci.imprimeLocalizacao();
        ci.imprimeValor();
        CamaroteSuperior cs = new CamaroteSuperior(100, "Frontal", 45, 30);
        cs.imprimeLocalizacao();
        cs.imprimeValor();

        IngressoNormal in = new IngressoNormal(100);
        System.out.println("Valor do ingresso normal: " + in.valor);
    }
}