function serverRequest(url, callback ){ 
	var xmlhttp = new XMLHttpRequest(); 
	xmlhttp.onload = function() {
		if (xmlhttp.readyState == 4 || xmlhttp.status == 200) { 
			console.log(xmlhttp.response);
			var resultado = JSON.parse(JSON.stringify(xmlhttp.response));
			callback(resultado); 
		}
	};
	xmlhttp.responseType = "json"; 
	xmlhttp.open("GET", url, true); 
	xmlhttp.send();
}

function search(){
	let peliBuscar = document.getElementById("buscar").value;
	var dir = "http://www.omdbapi.com/?apikey=ff66d08f"+peliBuscar;
	serverRequest(dir, procesarRespuesta); 
}

function procesarRespuesta(jsonObject){ 
	//contenedor.appendChild(noRepetir(jsonObject.Search[0].year,"p"));
	//alert(jsonObject.Search[0].Title)
	let arreglo = jsonObject.Search;
	console.log(arreglo);
	for (var i = 0; i < arreglo.length; i++) {

		let imdbID = arreglo[i].imdbID;

		let pelicula = crearElementoBasico("div", "pelicula2", null);
		let poster = document.createElement("div", null, null);
		let imagen = crearImagen(arreglo[i].Poster);
		poster.appendChild(imagen);
		pelicula.appendChild(poster);

		let datos = crearElementoBasico("div", "datos", null);
		let h4 = crearElementoBasico("h4", null, arreglo[i].Title);
		let ul = crearElementoBasico("ul", null, null);
		ul.appendChild(crearElementoBasico("li", null, "Año: " + arreglo[i].Year));
		ul.appendChild(crearElementoBasico("li", null, "Tipo: " + arreglo[i].Type));

		h4.appendChild(ul);
		datos.appendChild(h4);

		let detallesURL = "http://www.omdbapi.com/?apikey=ff66d08f&plot=full&r=json&tomatoes=true&i="+imdbID;
		let btnMasInfo = crearElementoBasico("button", null, "Mas info");
		btnMasInfo.onclick = function(){
			
			//btnMasInfo.innerHTML="mostrar menos";
			//let mostrarMenos = crearElementoBasico("button",null,"Mostrar Menos");
			//datos.appendChild(mostrarMenos);
			//mostrarMenos.onclick=function(){
			if (this.innerHTML === "Mas info"){
			
				if (document.getElementById(imdbID).childNodes.length === 0)
					serverRequest(detallesURL, procesarDetalles);				
				else
					document.getElementById(imdbID).style.display = "block";
					

				btnMasInfo.innerHTML = "Mostrar menos";
			}else{
				document.getElementById(imdbID).style.display = "none";
				btnMasInfo.innerHTML = "Mas info";
			}
			
			//this.style.visibility = "hidden";					
				
				//mostrarMenos.style.display="none";
				
				//btnMasInfo.style.display="inline";
			//}
		}
		datos.appendChild(btnMasInfo);
		


		let detalles = crearElementoBasico("div", "masDetalle2", null);
		detalles.id = imdbID;
		datos.appendChild(detalles);

		pelicula.appendChild(datos);
		document.getElementById("resultados").appendChild(pelicula);
		
	}
	
}

function procesarDetalles(jsonObject){
		console.log(jsonObject);
		let contenedorEnHTML = document.getElementById(jsonObject.imdbID);
	//	let adentroBoton = crearElementoBasico("div", "datos", null);
		let ttt = crearElementoBasico("ul", null, null);
		ttt.appendChild(crearElementoBasico("li", null, "Trama: " + jsonObject.Plot));
		ttt.appendChild(crearElementoBasico("li", null, "Calificación: " + jsonObject.Ratings));
		ttt.appendChild(crearElementoBasico("li", null, "Duración: " + jsonObject.Runtime));
		ttt.appendChild(crearElementoBasico("li", null, "Género: " + jsonObject.Genre));
		ttt.appendChild(crearElementoBasico("li", null, "Director: " + jsonObject.Director));
		ttt.appendChild(crearElementoBasico("li", null, "Escritor: " + jsonObject.Writer));
		ttt.appendChild(crearElementoBasico("li", null, "Protagonistas: " + jsonObject.Actors));
		ttt.appendChild(crearElementoBasico("li", null, "Premios: " + jsonObject.Awards));
		ttt.appendChild(crearElementoBasico("li", null, "Votos: " + jsonObject.imdbVotes));
		ttt.appendChild(crearElementoBasico("li", null, "Producción: " + jsonObject.Production));
		contenedorEnHTML.appendChild(ttt);
}

function crearElementoBasico(tag, clase, texto){
	let elemento = document.createElement(tag);
	if (clase !== null)
		elemento.className = clase;
	if (texto !== null)
		elemento.innerHTML = texto;
	return elemento;
}

function crearImagen(url){
	let imagen = document.createElement("img");
	imagen.src = url;
	return imagen;
}
