const iemail = document.getElementById("email");
const ipassword = document.getElementById("senha");
var raw;


document.addEventListener('DOMContentLoaded', function () {
    

    // Restante do código...
});

function efetuarLogin() {

    localStorage.setItem('logado', JSON.stringify(false));
    localStorage.setItem('user', "");
    localStorage.setItem('user', "");
    var myHeaders = new Headers();
    myHeaders.append("Content-Type", "application/json");
    myHeaders.append("Cookie", "JSESSIONID=34B3D2B4E3D4D23F762BA840A118815E");

    var baseapi = "https://tickettrade.azurewebsites.net/user/login/"
    var urlApi = baseapi + iemail.value
    console.log(urlApi)

    var requestOptions = {
        method: 'GET',
        headers: myHeaders,

        redirect: 'follow'
    };

    fetch(urlApi, requestOptions)
        .then(response => response.text())
        .then(result => {
            console.log(result)
            raw = JSON.parse(result);
        }
        )
        .catch(error => console.log('error', error));

}


function iniciarCadastro(event) {

    event.preventDefault()

    
    efetuarLogin()
    

        setTimeout(() => {
            console.log("OLHA O RAWW", raw)
            console.log(senha.value)
            if (raw.password == senha.value) {
                // Faça algo aqui, pois a senha está presente nos dados obtidos
                localStorage.setItem('user', JSON.stringify(raw));
                localStorage.setItem('logado', JSON.stringify(true));
                iniciarCad2()
                alert("Login realizado com sucesso");
        
                window.location.href = 'Pagina Inicial.html';
            } else {
                alert("Senha não encontrada ou inválida.");
            }
        }, 500);
    
}


function iniciarCad2() {
    const userString = localStorage.getItem("user");


    // Converta a string JSON de volta para um objeto JavaScript
    const user = JSON.parse(userString);

    

    // Agora você pode acessar as propriedades do objeto
    //console.log(user.cpf);

    const baseUrl = "https://tickettrade.azurewebsites.net/user/id/";
    let apiUrl = baseUrl + user.cpf
    console.log(apiUrl)

    var myHeaders = new Headers();
    myHeaders.append("Content-Type", "application/json");
    myHeaders.append("Cookie", "JSESSIONID=34B3D2B4E3D4D23F762BA840A118815E");


    var requestOptions = {
        method: 'GET',
        headers: myHeaders,
        redirect: 'follow'
    };

    fetch(apiUrl, requestOptions)
        .then(response => response.text())
        .then(result => {
            console.log(result)
            localStorage.setItem("user_id", JSON.stringify(result))
        })
        .catch(error => console.log('error', error));

    console.log("AAAAAAAAAAAAA")
    console.log(localStorage.getItem("user_id"))
}