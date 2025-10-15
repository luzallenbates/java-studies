public class Main {
    public static void main(String[] args) {
        
        Computador c1 = new Computador(); //objeto em aberto da classe computador
        Computador c2 = new Computador("Asus", 8, "Intel", "RX 6500", 500, "Led", "Full HD"); //objeto em aberto da classe computador
        Computador c3 = new Computador("Asus", 8, "Intel", 500, "Led", "Full HD"); //objeto em aberto da classe computador
        //Cada construtor é desgnado para um tipo diferente de computador

        c1.sysInfo();
        c2.sysInfo();
        c3.sysInfo();

        Celular d1 = new Celular();//objeto em aberto
        Celular d2 = new Celular("Samsung Galaxy S20", 16, "Snapdragon", 256, "AMOLED", "1440p");//estancia um objeto da classe celular sem armazenamento expansivel
        Celular d3 = new Celular("Samsung Galaxy S20", 16, "Snapdragon", 256, "AMOLED", "1440p", 128);//estancia um objeto da classe celular com armazenamento expansivel

        d1.sysInfo();
        d2.sysInfo();
        d3.sysInfo();
    }
        
}
