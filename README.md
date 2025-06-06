# workshop-springboot3-jpa

Este projeto é uma **API RESTful desenvolvida em Spring Boot**, projetada para gerenciar operações essenciais de um sistema de e-commerce. Ele oferece funcionalidades para o gerenciamento de **usuários, produtos, categorias, pedidos e itens de pedido**

---

## ✨ Funcionalidades Principais

A API oferece os seguintes recursos:

* **Gerenciamento de Usuários:**
    * Criação, leitura (por ID ou todos), atualização e exclusão de usuários.
    * Tratamento de exceções para recursos não encontrados e violações de integridade de dados.
* **Gerenciamento de Produtos:**
    * Listagem de todos os produtos.
    * Busca de produtos por ID.
    * Associação de produtos a múltiplas categorias.
* **Gerenciamento de Categorias:**
    * Listagem de todas as categorias.
    * Busca de categorias por ID.
* **Gerenciamento de Pedidos:**
    * Listagem de todos os pedidos.
    * Busca de pedidos por ID.
    * Associação de pedidos a usuários e itens de pedido.
* **Gerenciamento de Itens de Pedido:**
    * Detalhes dos produtos incluídos em cada pedido, incluindo quantidade e preço.
* **Pagamentos:**
    * Registro de pagamentos associados a pedidos.
* **Tratamento de Exceções:** Implementação de tratamento de exceções personalizado para oferecer respostas claras em caso de erros (ex: `ResourceNotFoundException`, `DatabaseException`).

---

## 🚀 Tecnologias Utilizadas

* **Java 17** 
* **Spring Boot** 
* **Spring Data JPA** 
* **Hibernate** 
* **Maven** 
* **Banco de Dados H2 (em perfil de teste)** 

---

## 📚 Inspiração e Aprendizado

Este projeto foi desenvolvido com base nos conceitos e arquitetura ensinados no **curso de Spring Boot e Java do professor Nélio Alves na Udemy**.

---

## 🛠️ Como Executar o Projeto

Siga os passos abaixo para configurar e rodar a aplicação localmente:

### Pré-requisitos

Certifique-se de ter o seguinte instalado em sua máquina:

* **Java Development Kit (JDK) 17 ou superior**
* **Maven 3.x**
* (Opcional) Uma IDE como IntelliJ IDEA, Eclipse ou VS Code.

### Passos

1.  **Clone o Repositório:**
    ```bash
    git clone [https://github.com/yagorocha/nome-do-seu-repositorio.git](https://github.com/yagorocha/nome-do-seu-repositorio.git)
    cd nome-do-seu-repositorio
    ```
    *(**Atenção:** Substitua `nome-do-seu-repositorio` pelo nome real do seu repositório no GitHub, por exemplo, se o repositório for `my-ecommerce-api`, use esse nome.)*

2.  **Construa o Projeto com Maven:**
    ```bash
    mvn clean install
    ```

3.  **Execute a Aplicação:**
    Como o projeto usa o perfil `test` e `CommandLineRunner` para popular o banco de dados H2 em memória, você pode simplesmente rodar a aplicação Spring Boot:
    ```bash
    mvn spring-boot:run
    ```

---

## 🧪 Testes e Dados de Exemplo

O projeto inclui uma classe `TestConfig` configurada com o perfil `test`. Ao iniciar a aplicação com este perfil (que é o padrão para `mvn spring-boot:run` se não houver outro perfil ativo), o banco de dados H2 em memória será populado automaticamente com os seguintes dados de exemplo:

* **Usuários:** Maria Brown, Alex Green
* **Categorias:** Electronics, Books, Computers
* **Produtos:** The Lord of the Rings, Smart TV, Macbook Pro, PC Gamer, Rails for Dummies
* **Pedidos:** Múltiplos pedidos com diferentes status e itens de pedido associados.
* **Pagamentos:** Um pagamento de exemplo.

Isso permite que você comece a testar as funcionalidades da API imediatamente após a inicialização.

---

## 🗺️ Endpoints da API (Exemplos)

Com a aplicação rodando, você pode acessar os seguintes endpoints utilizando ferramentas como Postman, Insomnia ou cURL:

* **Usuários:**
    * `GET /users` - Lista todos os usuários
    * `GET /users/{id}` - Busca um usuário por ID
    * `POST /users` - Cria um novo usuário
    * `PUT /users/{id}` - Atualiza um usuário existente
    * `DELETE /users/{id}` - Deleta um usuário
* **Produtos:**
    * `GET /products` - Lista todos os produtos
    * `GET /products/{id}` - Busca um produto por ID
* **Categorias:**
    * `GET /categories` - Lista todas as categorias
    * `GET /categories/{id}` - Busca uma categoria por ID
* **Pedidos:**
    * `GET /orders` - Lista todos os pedidos
    * `GET /orders/{id}` - Busca um pedido por ID

---

## 🤝 Contribuições

Contribuições são bem-vindas! Se você tiver sugestões, melhorias ou quiser reportar um bug, sinta-se à vontade para abrir uma *issue* ou enviar um *pull request*.

---


## 📧 Contato

Se tiver alguma dúvida ou sugestão, entre em contato:

* yagodsrocha@gmail.com
* [LinkedIn](https://www.linkedin.com/in/yago-rocha-b2554a273/)
* [GitHub](https://github.com/Yagorocha10)
