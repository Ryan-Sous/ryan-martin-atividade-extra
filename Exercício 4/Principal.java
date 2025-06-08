public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro("Corolla", 2022);
        Moto moto = new Moto("CG 160", 2023);
        BicicletaEletrica bike = new BicicletaEletrica("E-Bike", 2024);

        carro.alugar();
        carro.abastecer();

        moto.alugar();
        moto.abastecer();

        bike.alugar();
    }
}
