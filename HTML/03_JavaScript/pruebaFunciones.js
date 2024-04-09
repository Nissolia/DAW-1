let turno = 0;
let primeraCarta = null;

function tocar(elecc) {
    let carta = document.getElementById("carta" + elecc);

    // Verifica si la carta ya está girada o si ya hay dos cartas seleccionadas
    if (carta.dataset.girada === "true" || turno === 2) {
        return;
    }

    // Voltea la carta
    carta.src = "cartas/" + imagenes[elecc];
    carta.dataset.girada = true;

    if (turno === 0) {
        primeraCarta = elecc;
        turno = 1;
    } else {
        if (imagenes[elecc] !== imagenes[primeraCarta]) {
            // Si las cartas no son iguales, espera un momento y luego voltea ambas cartas boca abajo
            setTimeout(function () {
                voltearBocaAbajo(elecc, primeraCarta);
            }, 1000);
        }
        turno = 0;
        primeraCarta = null;
    }
}

function voltearBocaAbajo(carta1, carta2) {
    document.getElementById("carta" + carta1).src = "cartas/fondo.png";
    document.getElementById("carta" + carta1).dataset.girada = false;

    document.getElementById("carta" + carta2).src = "cartas/fondo.png";
    document.getElementById("carta" + carta2).dataset.girada = false;
}
