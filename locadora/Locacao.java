package locadora;

public interface Locacao {

    public String getTitulo();

    public double getValorDoAluguel(int diasAlugada);

    public int getPontosDeAlugadorFrequente(int diasAlugada);
}
