public class formula1 {
    public String equipe;
    public int pontos;
    public int idadeDaEquipe;
    
    public void setEquipe(String eq){
        this.equipe=eq;
    }
    public void setPontos(int points){
        this.pontos=points;
    }
    public void setIddEquipe(int idd){
        this.idadeDaEquipe=idd;
    }
    public String getEquipe(){
        return equipe;
    }
    public int getPontos(){
        return pontos;
    }
    public int getIdade(){
        return idadeDaEquipe;
    }
    public static void main(String[] args) {
        formula1 Mercedes = new formula1();
        Mercedes.setEquipe("Mercedes AMG Petronas");
        Mercedes.setIddEquipe(15);
        Mercedes.setPontos(170);
        System.out.println("Equipe: " + Mercedes.getEquipe());
        System.out.println("Pontos: " + Mercedes.getPontos());
    }
}
abstract class Carro {
    public int rodas;
    public String tamanhogeral;    
}