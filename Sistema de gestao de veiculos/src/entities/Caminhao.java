package entities;

public class Caminhao extends Veiculo{
    private double capacidadeCarga;

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Capacidade de carga do caminhão em quilos: " + capacidadeCarga + " kg");
    }
    public void mostrarDados(boolean emTonelada) {
        super.mostrarDados();
        System.out.println("Capacidade de carga do caminhão em toneladas: " + (capacidadeCarga/100) + " t");
    }
}
