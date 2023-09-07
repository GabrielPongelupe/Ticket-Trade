![Screenshot_6](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2023-2-ti2-1372100-tickettrade/assets/130709840/03f29383-1e21-464e-ac5e-7e64507a97b5)


# TicketTrade


**Gabriel Faria de Oliveira, gabrielfoliveira@hotmail.com**

**Gabriel Pongelupe de Carvalho, gabriel.carvalho.1446145@sga.pucminas.br**

**João Victor Salim Ribeiro Guimarães Trad, joaovictorsrgt@gmail.com**

**João Vitor Neri Moreira, jovinemo@gmail.com**

**Renato Cazzoletti, renato.cazzoletti7@gmail.com**

---

Professores:

**Hugo Bastos de Paula**

**Juliana Amaral Baroni de Carvalho**

**Eveline Alonso Veloso**

---

_Curso de Engenharia de Software, Unidade Praça da Liberdade_

_Instituto de Informática e Ciências Exatas – Pontifícia Universidade Católica de Minas Gerais (PUC MINAS), Belo Horizonte – MG – Brasil_

---

_**Resumo**. Escrever aqui o resumo. O resumo deve contextualizar rapidamente o trabalho, descrever seu objetivo e, ao final, 
mostrar algum resultado relevante do trabalho (até 10 linhas)._

---


## 1. Introdução

O projeto consiste em um sistema de compra de ingressos oferecido para revenda. 

### 1.1 Contextualização

No Brasil atual, pesquisas quantitativas apontam para um mercado em crescimento, onde a procura por ingressos para eventos tem aumentado significativamente nos últimos anos, principalmente após a pandemia do COVID-19, haja visto que os eventos tomaram proporções maiores devido a necessidade de suprir o tempo e oportunidades perdidas, por parte do público, e questões financeiras e midiáticas, pelos artistas. Por exemplo, de acordo com o relatório do Sympla, empresa de vendas de ingresso, em 2018, com 243.000 eventos, foram vendidos aproximadamente 2.400.000 ingressos, já em 2022, tivemos 300.000 eventos e 20.000.000 de ingressos vendidos, apresentando um aumento de mais de 680% na média de ingressos vendidos por eventos . Um estudo recente da MobileTime revelou um aumento de 34% para 44% na venda de ingressos via smartphones para eventos nos últimos três anos, indicando um ambiente propício para investir nesse setor específico. Além disso, empresas como a TicketSwap, de origem holandesa, atuam no mercado de revenda de ingressos na europa há mais de 10 anos, facilitando a compra de ingressos para eventos esgotados ou por desistência dos primeiros compradores, alocando limite máximo de 20% a mais do preço inicial comprado. A própria empresa diz que gostaria de atuar na América do Sul mas se sente impossibilitada por conta da informalidade e forte influência cultural, e a mesma incentiva iniciativas similares a darem o primeiro passo no mercado de revendas no Brasil, pois diz que o país tem uma população engajada e que valoriza o entretenimento. Portanto, ao considerar essa tendência e a demanda crescente, o projeto de compra e revenda de ingressos de eventos visa explorar um nicho promissor dentro desse cenário.

### 1.2 Problema

Atualmente existe uma grande oferta  de ingressos, mas  não se encontram plataformas que facilitem o anúncio e a revenda dos mesmos, o que acarreta no uso quase exclusivo de redes sociais para o anúncio de tais ingressos, tornando confuso encontrar ingressos compatíveis com o interesse. É evidente que as redes sociais não são as melhores plataformas possíveis para efetuar tal revenda, pois a transação é  feita por meios terceirizados e altamente manipuláveis,levando consigo riscos de golpes em transações bancárias como pix agendados, cancelamentos prévios de pagamentos e resistência do vendedor quanto a mudança do titular de tal entrada. 

### 1.3 Objetivo geral

O objetivo do nosso projeto é criar um software que facilite a revenda de ingressos para eventos de entretenimento. 

#### 1.3.1 Objetivos específicos

