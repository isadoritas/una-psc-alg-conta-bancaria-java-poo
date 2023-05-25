public class ContaBancaria {
    private int numeroDaConta;
    private String nomeDaConta;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public void setNomeDaConta(String nomeDaConta) {
        this.nomeDaConta = nomeDaConta;
    }
    public String getNomeDaConta() {
        return nomeDaConta;
    }

    public void depositar(double valor) {
        saldo += valor;
    }
    public void sacar(double valor) {
            saldo -= valor;
        }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getSaldo(double saldo) {
        return saldo;
    }
}




