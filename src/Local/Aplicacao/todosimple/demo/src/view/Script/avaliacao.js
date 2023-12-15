const desc = document.getElementById("desc")
var estrela;
const allStar = document.querySelectorAll('.rating .star')
const ratingValue = document.querySelector('.rating input')


function avaliar(event){
    event.preventDefault()
    console.log(desc.value)

    avaliarPost()
}

allStar.forEach((item, idx)=> {
	item.addEventListener('click', function () {
		let click = 0
		ratingValue.value = idx + 1

		allStar.forEach(i=> {
			i.classList.replace('bxs-star', 'bx-star')
			i.classList.remove('active')
		})
        estrela = 0
		for(let i=0; i<allStar.length; i++) {
			if(i <= idx) {
                estrela++
				allStar[i].classList.replace('bx-star', 'bxs-star')
				allStar[i].classList.add('active')
			} else {
				allStar[i].style.setProperty('--i', click)
				click++
			}
		}
        console.log(estrela)
	})
})

document.addEventListener("DOMContentLoaded", function () {

    estrela = 0;
})


function avaliarPost(){
    var myHeaders = new Headers();
myHeaders.append("Content-Type", "application/json");
myHeaders.append("Cookie", "JSESSIONID=34B3D2B4E3D4D23F762BA840A118815E");

var raw = JSON.stringify({
  "estrelas": estrela,
  "id": 1,
  "userId": 3
});

var requestOptions = {
  method: 'POST',
  headers: myHeaders,
  body: raw,
  redirect: 'follow'
};

fetch("http://localhost:8080/avaliacao", requestOptions)
  .then(response => response.text())
  .then(result => console.log(result))
  .catch(error => console.log('error', error));
}