public class Bank {
    private String accountNumber;
    private  String name;
    private Double accountBalance;
    private String email;
    private String phoneNumber;


    //=========================Construtor=============================================
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

    private String capitalizeWords(String str) { //Formatação para nome
        String[] words = str.split("\\s+");  // Divide o nome por espaços em branco
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Capitaliza a primeira letra e mantém o resto da palavra em minúsculas
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");  // Adiciona um espaço após cada palavra
            }
        }
        return capitalized.toString().trim();
    }
    //========================Getter========================================
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }
    //==================Setter=================================================


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setName(String name) {
        this.name = capitalizeWords(name);
    }
    // Método auxiliar para capitalizar a primeira letra de cada palavra================


    //=====================================================================================
    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void describeAccount () {
        System.out.println("Nome: " + name + "\n" +
                "Numero da conta: " + accountNumber + "\n" +
                "Saldo: " + accountBalance + "\n" +
                "Email:" + email + "\n" +
                "Numero de telefone: "+ phoneNumber);
    }
}
