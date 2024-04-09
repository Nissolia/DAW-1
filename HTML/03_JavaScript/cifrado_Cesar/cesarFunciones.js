/****************************/
/*  HECHO POR NOELIA BAÑOS  */
/*   AÑADIR COSAS DEL HTML  */
/****************************/
let numero = document.getElementById('numero');
let texto = document.getElementById('texto');
let textoCodificado = document.getElementById('textoCodificado');
/***************************/
/*  VARIABLES DE FUNCIONES */
/***************************/
let abc = "abcdefghijklmnñopqrstuvwxyz";
/*************/
/* FUNCIONES */
/*************/
function cifrar() {
// intento

string = texto.value;
string = string.toLowerCase();
texto.value = string;
// intento

  textoCodificado.innerText = ""; // para que se ponga vacio
  let abcTrans = abc.slice(numero.value, abc.length) + abc.slice(0, numero.value);

  // comenzamos a buscar en el indice del texto
  for (let i = 0; i < texto.value.length; i++) {
    if (texto.value[i] == " ") {     
      textoCodificado.textContent += " " ; // contenido de texto
    }else{
    let indice = abc.indexOf(texto.value[i]) // incide del abecedario
    textoCodificado.textContent  += abcTrans[indice];} // sumar con el índice
  }
}
// 
