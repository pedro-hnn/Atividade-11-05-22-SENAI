

public class Conta {

    private String nome;
    private String numero_conta;
    private String agencia;
    private Double saldo;

    public Conta(String nome, String numero_conta, String agencia, Double saldo) {
        this.nome = nome;
        this.numero_conta = numero_conta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public void Saque(Double valor){
        this.saldo = this.saldo - valor;
    }

    public void Deposito(Double valor){
        this.saldo = this.saldo + valor;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero_conta(String numero_conta) {
        this.numero_conta = numero_conta;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", numero_conta=" + numero_conta +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
