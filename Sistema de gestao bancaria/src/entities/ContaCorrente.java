package entities;

public class ContaCorrente extends Conta{
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, String titular, double saldo, double limiteChequeEspecial) {
        super(numero, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Limite do cheque especial: R$" + limiteChequeEspecial);
    }
    public void mostrarDados(boolean detalharLimite) {
        super.mostrarDados();
        System.out.println("Limite do cheque especial: " + limiteChequeEspecial);
        if(detalharLimite == true){
            System.out.println("Saldo disponível: " + (saldo+limiteChequeEspecial));
        }
    }

}

