public class Bicicleta {
    private int velocidade;
    private int marcha;

    public Bicicleta() {
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void acelerar() {
        velocidade += 5;
        marcha++;
    }

    public void frear() {
        if (velocidade >= 5) {
            velocidade -= 5;
        } else {
            velocidade = 0;
        }

        if (marcha > 0) {
            marcha--;
        } else {
            marcha = 0;
        }
    }
}

