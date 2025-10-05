package entities;

public class Moto extends Veiculo{
    private int cilindradas;

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Número de cilindradas da moto: " + cilindradas);
    }
    public void mostrarDados(boolean emCavalos) {
        super.mostrarDados();
        System.out.println("Número de cilindradas em cavalos de potência da moto: " + (cilindradas / 10));
    }
}
