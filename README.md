

---

# Bloco de Notas  

Este projeto é uma aplicação simples de um **Bloco de Notas** em Java, que permite ao usuário criar, editar, buscar, listar e excluir anotações por meio de um menu interativo no console.  

### 📌 Funcionalidades  
- Adicionar anotação  
- Editar anotação  
- Buscar anotação por ID  
- Listar todas as anotações  
- Deletar anotação  

### 🛠️ Tecnologias utilizadas  
- **Java SE** (versão 8 ou superior)  
- **JUnit** (para testes unitários)  

### 📂 Estrutura do Projeto  
```
/bloco-de-notas
│── src
│   ├── Main.java              # Classe principal com menu interativo
│   ├── BlocoDeNotas.java      # Classe responsável pela gestão das anotações
│   ├── Anotacao.java          # Classe representando uma anotação
│
└── tests
    ├── BlocoDeNotasTest.java  # Testes unitários para validar funcionalidades
```

### 🚀 Como executar  
1. Clone o repositório:  
   ```sh
   git clone https://github.com/seu-usuario/bloco-de-notas.git
   ```
2. Compile os arquivos Java:  
   ```sh
   javac src/*.java
   ```
3. Execute o programa:  
   ```sh
   java src.Main
   ```

### 🧪 Executando os testes  
Caso tenha um framework de testes como **JUnit** configurado, execute:  
```sh
mvn test   # Se estiver usando Maven
```
Ou rode manualmente pelo seu ambiente de desenvolvimento (Ex: IntelliJ, Eclipse, VS Code).  

### 📌 Exemplo de Uso  
```
--- Bloco de Notas ---
1. Adicionar Anotação
2. Editar Anotação
3. Buscar Anotação
4. Listar Anotações
5. Deletar Anotação
6. Sair
Escolha uma opção: 1
Digite o texto da anotação: Comprar pão
Anotação adicionada com ID: 1
```

### 📜 Licença  
Este projeto está sob a licença MIT. Sinta-se à vontade para usar e modificar. 😊  

---

