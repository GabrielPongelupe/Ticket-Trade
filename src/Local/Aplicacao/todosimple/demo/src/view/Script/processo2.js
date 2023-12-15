let i = 1;

document.addEventListener("DOMContentLoaded", function () {
  
    
    // URL base da sua API Spring Boot
    const baseUrl = "http://localhost:8080/ingresso/";
    // Número total de requisições que você deseja fazer
    const totalRequests = 30;
  
    // Loop para realizar as requisições
    for (let i = 1; i <= totalRequests; i++) {
      const apiUrl = baseUrl + i;
  
      fetch(apiUrl)
        .then(response => {
          if (!response.ok) {
            throw new Error(`Erro na requisição: ${response.status}`);
          }
          return response.json();
        })
        .then(userData => {
          console.log(`Dados do usuário ${i}:`, userData);
          const description = `<div>${userData.description}</div>`;
          const data = `<div>${userData.data}</div>`;
          const valor = `<div>${userData.valor}</div>`;
  
          // Atualiza o DOM com os dados obtidos
          document.querySelector(`.description${i}`).insertAdjacentHTML('beforeend', description);
          document.querySelector(`.data${i}`).insertAdjacentHTML('beforeend', data);
          document.querySelector(`.valor${i}`).insertAdjacentHTML('beforeend', valor);
        })
        .catch(error => {
          console.error(`Erro na requisição ${i}:, error`);
        });

        const botaoEstilizado = document.querySelectorAll('.botaoEstilizado');

        botaoEstilizado.forEach(function (botao, index) {
            botao.addEventListener('click', function () {
                // Obter o ID do botão clicado
                const botaoId = botao.id;
        
                // Verificar se o botão já tem um ID
                if (!botaoId) {
                    // Atribuir um ID único ao botão se não tiver um
                    botaoId = `botao_${index + 1}`;
                    botao.id = botaoId;
                }
        
                // Salvar o botaoId no localStorage
                localStorage.setItem('botaoId', botaoId);


            });
        });
    }
  });

    
  function filterTable() {
    var input = document.getElementById("nomeEventoInput").value.toUpperCase();
    var table = document.getElementById("tabelaIngressos");
    var rows = table.getElementsByTagName("tr");
  
    for (var i = 0; i < rows.length; i++) {
        var cells = rows[i].getElementsByTagName("td")[1]; // Index 1 is the column with Nome Evento
  
        if (cells) {
            var textValue = cells.textContent || cells.innerText;
  
            if (textValue.toUpperCase().indexOf(input) > -1) {
                rows[i].style.display = "";
            } else {
                rows[i].style.display = "none";
            }
        }
    }
  }