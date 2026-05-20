public class Carteira{

    String dono;
    double saldoBitcoin;
    String senhaAcesso;

    public Carteira(String dono, String senhaAcesso){
        this.dono = dono;
        this.saldoBitcoin = 0.001;
        this.senhaAcesso = senhaAcesso;
    }

    public void depositar(double qtd){
        this.saldoBitcoin += qtd;
        System.out.println("Sucesso!");
    }
}
