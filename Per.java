public class Per {
   public String nome;
   public int idade;
   public String endereco;

   public void setNome(String nm){
      this.nome=nm;
   }
   public void setIdade(int idd){
      this.idade=idd;
   }
   public void setEndereco(String end){
      this.endereco=end;
   }
   public String getNome(){
      return this.nome;
   }
   public int getIdade(){
      return this.idade;
   }
   public String getEndereco(){
      return this.endereco;
   }

   public static void main(String[] args) {
      Est joao = new Est();
      joao.setCurso("Medicina");
      joao.setNome("João Victor");
      joao.setIdade(18);
      joao.setSemestre(2);
      System.out.println("Nome: " + joao.getNome());
      System.out.println(joao.getCurso());
      System.out.println(joao.getIdade());
   }
}
class Est extends Per{
   public String curso;
   public double gpa;
   public int semestre;

   public void setCurso(String cur){
      this.curso=cur;
   }
   public void setGpa(double gg){
      this.gpa=gg;
   }
   public void setSemestre(int sem){
      this.semestre=sem;
   }
   public String getCurso(){
      return this.curso;
   }
   public double getGpa(){
      return this.gpa;
   }
   public int getSem(){
      return this.semestre;
   }
}
