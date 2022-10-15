package locadora;

public class Infantil extends Classificacao {
    
    @Override
    public double getValorDoAluguel(int diasAlugado) {
        double valorDoAluguel = 1.5;
        if (diasAlugado > 3) {
            valorDoAluguel += (diasAlugado - 3) * 1.5;
        }
        return valorDoAluguel;
    }
}
