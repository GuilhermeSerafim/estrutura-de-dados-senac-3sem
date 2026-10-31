# Estrutura de Dados — estudos em Java

Atividades da disciplina de Estrutura de Dados do 3º semestre de Análise e Desenvolvimento de Sistemas no Centro Universitário Senac, organizadas em pacotes sob `src/`. O mapa abaixo facilita a leitura do material sem tratar os exemplos como uma biblioteca pronta para produção.

- [aula01](src/aula01) e [aula02](src/aula02): arquivos de vetores e exemplos com ArrayList.
- [aula03](src/aula03): estruturas de fila, pilha e lista; a `Fila<T>` implementa operações FIFO sobre `EstruturaEstatica`.
- [aula04](src/aula04): exemplos nomeados BubbleSort, InsertionSort, QuickSort e SelectionSort, incluindo arquivos de medição.
- [aula05](src/aula05) e [aula06](src/aula06): arquivos de listas encadeadas.
- [aula07](src/aula07), [aula08](src/aula08) e [challenge2](src/challenge2): arquivos de grafos e árvores.
- [atividade01_biblioteca](src/atividade01_biblioteca): exercício organizado em classes de biblioteca e livros.
- [challenge](src/challenge): fila de coleta de sangue. A classe `BloodCollectionQueue` distingue atendimento normal e preferencial; após três preferenciais consecutivos, busca um normal se disponível. Essa é uma regra didática do exercício.

A configuração do VS Code aponta `src`, `bin` e `lib/**/*.jar`. O projeto não contém manifesto Maven/Gradle nem fixa uma versão de Java. Escolha uma aula ou exercício e configure o JDK no ambiente descrito abaixo.

---

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
