package locadora;

public class Aluguel {

    private final Locacao item;
    private final int diasAlugado;

    public Aluguel(Locacao item, int diasAlugado) {
        this.item = item;
        this.diasAlugado = diasAlugado;
    }
    
    public String getTitulo(){
        return item.getTitulo();
    }

    public Locacao getItem() {
        return item;
    }

    public int getDiasAlugado() {
        return diasAlugado;
    }

    public int getPontosDeAlugadorFrequente() {
        return item.getPontosDeAlugadorFrequente(diasAlugado);
    }

    public double getValorDoAluguel() {
        return item.getValorDoAluguel(diasAlugado);
    }
}