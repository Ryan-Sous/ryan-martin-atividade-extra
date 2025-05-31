public class Bicicleta {
    int cadencia;
    int velocidade;
    int marcha;
    int velocidadeMaxima;

    public Bicicleta(int cadencia, int velocidade, int marcha, int velocidadeMaxima) {
        this.cadencia = cadencia;
        this.velocidade = Math.min(velocidade, velocidadeMaxima);
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
        if (velocidade + incremento <= velocidadeMaxima) {
            velocidade += incremento;
        } else {
            velocidade = velocidadeMaxima;
        }
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
                           " | Marcha: " + marcha +
                           " | Velocidade Máxima: " + velocidadeMaxima);
    }
}