**Objetivo 1:** Revenda de ingressos de eventos de entretenimento.
**Objetivo 2:** Possibilitar o anúncio de qualquer ingresso de evento com custos adicionais por parte do software.
**Objetivo 3:** Ajudar na compra de ingressos de forma simples

### 1.4 Justificativas

 Esse projeto foi iniciado justamente para resolver e facilitar esse processo, buscando melhorar algo recorrente . Além disso , espera-se que os usuários tenham um espaço seguro para vender e comprar ingressos evitando golpes e vendas enganosas .

## 2. Participantes do processo

**Clientes (Compradores de Ingressos e, consequentemente usuário):** São os consumidores finais que desejam comprar ingressos para eventos. Eles utilizam o software para pesquisar eventos, escolher assentos, efetuar compras e receber os ingressos eletronicamente. 

**Vendedores (Revendedores de Ingressos e, consequentemente usuário):** São as empresas ou indivíduos que possuem ingressos para eventos e desejam vendê-los por meio do software. Eles podem ser promotores de eventos, agências de viagens, ou até mesmo pessoas que compraram ingressos e decidiram revendê-los. 

## 3. Modelagem do processo de negócio

### 3.1. Análise da situação atual

Atualmente, no cenário da revenda de ingressos no Brasil, nota-se uma lacuna significativa na existência de uma plataforma completamente dedicada e otimizada para facilitar o processo de anúncio e compra de ingressos secundários. Os entusiastas de eventos esportivos, shows e espetáculos culturais frequentemente se veem buscando alternativas nas redes sociais para encontrar bilhetes compatíveis com seus interesses e disponibilidade de horários. Nessa busca, no entanto, os compradores e vendedores se deparam com uma série de desafios e questionamentos. Desde a seleção do método de pagamento até a complexa tarefa de alteração de titularidade, passando pela eventual terceirização do processo, a falta de uma plataforma especializada torna o processo desafiador e muitas vezes confuso. A ausência de um intermediário confiável e eficaz nesse processo de transação de ingressos cria um ambiente propício para mal-entendidos e potenciais situações problemáticas. A confiança entre compradores e vendedores fica fragilizada, já que não há uma entidade terceira para garantir a segurança e a integridade do processo. A compra e venda de ingressos são realizadas por meio de anúncios nas redes sociais, como na plataforma do Instagram, onde são anunciados através dos stories para que os seguidores possam ter conhecimento, e caso tenham interesse, consigam entrar em contato com o vendedor. Após entrar em contato com o anunciante pela própria rede, na maioria das vezes, por meio de uma conversa informal, a transferência é realizada via pix e, logo depois, o vendedor altera a titularidade do ingresso através da plataforma comprada. Da mesma forma ocorre em outras redes, como no Twitter e Facebook, com anúncios nas publicações do usuário que necessita vender, anunciando o ingresso e despertando o interesse de possíveis compradores, que seguem o mesmo passo realizado na outra rede citada. Com os exemplos práticos, é nítida a facilidade de adulteração nos processos, visto que não há nenhum verificador e/ou minimizador de problemas quanto a integridade, confiança e garantia de qualidade.


### 3.2. Descrição geral da proposta

O software busca introduzir no mercado uma plataforma que irá revolucionar o processo de revenda de ingressos, introduzindo um meio que possibilite que a revenda de ingressos seja feita de maneira simples e eficiente, além de reduzir as chances de inoportunas desavenças entre o comprador e vendedor, como golpes, atrasos e  falsificações . A plataforma funcionará da seguinte forma:

1. O usuário deve realizar cadastro e login.
2. O usuário realizará a postagem de ingressos os quais deseja revender.
3. O usuário, com interesse de compra, buscará todos os ingressos disponíveis para o evento em questão.
4. O usuário, que se interessar pelo ingresso, pagará através de pix ou outros métodos de pagamento no site.
5. O usuário avaliará outros usuários em um sistema de rating e denúncia, que servirá para auxiliar na confiabilidade das compras.


Espera-se que com a introdução de nossa plataforma o processo de revenda de ingressos se torne mais veloz e simples de forma que ao facilitar a vida dos usuários, ganhe relevância no mercado de ingressos.    
  

