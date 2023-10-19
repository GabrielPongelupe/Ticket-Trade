## 4. Projeto da solução

### 4.1. Diagrama de classes

![Diagrama De Classe](images/diagramaDeClasses.png)


_O diagrama a seguir apresenta a composição de classes peliminar do nosso projeto. Conta com as classes Usuário que contem os dados principais dos usuários; as classes de rating e denúncia que tem as respectivas funções de avaliar e deununciar um usuário; a classe notificações que é responsavel por emitir as notificações necessárias; a classe ingresso que possui os dados fundementais do ingresso; a classe pagamento que possui os metodos necessários para possibilitar o pagamento; a classe TrocaTitularidade responsável por possiblilitar a troca de titularidade do ingresso e, enfim, a classe administrador que atua na administração, análise e verificação de disveros dados utilizados no software._

### 4.2. Diagrama de componentes

![Diagrama de componentes](images/DiagramaComponentes.png)


Conforme diagrama apresentado, as entidades participantes da solução são:

- **Sistema de Pagamento** - Sistema onde ocorre a logica de pagamanto e a verificacao , no caso , pix ou boleta.
- **Banco de Dados** - Onde os dados de compras e vendas serao guardados e as informacoes de clientes e vendedores.
- **Vendedor** - Usuario que aloca o seu ingresso para ser vendido.
- **Comprador** - Usuario que participa de compras de ingressos no aplicativo. 
- **Venda** - Ação de venda do ingresso desejado.
- **Postagem** - Ação de postagem do ingresso na rede.
- **Interface html** - A interface do aplicativo que comunica com o usuário.
- **Cadastro** - Processo de recolhimento de dados e cadastro dos usuários.
- **Ingresso** - Produto comercioado no aplicativo.

    


### 4.3. Modelo de dados

![Diagrama de Entidade Relacionamento de Exemplo](images/DIAGRAMADERELACIONAMENTO.drawio.png)
![Diagrama de Entidade Relacionamento de Exemplo](images/tickettrade.png)

### 4.4. Tecnologias
![Diagrama de Tecnologia](images/Tecnologias.png)



| **Dimensão**   | **Tecnologia**  |
| ---            | ---             |
| Persistência   | Hibernate       |
| Front end      | HTML+CSS+JS     |
| Back end       | Java SpringBoot |
| Log do sistema | Log4J           |
| Teste          | JUnit           |
| Deploy         | Github Pages    |
|      Comunicação            | Discord            |
|      Desenvolvimento     |  VSCode + Camunda + Draw.io            |


### 4.5. Guias de estilo

![Diagrama de componentes](images/HTMLeCSS.png)

![Denuncia de usuário](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2023-2-ti2-1372100-tickettrade/assets/130700804/9d7c5016-033d-4c94-bd97-bd72c5386986)

![Compra de Ingressos](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2023-2-ti2-1372100-tickettrade/assets/130700804/e3ecf58d-c188-439c-a8f9-db58b4bb6500)

![Avaliação por rating](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2023-2-ti2-1372100-tickettrade/assets/130700804/8b46a5b2-51b5-4574-b257-3c00388d078f)

![Pagamento de ingresso](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2023-2-ti2-1372100-tickettrade/assets/130700804/87aba7b7-f661-41a8-9ad4-171acd1eff33)

![Através do boleto](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2023-2-ti2-1372100-tickettrade/assets/130700804/afcaac69-c062-45db-a0fc-87aa1bad170e)

![Através do PIX](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2023-2-ti2-1372100-tickettrade/assets/130700804/fe55309a-e7b8-47ac-a39f-7de33bbbd4ce)

![Cadastro](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2023-2-ti2-1372100-tickettrade/assets/130700804/adf95865-9d44-42bd-a4b5-01e1384a4559)

![Login](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2023-2-ti2-1372100-tickettrade/assets/130700804/fb8e2152-fbd4-4716-bf62-0d37ddbb7806)

![Cadastro do ingresso ](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2023-2-ti2-1372100-tickettrade/assets/130700804/2f835e7d-f302-4294-bc02-a9e6b21735b3)

![Validação do ingresso](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2023-2-ti2-1372100-tickettrade/assets/130700804/dd0516f9-51a6-468d-9f6c-be8e34e793a0)











## Design


Logo: estará apresentada na parte superior esquerda da tela, conforme a imagem.

Login: Canto superior Direito

Venda de ingressos: Acessa aba para vender ingresso.

Compra de ingressos: Acessa aba para comprar ingresso.

Denuncia: Acessa aba de denuncia de usuário.


## Cores

![Diagrama de componentes](images/Paleta_cores.jpeg)


## Tipografia

O tipo de fonte apresentado no projeto sera: 'Poppins', sans-serif;

## Iconografia

.icon-logo {color: #6A9159; /*Verde musgo/* border_radius: 30px;/*Levemente arredondado/* padding: 10px; } 

.icon-buy { color: #6A9159; /*Verde musgo/*  padding: 10px; } 

.icon-vender { color: #6A9159; /*Verde musgo/*  padding: 10px; } 

.icon-denuncia  { color: #6A9159; /*Verde musgo/*  padding: 10px; }

.login: color { #6A9159; /*Verde musgo/* border_radius: 30px;/*Levemente arredondado/* padding: 10px; }

// Padrao de icone cor: #6A9159, padding: 10px, arredondamento: 30px,

> **Links Úteis**:
>
> - [Como criar um guia de estilo de design da Web](https://edrodrigues.com.br/blog/como-criar-um-guia-de-estilo-de-design-da-web/#)
> - [CSS Website Layout (W3Schools)](https://www.w3schools.com/css/css_website_layout.asp)
> - [Website Page Layouts](http://www.cellbiol.com/bioinformatics_web_development/chapter-3-your-first-web-page-learning-html-and-css/website-page-layouts/)
> - [Perfect Liquid Layout](https://matthewjamestaylor.com/perfect-liquid-layouts)
> - [How and Why Icons Improve Your Web Design](https://usabilla.com/blog/how-and-why-icons-improve-you-web-design/)
