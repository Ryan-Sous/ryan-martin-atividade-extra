public class Peixe extends Animal implements Aquatico {
    @Override
    public void emitirSom() {
        System.out.println("O peixe faz um som borbulhante!");
    }

    @Override
    public void alimentar() {
        System.out.println("O peixe está se alimentando de algas.");
    }

    @Override
    public void nadar() {
        System.out.println("O peixe está nadando graciosamente.");
    }
}
