package entities;

public class ContaPoupanca extends Conta{
    private double taxaRendimentoMensal;

    public ContaPoupanca(String numero, String titular, double saldo, double taxaRendimentoMensal) {
        super(numero, titular, saldo);
        this.taxaRendimentoMensal = taxaRendimentoMensal;
    }

    public double getTaxaRendimentoMensal() {
        return taxaRendimentoMensal;
    }

    public void setTaxaRendimentoMensal(double taxaRendimentoMensal) {
        this.taxaRendimentoMensal = taxaRendimentoMensal;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Taxa de rendimento mensal: " + taxaRendimentoMensal + "%");
    }

    public void mostrarDados(boolean emTaxaAnual) {
        super.mostrarDados();
        System.out.println("Taxa de rendimento mensal: " + taxaRendimentoMensal + "%");
        if(emTaxaAnual == true){
            System.out.println("Taxa de rendimento anual: " + taxaRendimentoMensal*12 + "%");
        }
    }
}

