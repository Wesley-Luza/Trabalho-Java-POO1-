# 💻 Trabalho de Programação Orientada a Objetos I (POO I)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/Java%20Swing-UI-blue?style=for-the-badge)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-IDE-000000?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-success?style=for-the-badge)

Repositório com a resolução de **18 exercícios em Java**, desenvolvidos para a disciplina de **Programação Orientada a Objetos I (POO I)**.

O projeto reúne exercícios voltados para a prática de:

- **Lógica de programação**
- **Programação Orientada a Objetos**
- **Coleções em Java**
- **Herança, abstração e polimorfismo**
- **Interfaces gráficas com Swing**

---

## 📌 Sobre o projeto

Este trabalho foi desenvolvido seguindo as orientações da disciplina de **POO I**, onde era necessário escolher **18 exercícios entre 20 propostos** e implementá-los em **arquivos Java separados**, dentro de um projeto criado no **IntelliJ IDEA**.

Cada exercício pode ser executado individualmente através do método `main`.

---

## 🚀 Tecnologias utilizadas

- ☕ **Java**
- 🖼️ **Java Swing**
- 🧠 **Programação Orientada a Objetos (POO)**
- 🛠️ **IntelliJ IDEA**

---

## 📁 Estrutura do projeto

O projeto está organizado com:

- **Classes auxiliares**:
  - `Classe_Carro.java`
  - `Classe_Pessoa.java`
  - `Classe_Produto.java`
  - `Classe_Funcionario.java`
  - `Classe_Forma.java`
  - `Classe_Circulo.java`
  - `Classe_Quadrado.java`

- **Arquivos de interface gráfica (Swing)**:
  - `TelaHW.java`
  - `TelaBemVindo.java`
  - `TelaBotão.java`
  - `TelaCapa.java`

> Alguns exercícios exigiram classes auxiliares separadas, conforme solicitado no enunciado.

---

## 📝 Exercícios implementados

### ✅ Lista dos 18 exercícios desenvolvidos

| Nº | Exercício | Descrição |
|----|----------|-----------|
| 1 | **Exercicio1** | Compara dois números e informa se o primeiro é maior, menor ou igual ao segundo. |
| 2 | **Exercicio2** | Solicita a idade e informa se a pessoa é maior ou menor de idade. |
| 3 | **Exercicio3** | Recebe um número de 1 a 7 e mostra o dia da semana correspondente. |
| 4 | **Exercicio4** | Exibe a tabuada de um número informado pelo usuário. |
| 5 | **Exercicio5** | Cria um vetor com 5 nomes definidos no código e exibe cada um deles. |
| 6 | **Exercicio6** | Cria uma classe `Carro` com atributos `marca` e `ano`, instanciando e exibindo no `main`. |
| 7 | **Exercicio7** | Cria uma classe `Pessoa` com `nome`, `idade` e construtor. |
| 8 | **Exercicio9** | Utiliza `ArrayList<Integer>` para armazenar e exibir números. |
| 9 | **Exercicio10** | Interface gráfica em **Swing** com botão que exibe `"Olá, mundo!"`. |
| 10 | **Exercicio11** | Lê 5 números e exibe o maior e o menor valor. |
| 11 | **Exercicio12** | Calcula e exibe o fatorial de um número informado. |
| 12 | **Exercicio13** | Sorteia um número de 1 a 50 e permite ao usuário adivinhar. |
| 13 | **Exercicio14** | Lê 10 idades e informa quantas pessoas são maiores de idade. |
| 14 | **Exercicio15** | Lê 4 notas e informa se o aluno foi aprovado (média ≥ 7). |
| 15 | **Exercicio16** | Cria uma classe `Funcionario` com `nome`, `cargo` e `salário`. |
| 16 | **Exercicio17** | Cria uma classe `Produto` com método para calcular desconto de 10%. |
| 17 | **Exercicio18** | Cria uma classe abstrata `Forma` e as classes `Circulo` e `Quadrado` para cálculo de área. |
| 18 | **Exercicio20** | Cria duas telas com Swing onde o usuário insere seu nome e, ao clicar, exibe uma mensagem de boas-vindas.

> 📌 **Observação:**  
> O enunciado permitia escolher apenas **18 entre 20 exercícios**.  
> Neste repositório não foram implementados os exercícios **8 e 19**.

---

## 🧠 Conceitos praticados

Durante a realização dos exercícios, foram aplicados os seguintes conceitos:

### 🔹 Fundamentos de Java
- Entrada de dados com `Scanner`
- Saída de dados com `System.out.println`
- Tipos primitivos e variáveis
- Operadores lógicos e relacionais

### 🔹 Estruturas de controle
- `if`, `else if`, `else`
- `switch`
- Laços de repetição:
  - `for`
  - `while`

### 🔹 Estruturas de dados
- Vetores (`array`)
- `ArrayList`
- `HashMap` *(previsto no enunciado, mas não incluído entre os 18 escolhidos)*

### 🔹 Programação Orientada a Objetos
- Criação de classes
- Objetos
- Atributos e métodos
- Construtores
- Encapsulamento
- Herança
- Sobrescrita de métodos
- Classes abstratas
- Polimorfismo

### 🔹 Interface gráfica
- Introdução ao **Java Swing**
- Criação de janelas (`JFrame`)
- Botões (`JButton`)
- Campos de texto (`JTextField`)
- Eventos de clique

---

## 🖥️ Exercícios com Swing

Os exercícios abaixo envolvem **interface gráfica com Java Swing**:

- **Exercicio10** → botão que exibe a mensagem **"Olá, mundo!"**
- Arquivos auxiliares de interface:
  - `TelaHW.java`
  - `TelaBemVindo.java`
  - `TelaBotão.java`
  - `TelaCapa.java`

> 💡 O exercício 20 do enunciado também era em Swing, porém não foi incluído entre os 18 escolhidos.

---

## ▶️ Como executar o projeto

### No IntelliJ IDEA

1. Abra o projeto no **IntelliJ IDEA**
2. Acesse a pasta `src`
3. Escolha o arquivo do exercício desejado (ex.: `Exercicio1.java`)
4. Clique no botão **▶ Run** ao lado do método `main`

### Importante
- Cada exercício foi desenvolvido para ser executado **individualmente**
- Alguns exercícios dependem de **classes auxiliares** que já estão separadas no projeto
- Os exercícios com Swing abrem uma **janela gráfica**

---

## 📚 Enunciado resumido da atividade

- Criar um projeto no **IntelliJ IDEA**
- Desenvolver **18 exercícios entre 20 disponíveis**
- Cada exercício em uma **classe Java separada**
- Utilizar `main` em cada arquivo
- Criar classes auxiliares quando necessário
- Executar cada exercício individualmente
- Manter o código organizado, comentado e bem indentado

---

## 🎯 Objetivo acadêmico

Este projeto teve como objetivo consolidar os conhecimentos iniciais em:

- **Lógica de programação em Java**
- **Estruturas de controle**
- **Orientação a Objetos**
- **Modelagem simples com classes**
- **Construção de interfaces gráficas básicas**

Além de servir como base prática para evoluir para projetos maiores com **Java desktop**, **APIs** e futuramente **desenvolvimento full stack**.

---

## 👨‍💻 Autor

**Wesley Luza**  
🎓 Estudante de **Análise e Desenvolvimento de Sistemas (ADS)**  
📘 Disciplina: **Programação Orientada a Objetos I**  
🏫 Projeto acadêmico desenvolvido em **Java**

---

## 📄 Licença

Este projeto foi desenvolvido para fins **acadêmicos e educacionais**.
