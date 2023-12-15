const idescrition = document.getElementById("description")
const idata = document.getElementById("data")
const ivalor = document.getElementById("valor")

function cadastrarIngresso(event){
    event.preventDefault();
    postaIngresso()
}



function postaIngresso(){
    const dateObj = new Date(idata.value);
    var user_id_string = localStorage.getItem("user_id");

// Removendo espaços em branco e convertendo para BigInt com verificação
    Number.parseInt(user_id_string.trim(), 10);

    const year = dateObj.getFullYear();
    const month = String(dateObj.getMonth() + 1).padStart(2, '0'); // O mês é base 0, então é necessário adicionar 1
    const day = String(dateObj.getDate()).padStart(2, '0');

    const idInt = Number.parseInt(user_id_string)

    const formattedDate = `${year}-${month}-${day}`;
    
    var myHeaders = new Headers();
myHeaders.append("Content-Type", "application/json");
myHeaders.append("Cookie", "JSESSIONID=34B3D2B4E3D4D23F762BA840A118815E");

var raw = JSON.stringify({
  "valor": ivalor.value,
  "description": idescrition.value,
  "data": formattedDate,
  "idUser": 1
});

var requestOptions = {
  method: 'POST',
  headers: myHeaders,
  body: raw,
  redirect: 'follow'
};

fetch("https://tickettrade.azurewebsites.net/ingresso", requestOptions)
  .then(response => response.text())
  .then(result => console.log(result))
  .catch(error => console.log('error', error));
}

document.addEventListener("DOMContentLoaded", function () {
    if(localStorage.getItem("logado") == "true"){

    }else{
        alert("Voce nao está logado, faça login para ter acesso a esta funcionalidade")
        window.location.href = 'Pagina inicial.html';
    }
})
