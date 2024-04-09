let imagenes = ["imagenes/carta1.jpg", "imagenes/carta2.jpg", "imagenes/carta3.webp", "imagenes/carta4.webp", "imagenes/carta5.png", "imagenes/carta6.jpg", "imagenes/carta7.jpg", "imagenes/carta8.png", "imagenes/carta1.jpg", "imagenes/carta2.jpg", "imagenes/carta3.webp", "imagenes/carta4.webp", "imagenes/carta5.png", "imagenes/carta6.jpg", "imagenes/carta7.jpg", "imagenes/carta8.png"]

let idAnterior;
let contadorT = 0;
let barraProgreso = document.getElementById('barraProgreso');
let contadorAcertadas = 0;

shuffleArray(imagenes)

function cambiarCarta(nCarta) { // el juego en sí.Compara las cartas, y comprueba la victoria

    let carta1 = document.getElementById(nCarta);
    carta1.src = imagenes[nCarta]
    carta1.classList.add('volteada'); //para las animaciones del css. sacado de internet.

    if (contadorT == 0) {
        contadorT++;
        idAnterior = nCarta;

    } else {

        setTimeout(() => {

            let carta2 = document.getElementById(idAnterior);
            carta2.classList.add('volteada');
            if (carta2.src != carta1.src) {
                
                carta1.classList.remove('volteada'); //cierre de animaciones.
                carta2.classList.remove('volteada');

                carta2.src = "imagenes/fondo-carta2.jpg";
                carta1.src = "imagenes/fondo-carta2.jpg";
                restarBarra();
            }
            else {
                barraProgreso.value += 25;
                contadorAcertadas += 2;
                if (contadorAcertadas === imagenes.length) {
                    setTimeout(() => {

                        alert("\tHAS GANADO !\n \tREINICIANDO JUEGO\n");
                        barraProgreso.value = 100;

                        reiniciarCartas();
                        shuffleArray(imagenes)
                        contadorAcertadas = 0;

                    }, 200)
                }
            }
        }, 350);
        contadorT = 0;
    }
}

function shuffleArray(array) { //mezcla las cartas una vez finaliza el juego

    for (var i = array.length - 1; i > 0; i--) {
        var j = Math.floor(Math.random() * (i + 1));
        var temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

function restarBarra() { //resta porcentaje a la barra de vida por cada fallo. si llega a 0, el juego se acaba

    barraProgreso.value -= 15;

    if (barraProgreso.value <= 0) {

        setTimeout(() => {
            /* Uso un settimeout para ver la barra bajar a 0 antes de finalizar el juego. 
            Si no, el mensaje de perder sale antes de que la barra se vea agotarse */
            alert("\tSE ACABÓ ! HAS PERDIDO !\n \tREINICIANDO JUEGO \n");
            barraProgreso.value = 100;
            reiniciarCartas();
            shuffleArray(imagenes)
        }, 250)
    }
}

function reiniciarCartas() { //una vez el juego acaba, vuelve a poner las cartas con la imagen del reverso
    // Vuelve a voltear todas las cartas
    for (let i = 0; i < imagenes.length; i++) {
        let carta = document.getElementById(i);
        carta.src = "imagenes/fondo-carta2.jpg";
    }
}