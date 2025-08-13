public class Carro {
    public int qtdAssentos;
    public double tamanhoAro;
    public double largura;
    public double altura;
    public double profundidade;
    public int potenciaCV;
    public String engine;
    public String marca;
    public String modelo;

    public void setAssts(int asst) {
        this.qtdAssentos = asst;
    }

    public void setAro(double aro) {
        this.tamanhoAro = aro;
    }

    public void setLargura(double larg) {
        this.largura = larg;
    }

    public void setAltura(double alt) {
        this.altura = alt;
    }

    public void setProfundidade(double prof) {
        this.profundidade = prof;
    }

    public void setPotencia(int pot) {
        this.potenciaCV = pot;
    }

    public void setEngine(String eng) {
        this.engine = eng;
    }

    public void setMarca(String marc) {
        this.marca = marc;
    }

    public void setModelo(String model) {
        this.modelo = model;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getEngine() {
        return this.engine;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getPotencia() {
        return this.potenciaCV;
    }

    public int getAssentos() {
        return this.qtdAssentos;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getLargura() {
        return this.largura;
    }

    public double getProfundidade() {
        return this.profundidade;
    }

    public static void main(String[] args) {
        Carro byd = new Carro();
        byd.setModelo("Byd Seal");
        byd.setMarca("BYD");
        byd.setEngine("Motor elétrico 500cv");
        byd.setPotencia(500);
        System.out.println(byd.getModelo() + " " +  byd.getMarca() + " " + byd.getEngine() + " " + byd.getPotencia() + "cv Potencia de rotor");
    }
}
