public class Principal {
    public static void main(String[] args) {
        Bicicleta minhaBicicleta = new Bicicleta(25); // velocidade máxima = 25

        minhaBicicleta.mudarMarcha(3);
        minhaBicicleta.aumentarVelocidade(10);
        minhaBicicleta.aumentarVelocidade(20); // deve travar no 25

        minhaBicicleta.imprimirEstados();
    }
}
