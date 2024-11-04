package br.com.apsObjeto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Cria um objeto Person
        Person person = new Person("João Silva", "joao.silva@email.com", "123-456-789");

        // Cria um objeto Bank com saldo inicial e objeto Person associado
        Bank bankAccount = new Bank(1000.0, person);

        // Define o número da conta
        bankAccount.setAccountNumber("123456789");

        // Exibe as informações da conta e do cliente
        bankAccount.describeAccount();

        // Realiza um depósito
        bankAccount.deposit(200.0);

        // Realiza um saque
        bankAccount.withdraw(150.0);

        // Exibe as informações atualizadas da conta
        bankAccount.describeAccount();
    }
}






