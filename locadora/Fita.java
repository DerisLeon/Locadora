package locadora;

public final class Fita implements Locacao {

        public static final int NORMAL = 0;
        public static final int LANCAMENTO = 1;
        public static final int INFANTIL = 2;
        private final String titulo;
        private Classificacao classificacao;

        public Fita(String titulo, int codigoDePreco) {
            this.titulo = titulo;
            setCodigoDePreco(codigoDePreco);
        }

        public void setCodigoDePreco(int codigoDePreco) {
            switch (codigoDePreco) {
                case NORMAL:
                    classificacao = new Normal();
                    break;
                case LANCAMENTO:
                    classificacao = new Lancamento();
                    break;
                case INFANTIL:
                    classificacao = new Infantil();
                    break;
            }
        }

        @Override
        public String getTitulo() {
            return titulo;
        }
        
        @Override
        public double getValorDoAluguel(int diasAlugado) {
            return classificacao.getValorDoAluguel(diasAlugado);
        }

        @Override
        public int getPontosDeAlugadorFrequente(int diasAlugado) {
            return classificacao.getPontosDeAlugadorFrequente(diasAlugado);
        }
    }