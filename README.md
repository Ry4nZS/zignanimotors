🚗 Zignani Motors API

API REST desenvolvida em Java com Spring Boot para gerenciamento de carros, simulando o backend de uma vitrine automotiva (estilo marketplace).
O projeto foi criado com foco em aplicar boas práticas de arquitetura, organização em camadas e persistência de dados.

🚀 Sobre o projeto

Esta API permite o gerenciamento completo de veículos, incluindo cadastro, listagem, atualização e inativação.
Foi desenvolvida como projeto para consolidar conhecimentos em backend com Java e Spring.

⚙️ Funcionalidades

<p>✔ Cadastrar carros</p>
✔ Listar carros com paginação
✔ Atualizar informações
✔ Exclusão lógica (inativação)
✔ Validação de dados com Bean Validation
✔ Versionamento do banco com Flyway

🏗 Arquitetura

O projeto segue o padrão MVC adaptado para APIs REST:

controller/   → Endpoints e entrada de requisições
service/      → Regras de negócio
repository/   → Acesso ao banco (JPA)
model/        → Entidades persistidas
dto/          → Objetos de entrada/saída da API

DTOs separados por responsabilidade:

Cadastro de carro
Listagem de carros
Atualização de dados

💻 Tecnologias utilizadas

Java
Spring Boot
Spring Data JPA
MySQL
Flyway (migrations de banco)
Bean Validation
Maven
Postman (Para realizar requisições na API)

📊 Estrutura do banco

A estrutura do banco é controlada por migrations usando Flyway, garantindo versionamento e consistência do schema.

🔄 Regras de negócio implementadas

Carros são cadastrados como não vendidos por padrão
Exclusão é feita de forma lógica, preservando histórico
Atualizações permitem modificação parcial dos dados
Dados recebidos pela API passam por validação automática

▶️ Como rodar o projeto

Clone o repositório:

1 - git clone https://github.com/Ry4nZS/Zignani_Motors_API
2 - Configure o banco de dados no arquivo:
src/main/resources/application.properties
3 - Execute a aplicação:
mvn spring-boot:run
4 - A API ficará disponível em: http://localhost:8080

📡 Endpoints principais
POST   /carros        → Cadastrar carro
GET    /carros        → Listar carros (paginado)
PUT    /carros        → Atualizar carro
DELETE /carros/{id}   → Inativar carro

📈 Próximas melhorias (roadmap)

Autenticação com Spring Security
Controle de acesso (admin)
Upload de imagens dos veículos
Deploy em VPS
Integração com frontend

👨‍💻 Autor
- [@Ryan](https://www.github.com/Ry4nZS)
