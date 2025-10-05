package entities;

public class ContaInvestimento extends Conta{
    private double taxaAdministracao;
    private double projecaoMensal;

    public ContaInvestimento(String numero, String titular, double saldo, double taxaAdministrcao) {
        super(numero, titular, saldo);
        this.taxaAdministracao = taxaAdministrcao;
    }

    public double getTaxaAdministrcao() {
        return taxaAdministracao;
    }

    public void setTaxaAdministrcao(double taxaAdministrcao) {
        this.taxaAdministracao = taxaAdministrcao;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Taxa de administração: " + taxaAdministracao + " %");
    }
    public void mostrarDados(boolean conseiderarTaxa) {
        super.mostrarDados();
        if (conseiderarTaxa == true){
            System.out.println("Saldo líguido: R$" + (saldo*(1+projecaoMensal/100))*(1-taxaAdministracao/100));
        }
    }
}
