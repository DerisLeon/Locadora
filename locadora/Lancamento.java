package locadora;

public class Lancamento extends Classificacao{
    
    @Override
    public double getValorDoAluguel(int diasAlugado) {
        return diasAlugado * 3;
    }
    
    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugados) {
        return (diasAlugados > 1) ? 2 : 1;
    }
}
