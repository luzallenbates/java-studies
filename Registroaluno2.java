public class Registroaluno2 {

    public String nome;
    public int idade;
    public String curso;
    public String telefone;
    public static int qtdAlunos = 0;

    public void setNome(String temp){
        nome = temp;
    }
    public String getnome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getCurso(){
        return curso;
    }
    public String getTelefone(){
        return telefone;
    }
    public static void main(String[] args) {
        Registroaluno2 aluno1 = new Registroaluno2();
        aluno1.setNome("João");
        aluno1.idade = 20;
        aluno1.curso = "Engenharia";
        aluno1.telefone = "1234-5678";
        qtdAlunos++;

        System.out.println("Nome: " + aluno1.getnome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Curso: " + aluno1.getCurso());
        System.out.println("Telefone: " + aluno1.getTelefone());
        System.out.println("Quantidade de alunos registrados: " + qtdAlunos);
        Registroaluno2 aluno2 = new Registroaluno2();
        aluno2.setNome("Maria Clara");
        aluno2.idade = 22;
        aluno2.curso = "Medicina";
        aluno2.telefone = "8765-4321";
        qtdAlunos++;
        System.out.println("Nome: " + aluno2.getnome());
        System.out.println("Idade: " + aluno2.getIdade());
        System.out.println("Curso: " + aluno2.getCurso());
        System.out.println("Telefone: " + aluno2.getTelefone());
        System.out.println("Quantidade de alunos registrados: " + qtdAlunos);
        
    }
}