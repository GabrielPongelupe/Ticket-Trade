## 7. Testes da solução

# Teste de Unidade




**Caso de Teste** | **CT01 - Cadastrar usuário**
 :--------------: | ------------
**Procedimento**  | Cadastrar novo usuário. |
**Dados de entrada** | Inserção de dados válidos no formulário de cadastro. |
**Resultado obtido** | Dado cadastrado com sucesso. |
**Teste unitário associado** | `CadastroUsuarioTest.testNovoUsuario()` |


**Caso de Teste** | **CT02 - Venda de Ingresso**
 :--------------: | ------------
**Procedimento**  | Realizar a venda de um ingresso.|
**Dados de entrada** | Selecionar um evento e listar o ingresso.|
**Resultado obtido** | A venda é concluída com sucesso, e os ingressos são associados ao usuário.|
**Teste unitário associado** | `VendaIngressoTest.testRealizarVenda()` |


**Caso de Teste** | **CT03 - Avaliação de Usuário**
 :--------------: | ------------
**Procedimento**  | Avaliar outro usuário no sistema.|
**Dados de entrada** | Selecionar um usuário para avaliação e atribuir uma pontuação e comentário.|
**Resultado obtido** | A avaliação é registrada com sucesso no perfil do usuário avaliado.|
**Teste unitário associado** | `AvaliacaoUsuarioTest.testAvaliarUsuario()` |


**Caso de Teste** | **CT04 - Compra de Ingresso**
 :--------------: | ------------
**Procedimento**  | Comprar ingressos para um evento existente.|
**Dados de entrada** | Selecionar um evento e informações de pagamento válidas.|
**Resultado obtido** |  A compra é concluída com sucesso, e os ingressos são associados ao usuário|
**Teste unitário associado** | `CompraIngressoTest.testRealizarCompra()` |



**Caso de Teste** | **CT05 - Validar Pagamentos**
 :--------------: | ------------
**Procedimento**  | Validar Pagamentos |
**Dados de entrada** | Forma de pagamento do ususário |
**Resultado obtido** | Validação do pagamento do usuário |
**Teste unitário associado** | `ValidarPagamentoTest.testRealizaValidacaoPagamento()` |

**Caso de Teste** | **CT06 - Validar Pagamentos**
 :--------------: | ------------
**Procedimento**  | Denunciar a conduta inadequada de um usuário no sistema. |
**Dados de entrada** | Selecionar o usuário a ser denunciado e fornecer detalhes da denúncia. |
**Resultado obtido** | A denúncia é registrada com sucesso, e o sistema toma as medidas apropriadas. |
**Teste unitário associado** | `DenunciaUsuarioTest.testRealizaDenunciaUsuario()` |


**Caso de Teste** | **CT07 -  Busca de Ingresso Disponível**
 :--------------: | ------------
**Procedimento**  | Pesquisar e visualizar ingressos disponíveis para um evento específico. |
**Dados de entrada** | Informar o nome do evento desejado na barra de busca. |
**Resultado obtido** | O sistema exibe corretamente os ingressos disponíveis para o evento pesquisado. |
**Teste unitário associado** | `BuscaIngressoTest.testRealizaBuscaIngresso()` |



## Avaliação dos Testes de Unidade

Os testes mostraram sucesso no cadastro eficiente de novos usuários e na venda de ingressos, garantindo a associação correta aos usuários. A funcionalidade de avaliação de usuários foi confirmada como eficaz, promovendo interatividade e transparência.

Contudo, a validação do pagamento revelou a necessidade de melhorias para garantir a integridade financeira. Planeja-se introduzir testes mais abrangentes nessa área, fortalecendo a segurança e confiabilidade nas transações.

Em resumo, os testes destacaram pontos positivos, identificando áreas específicas para aprimoramentos. A equipe está comprometida em fortalecer a plataforma para oferecer uma experiência robusta e confiável aos usuários.




# Testes de Usabilidade





## Cenários de Teste de Usabilidade

| Nº do Cenário | Descrição do cenário |
|---------------|----------------------|
| 1             | Você é uma pessoa que deseja omprar ingresso para um evento. |
| 2             | Você é uma pessoa que deseja vender ingresso para um evento. |



## Registro de Testes de Usabilidade

Cenário 1: Você é uma pessoa que deseja omprar ingresso para um evento.

| Usuário | Taxa de sucesso | Satisfação subjetiva | Tempo para conclusão do cenário |
|---------|-----------------|----------------------|---------------------------------|
| 1       | SIM             | 5                    |  25.32 segundos                  |
| 2       | SIM             | 5                    | 22.11 segundos                  |
| 3       | SIM             | 5                    | 30.45 segundos                  |
|  |  |  |  |
| **Média**     | 0%           | 0                | 0 segundos                           |
| **Tempo para conclusão pelo especialista** | SIM | 5 | 12.34 segundos |


Comentários dos usuários: Experiência intuitiva. Não tive dificuldades e acho que ficou bem intuitivo.




Cenário 2:  Você é uma pessoa que deseja vender ingresso para um evento.

| Usuário | Taxa de sucesso | Satisfação subjetiva | Tempo para conclusão do cenário |
|---------|-----------------|----------------------|---------------------------------|
| 1       | SIM             | 5                    | 18.76 segundos                          |
| 2       | SIM             | 5                    | 27.89 segundos                          |
| 3       | SIM             | 5                    | 21.45 segundos                          |
|  |  |  |  |
| **Média**     | 0%           | 0                | 0 segundos                           |
| **Tempo para conclusão pelo especialista** | SIM | 5 | 2.34s segundos |


 Comentários dos usuários: Facilidade no processo, site bem intuitivo e facil de usar, mas poderia apresentar opções mais personalizadas .




## Avaliação dos Testes de Usabilidade


Os resultados dos testes indicaram sucesso na taxa de sucesso e satisfação dos usuários em ambos os cenários avaliados. Os participantes elogiaram a experiência intuitiva, destacando a facilidade na busca, compra e venda de ingressos.

A discrepância nos tempos de conclusão entre usuários e especialista foi identificada, indicando possíveis áreas de otimização na usabilidade. As sugestões dos usuários para melhorias, como opções de personalização adicionais, são valiosas para aprimorar a plataforma.

Em resumo, os testes de usabilidade destacaram aspectos positivos, mas também apontaram para oportunidades de otimização. Essas descobertas fornecem insights valiosos para refinamentos futuros na interface do site, visando uma experiência de usuário ainda mais eficiente e satisfatória.


