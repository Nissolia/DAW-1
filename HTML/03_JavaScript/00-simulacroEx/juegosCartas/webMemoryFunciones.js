let imagenes = ["cartas/1.png", "cartas/2.png", "cartas/3.png", "cartas/4.png", "cartas/5.png", "cartas/6.png", "cartas/7.png", "cartas/8.png", "cartas/1.png", "cartas/2.png", "cartas/3.png", "cartas/4.png", "cartas/5.png", "cartas/6.png", "cartas/7.png", "cartas/8.png"]

let idAnterior;
let contadorT = 0;
let contAcertadas = 0;

shuffleArray(imagenes)

function tocar(numCarta) { // el juego en sí.Compara las cartas, y comprueba la victoria

    let carta1 = document.getElementById(numCarta);
    carta1.src = imagenes[numCarta];
    carta1.classList.add('volteada'); //para las animaciones del css. sacado de internet.

    if (contadorT == 0) {
        contadorT++;
        idAnterior = numCarta;
    } else {
        setTimeout(() => {

            let carta2 = document.getElementById(idAnterior);
            carta2.classList.add('volteada');
            if (carta2.src != carta1.src) {
                
                carta1.classList.remove('volteada'); //cierre de animaciones.
                carta2.classList.remove('volteada');

                carta2.src = "cartas/fondo.png";
                carta1.src = "cartas/fondo.png";
            }
            else {
                contAcertadas += 2;
                if (contAcertadas === imagenes.length) {
                    setTimeout(() => {
                        alert("\tHAS GANADO !\n \tREINICIANDO JUEGO\n");
                        reiniciarCartas();
                        shuffleArray(imagenes)
                        contAcertadas = 0;

                    }, 200)
                }
            }
        }, 350);
        contadorT = 0;
    }
}

// mezclar
function shuffleArray(array) { //mezcla las cartas una vez finaliza el juego

    for (var i = array.length - 1; i > 0; i--) {
        var j = Math.floor(Math.random() * (i + 1));
        var temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
// voltear
function reiniciarCartas() { //una vez el juego acaba, vuelve a poner las cartas con la imagen del reverso
    // Vuelve a voltear todas las cartas
    for (let i = 0; i < imagenes.length; i++) {
        let carta = document.getElementById(i);
        carta.src = "cartas/fondo.png";
    }
}

