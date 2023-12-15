


function pagamentoPOST(event) {
    event.preventDefault()

    var myHeaders = new Headers();
    myHeaders.append("Content-Type", "application/json");
    myHeaders.append("Cookie", "JSESSIONID=34B3D2B4E3D4D23F762BA840A118815E");

    var raw = JSON.stringify({
        "id": 2,
        "valor": 120,
        "description": "Bruno Mars",
        "status": "NAO_VALIDO",
        "data": "2023-12-01"
    });

    var requestOptions = {
        method: 'PUT',
        headers: myHeaders,
        body: raw,
        redirect: 'follow'
    };

    fetch("https://tickettrade.azurewebsites.net/ingresso/1", requestOptions)
        .then(response => response.text())
        .then(result => console.log(result))
        .catch(error => console.log('error', error));

    
}