### 3.3. Modelagem dos processos

[PROCESSO 1 - Elaboraçao do cadastro e login.](processo-1-nome-do-processo.md "Detalhamento do Processo 1.")

[PROCESSO 2 - Realizaçao da postagem dos ingressos.](processo-2-nome-do-processo.md "Detalhamento do Processo 2.")

[PROCESSO 3 - Busca por ingressos disponíveis.](processo-3-nome-do-processo.md "Detalhamento do Processo 3.")

[PROCESSO 4 - Pagamento do ingresso via pix ou outros métodos.](processo-4-nome-do-processo.md "Detalhamento do Processo 4.")

[PROCESSO 5 - Avaliaçao e denúncia dos usuários.](processo-5-nome-do-processo.md "Detalhamento do Processo 5.")


## 4. Projeto da solução

O documento a seguir apresenta o detalhamento do projeto da solução. São apresentadas cinco seções que descrevem, respectivamente: diagrama de classes, diagrama de componentes, diagrama de entidade-relacionamento, tecnologias utilizadas e guias de estilo.

[Projeto da solução](solution-design.md "Detalhamento do Projeto da solução: classes, componentes, der, tecnologias e guias de estilo.")


## 5. Indicadores de desempenho

O documento a seguir apresenta os indicadores de desempenho dos processos.

[Indicadores de desempenho dos processos](performance-indicators.md)


## 6. Interface do sistema

A sessão a seguir apresenta a descrição do produto de software desenvolvido. 

[Documentação da interface do sistema](interface.md)

## 7. Testes

A sessão a seguir apresenta a descrição dos testes de unidade e testes de usabilidade realizados. 

[Testes do sistema](tests.md)

## 8. Conclusão

_Apresente aqui a conclusão do seu trabalho. Discussão dos resultados obtidos no trabalho, onde se verifica as observações pessoais de cada aluno. Poderá também apresentar sugestões de novas linhas de estudo._

# REFERÊNCIAS

_Como um projeto de software não requer revisão bibliográfica, a inclusão das referências não é obrigatória. No entanto, caso você deseje incluir referências relacionadas às tecnologias, padrões, ou metodologias que serão usadas no seu trabalho, relacione-as de acordo com a ABNT._

_Verifique no link abaixo como devem ser as referências no padrão ABNT:_

http://www.pucminas.br/imagedb/documento/DOC_DSC_NOME_ARQUI20160217102425.pdf


**[1.1]** - _ELMASRI, Ramez; NAVATHE, Sham. **Sistemas de banco de dados**. 7. ed. São Paulo: Pearson, c2019. E-book. ISBN 9788543025001._

**[1.2]** - _COPPIN, Ben. **Inteligência artificial**. Rio de Janeiro, RJ: LTC, c2010. E-book. ISBN 978-85-216-2936-8._

**[1.3]** - _CORMEN, Thomas H. et al. **Algoritmos: teoria e prática**. Rio de Janeiro, RJ: Elsevier, Campus, c2012. xvi, 926 p. ISBN 9788535236996._

**[1.4]** - _SUTHERLAND, Jeffrey Victor. **Scrum: a arte de fazer o dobro do trabalho na metade do tempo**. 2. ed. rev. São Paulo, SP: Leya, 2016. 236, [4] p. ISBN 9788544104514._

**[1.5]** - _RUSSELL, Stuart J.; NORVIG, Peter. **Inteligência artificial**. Rio de Janeiro: Elsevier, c2013. xxi, 988 p. ISBN 9788535237016._



# APÊNDICES


_Atualizar os links e adicionar novos links para que a estrutura do código esteja corretamente documentada._


## Apêndice A - Código fonte

[Código do front-end](../src/front) -- repositório do código do front-end

[Código do back-end](../src/back)  -- repositório do código do back-end


## Apêndice B - Apresentação final


[Slides da apresentação final](presentations/arquivo.pdf)


[Vídeo da apresentação final](video/arquivo.mp4)






