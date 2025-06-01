public class Principal {
    public static void main(String[] args) {
        Leao leao = new Leao();
        Peixe peixe = new Peixe();

        System.out.println("Comportamento do Leão:");
        leao.emitirSom();
        leao.alimentar();

        System.out.println("\nComportamento do Peixe:");
        peixe.emitirSom();
        peixe.alimentar();
        peixe.nadar();
    }
}
