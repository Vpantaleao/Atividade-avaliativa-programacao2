package entities;

public class Veiculo {
    private String placa, marca;
    private double preco;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrarDados() {
        System.out.println("Placa do veículo: " + placa);
        System.out.println("Marca do veículo: " + marca);
        System.out.println("Preço do veículo: R$ " + preco);
    }
    public void mostrarDados(double desconto) {
        System.out.println("Placa do veículo: " + placa);
        System.out.println("Marca do veículo: " + marca);
        System.out.println("Preço do veículo: R$ " + (preco - (preco*desconto/100)));
    }
}
