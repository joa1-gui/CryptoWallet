public class Principal {
    
    public static void main(String[] args){
        Carteira minhaCarteira = new Carteira("Thiago");
        minhaCarteira.depositar(0.5);
        System.out.println("Saldo Bitcoin: "+minhaCarteira.saldoBitcoin);
    }
}
