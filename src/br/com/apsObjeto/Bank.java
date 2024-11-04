package br.com.apsObjeto;

public class Bank {
    private String accountNumber;

    private Double accountBalance;

    private Person person;

    //=========================Construtor=============================================

    // Construtor que aceita saldo inicial e dados do cliente
    public Bank(Double initialBalance, Person person) {
        this.accountBalance = initialBalance;
        this.person = person;
    }

    public Bank (Double initialBalance){
        this.accountBalance = initialBalance; //Valor inicial
    }
    //=========================Metodo=============================================
    public void deposit (Double value){
        if (value > 0) {
            accountBalance += value; // Aumenta valor
            System.out.println("Deposito de $" + value + " realizado com sucesso " + "Valor atual $"
                    + this.accountBalance );
        } else {
            System.out.println("Valor de deposito invalido");
        }
    }

    public void withdraw (Double value){
        if (value > 0 && value <= accountBalance ){
            accountBalance -= value; //Diminui valor
            System.out.println("Saque de $" + value + " realizado com sucesso" + "Valor atual $"
                    + this.accountBalance );
        } else if (value > accountBalance) {
            System.out.println("Saldo insufiiente");
        } else {
            System.out.println("Valor de saque invalido");
        }
    }


    //========================Getter========================================
    public String getAccountNumber() {
        return accountNumber;
    }


    public Double getAccountBalance() {
        return accountBalance;
    }

    public Person getPerson() {
        return person;
    }

    //==================Setter=================================================


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPerson(Person person) {
        this.person = person;
    }



    //=====================================================================================
    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }


    public void describeAccount() {
        System.out.println("Informações da Conta:");
        System.out.println("Número da conta: " + accountNumber);
        System.out.println("Saldo: " + accountBalance);
        System.out.println("Informações do Cliente:");
        person.describePerson(); // Chama o método da classe Person para exibir informações pessoais
    }
}

