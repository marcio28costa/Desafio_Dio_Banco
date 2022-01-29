import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o Novo cliente para abertura de Conta :");
        Cliente Nome = new Cliente();
        Nome.setNome(nome);

        Conta cc = new ContaCorrente(Nome);
        Conta poupanca = new ContaPoupanca(Nome);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
