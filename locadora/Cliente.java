package locadora;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Cliente {

    private final String nome;
    private final Collection fitasAlugadas = new ArrayList();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        fitasAlugadas.add(aluguel);
    }

    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        Iterator alugueis = fitasAlugadas.iterator();
        String resultado = "Registro de Alugueis de " + getNome() +":"+ fimDeLinha;
        while (alugueis.hasNext()) {
            double valorCorrente = 0.0;
            Aluguel cada = (Aluguel) alugueis.next();
            valorCorrente += cada.getValorDoAluguel();
            pontosDeAlugadorFrequente += cada.getPontosDeAlugadorFrequente();
            resultado += cada.getTitulo() + ": "+ valorCorrente + fimDeLinha;
            valorTotal += valorCorrente;
        }
        
        resultado += "Valor total: R$" + valorTotal + fimDeLinha;
        resultado += "Você acumulou " + pontosDeAlugadorFrequente + " pontos de alugador frequente!\n";
        return resultado;
    }
}
