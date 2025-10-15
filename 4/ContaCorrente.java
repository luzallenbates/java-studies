public class ContaCorrente {
    private double saldo;
    private int agencia;
    private int numero;
    private String titular;

    public ContaCorrente(int agencia, int numero, String titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }
    public void deposito(double valor){
        this.saldo+=valor;
    }
    public void saque(double valor){
        if (valor > this.saldo*0.2){
            System.out.println("Saque negado, valor acima do permitido");
        }else{
            this.saldo-=valor;
            System.err.println("Saque realizado com sucesso, saldo atual: "+this.saldo);
        }
    }
    public double getSaldo(){
        return this.saldo;
    }
    public int getAgencia(){
        return this.agencia;
    }
    public int getNumero(){
        return this.numero;
    }
    public String getTitular(){
        return this.titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public String getInfo(){
        return "Agencia: "+this.agencia+"\nNumero: "+this.numero+"\nTitular: "+this.titular+"\nSaldo: "+this.saldo;
    }
}
