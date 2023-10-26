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

![Diagrama de Entidade Relacionamento de Exemplo](images/der.drawio.png)
![Diagrama de Entidade Relacionamento de Exemplo](images/tickettrade.png)

### 4.4. Tecnologias




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
Denuncia de Usuário, Compra de Ingressos, Avaliação por rating;
![image](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2023-2-ti2-1372100-tickettrade/assets/130700804/e9d9b6ba-e178-4d3f-92fe-0decd1bca08f)
Pagamento de ingresso, Através do boleto, Através do PIX;
![image](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2023-2-ti2-1372100-tickettrade/assets/130700804/3e53c19c-41c2-42df-813e-51761583cd6c)
Cadastro, Login, Cadastro do ingresso;
![image](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2023-2-ti2-1372100-tickettrade/assets/130700804/5ab750ba-1dde-459f-adba-2df8139a8a5c)
Validação do ingresso

![image](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2023-2-ti2-1372100-tickettrade/assets/130700804/b3ab12e6-2f3b-4ece-b211-98aeb9cce188)













## Design

**TELA INICIAL:**

Logo: estará apresentada na parte superior esquerda da tela, conforme a imagem.

navbar: Canto superior, ao lado da logo (A logo e a navbar aparecerão em todas as telas do sistema)

Venda de ingressos: Acessa aba para vender ingresso. (apenas aba incial)

Compra de ingressos: Acessa aba para comprar ingresso. (apenas aba incial)

Denuncia: Acessa aba de denuncia de usuário. (apenas aba incial)



**PESQUISA DE INGRESSOS:**

Ingressos: ficaram na esquerda em forma de card



**POSTAGEM DE INGRESSOS, CADASTRO E LOGIN:**

Formulario, com todas as informações a serem preenchidas, no centro da tela



**PAGAMENTOS DE INGRESSOS**

Informações importantes como chave pix ou boleto ficaram no meio da tela

Botão para proceguir logo em baixo das informações importantes







## Cores

![Diagrama de componentes](images/Paleta_cores.jpeg)


## Tipografia

O tipo de fonte apresentado no projeto sera: 'Poppins', sans-serif;

Os títulos/logos estão no tamanho 36 pixels, os textos em botões estão em 18 e os paragrafos em tamanho padrão do HTML.

## Iconografia

**TELA INICIAL** (se aplicam a todas as telas com estes icones) 

.icon-logo {color: #6A9159; /*Verde musgo/* border_radius: 20px; /*Levemente arredondado/* padding: 10px; width: 200px; }  

.icon-buy { color: #6A9159; /*Verde musgo/*  padding: 10px; } 

.icon-vender { color: #6A9159; /*Verde musgo/*  padding: 10px; } 

.icon-denuncia  { color: #6A9159; /*Verde musgo/*  padding: 10px; }

.login: color { #6A9159; /*Verde musgo/* border_radius: 30px;/*Levemente arredondado/* padding: 10px; }


**OUTRAS TELAS:**

.estrelas_avaliacao {color: #FFFFFF; /*Branco*/ width: 120%; }

.primeira_estrela {color: yellow; /*Cor amarelo*/}

.botoes { border: 0; border-radius: 30px; /*Levemente arredondadado*/ padding: 10px 40px; font-size: 18px; font-weight: 600;
background-color: #699158; cursor: pointer; transition: .2s;}

// Padrao de icone color: #6A9159, padding: 10px, border_radius: 30px, 

> **Links Úteis**:
>
> - [Como criar um guia de estilo de design da Web](https://edrodrigues.com.br/blog/como-criar-um-guia-de-estilo-de-design-da-web/#)
> - [CSS Website Layout (W3Schools)](https://www.w3schools.com/css/css_website_layout.asp)
> - [Website Page Layouts](http://www.cellbiol.com/bioinformatics_web_development/chapter-3-your-first-web-page-learning-html-and-css/website-page-layouts/)
> - [Perfect Liquid Layout](https://matthewjamestaylor.com/perfect-liquid-layouts)
> - [How and Why Icons Improve Your Web Design](https://usabilla.com/blog/how-and-why-icons-improve-you-web-design/)
