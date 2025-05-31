public class Bicicleta {
    int cadencia;
    int velocidade;
    int marcha;
    int velocidadeMaxima;

    // Construtor com inicialização completa
    public Bicicleta(int cadencia, int velocidade, int marcha, int velocidadeMaxima) {
        this.cadencia = cadencia;
        this.velocidade = velocidade;
        this.marcha = marcha;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void mudarCadencia(int novoValor) {
        cadencia = novoValor;
    }

    public void mudarMarcha(int novoValor) {
        marcha = novoValor;
    }

    public void aumentarVelocidade(int incremento) {
        velocidade += incremento;
    }

    public void frear(int decremento) {
        velocidade -= decremento;
        if (velocidade < 0) {
            velocidade = 0;
        }
    }

    public void imprimirEstados() {
        System.out.println("Cadência: " + cadencia +
                           " | Velocidade: " + velocidade +
                           " | Marcha: " + marcha);
    }
}
