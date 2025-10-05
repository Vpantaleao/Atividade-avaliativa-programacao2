package entities;

public class Carro extends Veiculo{
    private int numPortas;

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Número de portas do carro: " + numPortas);
    }
    public void mostrarDados(boolean semPortas) {
        super.mostrarDados();
    }
}
