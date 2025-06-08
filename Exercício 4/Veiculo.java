public abstract class Veiculo {
    protected String modelo;
    protected int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void alugar() {
        System.out.println("Veículo alugado: " + modelo + " (" + ano + ")");
    }
}
