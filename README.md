<h1>🚗 Zignani Motors API</h1>

<p>
API REST desenvolvida em Java com Spring Boot para gerenciamento de carros,
simulando o backend de uma vitrine automotiva (estilo marketplace).
O projeto foi criado com foco em aplicar boas práticas de arquitetura,
organização em camadas e persistência de dados.
</p>

<h2>🚀 Sobre o projeto</h2>

<p>
Esta API permite o gerenciamento completo de veículos, incluindo cadastro,
listagem, atualização e inativação.
Foi desenvolvida como projeto para consolidar conhecimentos em backend
com Java e Spring.
</p>

<h2>⚙️ Funcionalidades</h2>

<ul>
  <li>✔ Cadastrar carros</li>
  <li>✔ Listar carros com paginação</li>
  <li>✔ Atualizar informações</li>
  <li>✔ Exclusão lógica (inativação)</li>
  <li>✔ Validação de dados com Bean Validation</li>
  <li>✔ Versionamento do banco com Flyway</li>
</ul>

<h2>🏗 Arquitetura</h2>

<p>O projeto segue o padrão MVC adaptado para APIs REST:</p>

<pre>
controller/   → Endpoints e entrada de requisições
service/      → Regras de negócio
repository/   → Acesso ao banco (JPA)
model/        → Entidades persistidas
dto/          → Objetos de entrada/saída da API
</pre>

<p><strong>DTOs separados por responsabilidade:</strong></p>

<ul>
  <li>Cadastro de carro</li>
  <li>Listagem de carros</li>
  <li>Atualização de dados</li>
</ul>

<h2>💻 Tecnologias utilizadas</h2>

<ul>
  <li>Java</li>
  <li>Spring Boot</li>
  <li>Spring Data JPA</li>
  <li>MySQL</li>
  <li>Flyway (migrations de banco)</li>
  <li>Bean Validation</li>
  <li>Maven</li>
  <li>Postman (para realizar requisições na API)</li>
</ul>

<h2>📊 Estrutura do banco</h2>

<p>
A estrutura do banco é controlada por migrations usando Flyway,
garantindo versionamento e consistência do schema.
</p>

<h2>🔄 Regras de negócio implementadas</h2>

<ul>
  <li>Carros são cadastrados como não vendidos por padrão</li>
  <li>Exclusão é feita de forma lógica, preservando histórico</li>
  <li>Atualizações permitem modificação parcial dos dados</li>
  <li>Dados recebidos pela API passam por validação automática</li>
</ul>

<h2>▶️ Como rodar o projeto</h2>

<p><strong>Clone o repositório:</strong></p>

<pre>
1 - git clone https://github.com/Ry4nZS/Zignani_Motors_API
2 - Configure o banco de dados no arquivo:
    src/main/resources/application.properties
3 - Execute a aplicação:
    mvn spring-boot:run
4 - A API ficará disponível em:
    http://localhost:8080
</pre>

<h2>📡 Endpoints principais</h2>

<pre>
POST   /carros        → Cadastrar carro
GET    /carros        → Listar carros (paginado)
PUT    /carros        → Atualizar carro
DELETE /carros/{id}   → Inativar carro
</pre>

<h2>📈 Próximas melhorias (roadmap)</h2>

<ul>
  <li>Autenticação com Spring Security</li>
  <li>Controle de acesso (admin)</li>
  <li>Upload de imagens dos veículos</li>
  <li>Deploy em VPS</li>
  <li>Integração com frontend</li>
</ul>

<h2>Autor</h2>
- [@Ryan](https://www.github.com/Ry4nZS)
