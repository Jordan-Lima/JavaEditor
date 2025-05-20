# 📝 Mini Editor de Texto no Terminal - Java

Um projeto simples e prático de um **editor de texto no terminal** feito em Java, utilizando `BufferedWriter` para manipulação de arquivos. Ideal para praticar escrita em arquivos, lógica de entrada de dados e reforçar conceitos como `try-with-resources` e boas práticas de código.

## 💡 Motivação

A ideia surgiu da vontade de ir além no estudo sobre manipulação de arquivos. Se estamos falando de escrita, por que não aplicar o conhecimento desenvolvendo um **mini editor de texto**?

Este projeto é parte do meu aprendizado contínuo em Java, com foco em:
- Princípios de boas práticas (como evitar `else`, seguir conceitos do SOLID)
- Manipulação de arquivos com segurança e clareza
- Interatividade com o usuário via terminal

## 🚀 Funcionalidades

- ✅ Criação de um novo arquivo em pastas do diretório `home`
- ✅ Escolha do diretório de salvamento (ou uso do padrão `Documents`)
- ✅ Digitação de conteúdo até o comando especial `!qw`
- ✅ Definição do nome e extensão do arquivo (`.txt`, `.json`, `.md`, etc)
- ✅ Verificação de duplicidade de arquivos
- ✅ Escrita segura com `BufferedWriter`

## 🛠️ Tecnologias Utilizadas

- Java 21
- `java.io.File`
- `BufferedWriter`
- Programação orientada a objetos (POO)

## 📂 Estrutura

```bash
src/
└── dev/
    └── jordanlima/
        └── Editor/
            └── Editor.java
````

## 🧠 Conceitos Aplicados

* Leitura e escrita de arquivos com `BufferedWriter`
* Manipulação de diretórios e arquivos com `File`
* Uso de `Scanner` para capturar entradas do usuário
* `try-with-resources` para gerenciamento seguro de recursos
* Lógica para simular um editor de texto em ambiente CLI

## 🤝 Contribuindo

Se quiser sugerir melhorias, aplicar princípios de SOLID mais a fundo, ou adicionar funcionalidades (como abrir arquivos existentes, edição, etc), fique à vontade para abrir uma issue ou PR!

## 📘 Licença

Este projeto está sob a licença [MIT](LICENSE).

---

**Desenvolvido com 💻 e ☕ por [Jordan Lima](https://github.com/JordanLimaDev)**

