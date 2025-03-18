💰 Simulador de Conta Bancária
Este é um projeto desenvolvido como parte de um trabalho acadêmico valendo pontos, onde fui aplicando e consolidando meu conhecimento sobre Programação Orientada a Objetos (POO) em Java. O objetivo foi criar um sistema simples de gerenciamento bancário, permitindo operações básicas como depósito, saque e consulta de saldo.

🎯 Objetivo do Projeto
Este projeto foi feito para demonstrar o uso de classes, métodos, encapsulamento e construtores. Durante o desenvolvimento, fui aprimorando minhas habilidades com Java, entendendo melhor a estrutura de um sistema baseado em objetos e explorando boas práticas de programação.

🚀 Como rodar o projeto
Clone o repositório:

```
git clone https://github.com/SeuUsuario/NomeDoProjeto.git
cd NomeDoProjeto
```
Compile os arquivos:

```
javac src/br/com/apsObjeto/*.java
```
Execute o código:

```
java src/br/com/apsObjeto/Main
```

📌 O que foi implementado?
✔️ Classe Person: Representa um cliente, armazenando nome, e-mail, telefone e CPF.
✔️ Classe Bank: Representa a conta bancária, permitindo depósitos, saques e consulta de saldo.
✔️ Métodos deposit e withdraw: Gerenciam transações bancárias com validações básicas.
✔️ Exibição de dados: Métodos para mostrar as informações da conta e do cliente.

🔹 Código de exemplo

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
🎓 Aprendizados
Durante esse trabalho, pude reforçar conceitos como:
✅ Encapsulamento e modificadores de acesso (private, public)
✅ Uso de construtores para inicializar objetos
✅ Métodos setters e getters para manipular atributos de forma segura
✅ Tratamento de entrada de dados para evitar operações inválidas

📌 Observação
Este projeto faz parte da minha jornada de aprendizado e reflete meu progresso na programação orientada a objetos. Ainda há muito a melhorar e refatorar, mas foi um ótimo exercício para fortalecer conceitos fundamentais! 😃

