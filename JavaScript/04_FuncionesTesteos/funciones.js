//////////////////////////////// 1. Función comprobar si un número es par	
// Funcion para comprobar si el numero es par si da true
function comprobarEsPar(numero) {
    if (numero % 2 == 0) {
        console.log('Es par');
        return true;
    } else {
        console.log('Es impar');
        return false;
    }
}
//////////////////////////////// 2. Función calificación con nota entera
// funcion para ver la calificacion que tenemos en total
function verCalificacion(nota) {
   nota = parseInt(nota);
    switch (nota) {
        case (nota >= 0 && nota <= 4):
            return "INSUFICIENTE";
            console.log("INSUFICIENTE");
            break;
        case (nota == 5):
            return "SUFICIENTE";
            console.log("SUFICIENTE");
            break;
        case (nota == 6):
            return "BIEN";
            console.log("BIEN");
            break;
        case (nota >= 7 && nota <= 8):
            return "NOTABLE";
            console.log("NOTABLE");
            break;
        case (nota >= 9 && nota <= 10):
            return "SOBRESALIENTE";
            console.log("SOBRESALIENTE");
            break;
        default:
            return "VALOR INCORRECTO";
            console.log("VALOR INCORRECTO");
            break;
    }
}
//////////////////////////////// 3. Función calificación con nota decimal	
// funcion calificacion decimal
function verCalificacionDecimal(nota) {
    nota = parseFloat(nota);
    switch (nota) {
        case (nota >= 0.0 && nota <= 4.0):
            return "INSUFICIENTE";
            break;
        case (nota >= 5.0 && nota <= 5.9):
            return "SUFICIENTE";
            break;
        case (nota >= 6.0 && nota <= 6.9):
            return "BIEN";
            break;
        case (nota >= 7.0 && nota <= 8.0):
            return "NOTABLE";
            break;
        case (nota >= 9.0 && nota <= 10.0):
            return "SOBRESALIENTE";
            break;
        default:
            return "VALOR INCORRECTO";
            break;
    }
}
//////////////////////////////// 4. Calcular perímetro y área de una circunferencia	2
function parametrosCircunferencia(radio) {
    let area = Math.PI * Math.pow(radio, 2);
    let perimetro = 2 * Math.PI * radio;
    // devolvemos un objeto
    return {
        perimetro: perimetro,
        area: area
    }
}
//////////////////////////////// 5. Función comprobar si un año es bisiesto
function esBisiesto(numero) {
    if (numero % 4 == 0) {
        //es bisiesto
        return true;
        if (numero % 100 == 0) {
            //no es bisiesto
            return false;
            if (numero % 400 == 0) {
                //si es bisiesto
                return true;
            }
        } else {
            //es bisiesto
            return true;
        }
    } else {
        //no es bisiesto
        return false;
    }
}
//////////////////////////////// 6. Conversor de hexadecimal a decimal
function hexa2decimal(cadena) {
    let numFinal = 0;
    let arrayCadena = [];

    // Recorremos la cadena en sentido inverso para tener el dígito menos significativo al final
    for (let i = 0; i < cadena.length; i++) {
        arrayCadena.push(cadena[i].toUpperCase());
        // Convertimos el dígito hexadecimal a decimal y aplicamos la potencia de 16
        numFinal += digitoHexa2Dec(arrayCadena[i]) * Math.pow(16, cadena.length - 1 - i);
    }
    console.log('numFinal', numFinal);
    return numFinal;
}

// Función para convertir un dígito hexadecimal a decimal
function digitoHexa2Dec(caracter) {
    switch (caracter) {
        case "0":
            return 0;
        case "1":
            return 1;
        case "2":
            return 2;
        case "3":
            return 3;
        case "4":
            return 4;
        case "5":
            return 5;
        case "6":
            return 6;
        case "7":
            return 7;
        case "8":
            return 8;
        case "9":
            return 9;
        case "A":
            return 10;
        case "B":
            return 11;
        case "C":
            return 12;
        case "D":
            return 13;
        case "E":
            return 14;
        case "F":
            return 15;
        default:
            alert("Dígito hexadecimal no válido.");
            return 0;
    }
}

// redondear decimales
function redondearDecimales(numero, decimales) {
    return Math.round(numero * Math.pow(10, decimales)) / Math.pow(10, decimales);
}
//Mostrar texto en el div
function volcarTextoWeb(texto) {
    document.querySelector("#contenido").insertAdjacentHTML('beforeend', `<p>${texto}</p>`);
}