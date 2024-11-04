package br.com.apsObjeto;

public class Person {
    private String name;
    private String email;
    private String phoneNumber;
    private String cpf;


//========================= Construtor ===============================
public Person(String name, String email, String phoneNumber, String cpf) {
    this.name = capitalizeWords(name);
    this.email = email;
    this.cpf = cpf;
    this.phoneNumber = phoneNumber;
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

//========================= Getters ===========================================
public String getName() {
    return name;
}

public String getEmail() {
    return email;
}

public String getPhoneNumber() {
    return phoneNumber;
}

public String getCpf() {
    return cpf;
}

//========================= Setters ===========================================
public void setName(String name) {
    this.name = capitalizeWords(name);
}

public void setEmail(String email) {
    this.email = email;
}

public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
}

public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método para exibir informações da pessoa
public void describePerson() {
    System.out.println("Nome: " + name + "\n" +
            "Email: " + email + "\n" +
            "Número de telefone: " + phoneNumber + "\n" +
            "CPF:" + cpf);
}
}