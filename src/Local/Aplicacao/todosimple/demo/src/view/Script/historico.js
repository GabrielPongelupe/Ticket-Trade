document.addEventListener("DOMContentLoaded", function () {
  // URL base da sua API Spring Boot
  if(localStorage.getItem("logado") == "true"){

  
  const baseUrl = "http://localhost:8080/ingresso/user/1";

  const table = document.getElementById("tabelaIngressos");

  fetch(baseUrl)
    .then(response => {
      if (!response.ok) {
        throw new Error(`Erro na requisição: ${response.status}`);
      }
      return response.json();
    })
    .then(userDataList => {
      // Itera sobre cada item na lista e cria uma linha para cada um
      userDataList.forEach((userData, i) => {
        console.log(`Dados do usuário ${i + 1}:`, userData);

        // Criação da linha HTML
        const linha = 
        `<tr>
            <td>
              <img src="Imagens/RogerW.jpeg" alt="Imagem do Evento">
            </td>
            <td>${userData.description}</td>
            <td>${userData.data}</td>
            <td>${userData.valor}</td>
            <td>${userData.status} </td>
            <td> 
              <a href="avaliacao.html" class="botaoEstilizado">Rating</a>
            </td>
          </tr>`
        ;

        // Atualiza o DOM com os dados obtidos
        table.insertAdjacentHTML('beforeend', linha);
      });
    })
    .catch(error => {
      console.error(`Erro na requisição:`, error);
    });
  }else{
    alert("Voce nao está logado, faça login para ter acesso a esta funcionalidade")
    window.location.href = 'Pagina inicial.html';

  }
});