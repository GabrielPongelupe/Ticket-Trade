document.addEventListener("DOMContentLoaded", function () {
  const botaoId = localStorage.getItem('botaoId');

  const apiBase = "http://localhost:8080/ingresso/";
  const apiUrl = apiBase + botaoId
  console.log(apiUrl)

    fetch(apiUrl)
      .then(response => {
        if (!response.ok) {
          throw new Error(`Erro na requisição: ${response.status}`);
        }
        return response.json();
      })
      .then(userData => {
        console.log(`Dados do usuário:`, userData);
        const description = `<div>${userData.description}</div>`;
        const data = `<div>${userData.data}</div>`;
        const valor = `<div>R$ ${userData.valor}</div>`;
        const info = `o show do ${userData.description} irá ocorrer no dia ${userData.data}`

        // Atualiza o DOM com os dados obtidos
        document.querySelector(`.description`).insertAdjacentHTML('beforeend', description);
        document.querySelector(`.data`).insertAdjacentHTML('beforeend', data);
        document.querySelector(`.valor`).insertAdjacentHTML('beforeend', valor);
        document.querySelector(`.info`).insertAdjacentHTML('beforeend', info);

      })
      .catch(error => {
        console.error(`Erro na requisição:, error`);
      });
});

function pagamentoPIX(event){
event.preventDefault();
window.location.href = 'pagamentoPix.html';

}