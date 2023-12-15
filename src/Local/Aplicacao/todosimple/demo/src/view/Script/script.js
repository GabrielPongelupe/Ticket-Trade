
const inome = document.getElementById("name");
const iemail = document.getElementById("email");
const iCPF = document.getElementById("CPF");
const idatanasc = document.getElementById("datanasc");
const ipix = document.getElementById("pix");
const ipassword = document.getElementById("password");
const irg = document.getElementById("rg");

let err = 0;
var raw;

function cadastrar() {

    var myHeaders = new Headers();
    myHeaders.append("Content-Type", "application/json");
    myHeaders.append("Cookie", "JSESSIONID=34B3D2B4E3D4D23F762BA840A118815E");

    raw = JSON.stringify({
        "username": inome.value,
        "password": ipassword.value,
        "cpf": iCPF.value,
        "email": iemail.value,
        "chavePix": ipix.value,
        "rg": irg.value
    });
    var requestOptions = {
        method: 'POST',
        headers: myHeaders,
        body: raw,
        redirect: 'follow'
    };

    fetch("http://localhost:8080/user", requestOptions)
        .then(response => {
            if (!response.ok) {
                err++
                console.log("err: ", err)
                response.text()
                if (err >= 2) {
                    alert("Não foi possível realizar login")
                }

            }

        })
        .then(result => console.log(result))
        .then(userData => {
            // userData agora deve conter as informações do usuário, incluindo o ID
            console.log("Dados do usuário:", userData);

            // Continue com o processamento do ID ou outras informações, se necessário

            // Agora você pode salvar o ID no localStorage ou usar conforme necessário

        })
        .catch(error => {
            console.log('error', error)

        })





}



function iniciarCadastro(event) {
    event.preventDefault();
    
    localStorage.setItem('logado', JSON.stringify(false));
    localStorage.setItem('user', "");
    localStorage.setItem('user', "");
    cadastrar()

    if (err < 2) {
        localStorage.setItem('user', raw);
        localStorage.setItem('logado', JSON.stringify(true));
        console.log(localStorage.getItem("logado"))
        console.log(localStorage.getItem("user"))
        alert("Cadastro realizado com sucesso")
        window.location.href = 'Pagina Inicial.html';

    }

    iniciarCad2()
    
}


document.addEventListener('DOMContentLoaded', function () {
    // Get the button element
    iniciarCad2()
    const cadastrarButton = document.querySelector('.continue-button button');

    // Attach the event listener to the button
    cadastrarButton.addEventListener('click', cadastrar);
});


function iniciarCad2() {
    const userString = localStorage.getItem("user");


    // Converta a string JSON de volta para um objeto JavaScript
    const user = JSON.parse(userString);

    var user_id;

    // Agora você pode acessar as propriedades do objeto
    //console.log(user.cpf);

    const baseUrl = "http://localhost:8080/user/id/";
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