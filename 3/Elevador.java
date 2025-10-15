public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int capacidadeAtual;

    public void inciar(int capacidade, int totalAndares){

    }
    public boolean entra(int pessoas){
        capacidadeAtual=pessoas;
        if(capacidadeAtual<capacidade){
            System.out.println("pessoa entrou, pessoas atualmente: " + capacidadeAtual);
            return true;
        }else{
            System.out.println("Elevador cheio, pessoas atualmente: " + capacidadeAtual);
            return false;
        }
    }
    public boolean sai(int saindo){
        if(capacidadeAtual>0 && saindo<=capacidadeAtual){
            capacidadeAtual-=saindo;
            System.out.println("pessoa saiu, pessoas atualmente: " + capacidadeAtual);
            return true;
        }else{
            return false;
        }

    }
    public void sobe(){
        if (andarAtual<totalAndares){
            andarAtual++;
            System.out.println("subiu, andar atual: " + andarAtual);
        }

    }
    public void desce(){
        if (andarAtual>0){
            andarAtual--;
            System.out.println("desceu, andar atual: " + andarAtual);
        }
    }
    public int getAndarAtual(){
        System.out.println("Andar atual: " + andarAtual);
        return andarAtual;

    }
    public void Setter(int andarAtual, int totalAndares, int capacidade, int capacidadeAtual){
        this.andarAtual=andarAtual;
        this.totalAndares=totalAndares;
        this.capacidade=capacidade;
        this.capacidadeAtual=capacidadeAtual;

    }
    public int getPessoas(){
        return capacidadeAtual;
    }

}
