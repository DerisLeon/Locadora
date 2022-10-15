package locadora;

public class Locadora {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Déris");
        Cliente c2 = new Cliente("Mateus");
        Cliente c3 = new Cliente("Juvenal");
        
        c1.adicionaAluguel(new Aluguel(new Fita("John Wick ", Fita.NORMAL), 3));
        c2.adicionaAluguel(new Aluguel(new Fita("Homens de Preto ", Fita.NORMAL), 2));
        c3.adicionaAluguel(new Aluguel(new Fita("Jurassic Park III ", Fita.LANCAMENTO), 3));
        c1.adicionaAluguel(new Aluguel(new Fita("Planeta dos Macacos ", Fita.LANCAMENTO), 4));
        c2.adicionaAluguel(new Aluguel(new Fita("Vingadores Ultimato ", Fita.INFANTIL), 10));
        c1.adicionaAluguel(new Aluguel(new Fita("Matrix ", Fita.INFANTIL), 30));
        
        System.out.println(c1.extrato());
        System.out.println(c2.extrato());
        System.out.println(c3.extrato());
        
    }
}