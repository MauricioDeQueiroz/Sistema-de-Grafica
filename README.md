# Sistema de Gráfica

Este é um sistema de gestão para uma gráfica, desenvolvido em **Java** e utilizando o banco de dados **MySQL**. O sistema permite gerenciar produtos, clientes, vendas e estoque, oferecendo uma interface simples e organizada para operações essenciais de uma gráfica.

## Tecnologias Utilizadas

- **Java 22**: Linguagem principal do sistema.
- **MySQL**: Banco de dados relacional para armazenamento das informações.
- **JDBC**: Para conexão entre a aplicação Java e o banco de dados MySQL.
- **IntelliJ IDEA**: Ambiente de desenvolvimento integrado (IDE).
- 
## Funcionalidades

1. **Gerenciamento de Produtos**:
   - Adicionar novos produtos.
   - Listar produtos cadastrados.
   - Atualizar informações de produtos.
   - Remover produtos do estoque.

2. **Gerenciamento de Clientes**:
   - Cadastro de clientes.
   - Consulta e edição de dados de clientes.

3. **Gerenciamento de Vendas**:
   - Registro de vendas.
   - Consulta de histórico de vendas.

4. **Controle de Estoque**:
   - Verificação de disponibilidade de produtos.
   - Atualização automática do estoque após uma venda.



3. Execute o script `database.sql` para criar as tabelas necessárias.

### Dependências
Adicione o conector MySQL ao projeto utilizando o Maven. No arquivo `pom.xml`, inclua:

```xml
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>9.1.0</version>
</dependency>
```

## Autor
Maurício de Queiroz


