public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();
        elevador.Setter(0, 10, 5, 0);
        elevador.entra(3);
        elevador.getAndarAtual();
        elevador.getPessoas();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.getPessoas();
        elevador.sai(2);
        elevador.getPessoas();
        elevador.getAndarAtual();
    }
}
