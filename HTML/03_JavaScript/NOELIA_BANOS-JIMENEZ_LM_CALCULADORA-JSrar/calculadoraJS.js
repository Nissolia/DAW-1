/*************************/
/* AÑADIR COSAS DEL HTML */
/*************************/
let pantalla = document.getElementById('pantalla');
/***************************/
/*  VARIABLES DE FUNCIONES */
/***************************/
let numeroInicial = 0;
let total = 0;
/*************/
/* FUNCIONES */
/*************/
/*AÑADIR NUMEROS */
function pon(valor) {
    pantalla.innerText += valor;
    console.log(numeroInicial.innerText)
};
function borrar() {
    pantalla.innerText = " ";
    console.log(numeroInicial.innerText)
};
function calcular() {
    pantalla.innerText = eval(pantalla.innerText)
};