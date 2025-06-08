public class Moto extends Veiculo implements Motorizado {

    public Moto(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo a moto: " + modelo);
    }
}
