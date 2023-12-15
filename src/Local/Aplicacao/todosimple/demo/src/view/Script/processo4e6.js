const loggin = document.querySelector(".logsai")

document.addEventListener("DOMContentLoaded", function () {

    
    if (localStorage.getItem("logado") == "true") {

        const user_id = localStorage.getItem("user_id")
        const us  = JSON.parse(user_id)
        const apinot = "http://localhost:8080/ingresso/user/"
        const apiBase = apinot + us;
        console.log(apiBase)
    console.log(apiBase)

    fetch(apiBase)
        .then(response => {
            if (!response.ok) {
                throw new Error(`Erro na requisição: ${response.status}`);
            }
            return response.json();
        })
        .then(userDataList => {
            closePopup()
            const notificacaoBase = "Os seguintes ingressos foram vendidos: \n "
            document.querySelector(`.notificacao`).insertAdjacentHTML('beforeend', notificacaoBase);

            userDataList.forEach((userData, i) => {
                if (userData.status == "NAO_VALIDO") {
                    console.log(userData.status)

                    console.log(userData)
                    const notificacao = `${userData.description} <br>`
                    // Atualiza o DOM com os dados obtidos
                    document.querySelector(`.notificacao`).insertAdjacentHTML('beforeend', notificacao);
                    openPopup()

                }
            })
            saiu()
        })
        .catch(error => {
            console.error(`Erro na requisição:, error`);
        });
    }else{
        closePopup()
    }
    

    
});

function closePopup() {
    document.getElementById('popup').style.display = "none";
    document.getElementById('overlay').style.display = "none";

}

function openPopup() {
    document.getElementById('popup').style.display = "block";
    document.getElementById('overlay').style.display = "block";

}


function clicou() {

    document.getElementById('icone').style.display = "none";
    document.getElementById('retangulo').style.display = "block";

}

function saiu() {

    document.getElementById('icone').style.display = "block";
    document.getElementById('retangulo').style.display = "none";
}

function sairentrar(event){
    event.preventDefault();
    if (localStorage.getItem("logado") == "true"){
        localStorage.setItem('user', "");
        localStorage.setItem('logado', JSON.stringify(false));
        localStorage.setItem('user_id', "");
        window.location.href = 'Pagina inicial.html';

    }else{
        window.location.href = 'login.html';

    }
}