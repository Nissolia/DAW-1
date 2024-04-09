//      Tu tarea es crear el script "ejercicio.js"
//     con  código JavaScript para que cuando se 
//     haga clic 10 veces en el botón, el texto del 
//     elemento h1 cambie a "¡Has hecho clic en el botón!" 
//     y las letras aparezcan en verde.
let contBoton = 0;
let titulo = document.getElementById('titulo');
let miBoton = document.getElementById('miBoton');

// ID: titulo    miBoton

function botoneado(){
contBoton++;
if (contBoton >= 10) {
    document.getElementById('titulo').textContent = "¡Has hecho click en el botón!";
    document.getElementById('titulo').style.color = "green";
}
}