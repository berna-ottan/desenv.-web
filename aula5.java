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
