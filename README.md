💰 Bank Account Simulator
This project was developed as part of an academic assignment worth points, where I applied and consolidated my knowledge of Object-Oriented Programming (OOP) in Java. The goal was to create a simple banking management system that allows basic operations such as deposits, withdrawals, and balance inquiries.

🎯 Project Objective
This project demonstrates the use of classes, methods, encapsulation, and constructors. Throughout the development, I improved my Java skills, gained a better understanding of object-based system structures, and explored best programming practices.

🚀 How to Run the Project
Clone the repository:

```
git clone https://github.com/SeuUsuario/NomeDoProjeto.git
cd NomeDoProjeto
```
Compile the files:

```
javac src/br/com/apsObjeto/*.java
```
Run the program:

```
java src/br/com/apsObjeto/Main
```

📌 Features Implemented
✔️ Person Class: Represents a customer, storing name, email, phone number, and CPF.
✔️ Bank Class: Represents a bank account, allowing deposits, withdrawals, and balance inquiries.
✔️ Deposit and Withdraw Methods: Manage banking transactions with basic validations.
✔️ Data Display: Methods to show account and customer information.

🔹 Code Example

```
  // Criando um cliente
  Person cliente = new Person("João Silva", "joao@email.com", "123456789", "11042882710");
  
  // Criando uma conta bancária associada ao cliente
  Bank conta = new Bank(1000.0, cliente);
  conta.setAccountNumber("123456789");
  
  // Exibindo os dados da conta
  conta.describeAccount();
  
  // Realizando operações
  conta.deposit(200.0);
  conta.withdraw(150.0);
  
  // Exibindo saldo atualizado
  conta.describeAccount();
```
🎓 What I Learned
During this project, I reinforced key concepts such as:
✅ Encapsulation and access modifiers (private, public)
✅ Using constructors to initialize objects
✅ Setter and getter methods for secure attribute manipulation
✅ Input validation to prevent invalid operations

📌 Notes
This project is part of my learning journey and reflects my progress in object-oriented programming. There is still much to improve and refactor, but it was a great exercise to strengthen fundamental concepts! 😃

