let variavel = 10
console.log('conta', 10 + ++variavel);
console.log('variável', variavel);

let resultado;
const preco = 40;

/*if (preco < 40)  {
  resultado = "livro é barato"
} else {
  resultado = "livro não é barato"
}*/

resultado = preco < 40 ? "livro é barato." : "livro não é barato."
console.log(resultado);


let x = 3;

console.log(x === '3');
console.log(x > 3);

const meuObjeto = {
  nome : 'Bernardo',
  idade : 18
}

function minhaFuncao(entrada){
  return entrada + 1;
}

const outraFuncao = function(entrada){
  return entrada + 22;
}

const setinha = (entrada) => {
  return entrada + 33;
}

const setinha2 = (entrada) => entrada + 34;

const meuArray = [21, 34, 'Andergleison', [32,45]];

let minhaGlobal = 34;

function minhaNovissimaFuncao(){
  var minhaGlobal = 23 
  return minhaGlobal;
}

function minhaFuncaoMaior(entrada){
  let resultado;
  if (entrada % 2 === 0){
    resultado = 'par';
  }
  return resultado;
}

function minhaFuncaoMaior2(entrada){
  let r;
  if (entrada % 2 === 0){
    r = 'par';
  } else {
    r = 'ímpar';
  }
  return r;
}

meuArray.forEach((el) => console.log(el))

const funcImprime = (ele, indice) => console.log("índice", indice, ":", ele)

meuArray.forEach(funcImprime)

function minhaFuncaoMaior3(entrada){
  const r = '';
  if (entrada % 2 == 0){
    r = 'par';
  } else {
    r = 'ímpar';
  }
  return r;
}