public class Principal {
    public static void main(String[] args) {
        Bicicleta bike1 = new Bicicleta();

        System.out.println("Estado inicial:");
        bike1.imprimirEstados();

        System.out.println("Acelerando 2 vezes:");
        bike1.acelerar();
        bike1.imprimirEstados();
        bike1.acelerar();
        bike1.imprimirEstados();

        System.out.println("Freando 1 vez:");
        bike1.frear();
        bike1.imprimirEstados();
    }
}

