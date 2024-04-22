# DSCommerce
### DESAFIO: Projeto Spring Boot estruturado

Você deverá entregar o projeto DSCommerce estruturado e com todas funcionalidades implementadas
conforme as aulas.

O projeto deve ser implementado com Java e Spring Boot, usando banco de dados H2, conforme aulas.

Para atestar que você implementou gradualmente o projeto, será exigido que seu projeto no Github tenha pelo
menos 12 commits no seu usuário do Github.

### Critérios de correção
1. Mínimo 12 commits no projeto no usuário do aluno <b>(eliminatório)</b><br>
2. Endpoints públicos GET /produts e GET /products/{id} funcionam sem necessidade de login <b>(eliminatório)</b><br>
3. Endpoint de login funcionando e retornando o token de acesso <b>(eliminatório)</b><br>
4. Endpoints privados de produto (POST/PUT/DELETE) funcionam somente para usuário ADMIN <b>(eliminatório)</b><br>
5. Endpoint GET /users/me retorna usuário logado <b>(eliminatório)</b><br>
6. Endpoints GET /orders/{id} e POST /orders funcionando <b>(eliminatório)</b><br>
7. Usuário que não é ADMIN não consegue acessar pedido que não é dele em GET /orders/{id} <b>(eliminatório)</b><br>
8. Endpoint GET /categories retorna todas categorias