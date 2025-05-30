let apiUrl = 'http://localhost:8081/consorciosalan';

fetch(apiUrl)
  .then(response => response.json())
  .then(data => {
    console.log('Consórcios   :', data);
    displayConsorcios(data); //  CHAMADA PARA EXIBIR NA TELA
  })
  .catch(error => {
    console.error('Erro ao buscar consórcios:', error);
  });

function displayConsorcios(consorcios) {
  const gallery = document.getElementById('gallery');
  gallery.innerHTML = '';

  consorcios.forEach(item => {
    const div = document.createElement('div');
const titulo = document.createElement('h1');
const valor = document.createElement('p');

// Adicionando as classes
div.classList.add('consorcioLista');
titulo.classList.add('tituloConsorcioLista');
valor.classList.add('valorConsorcioLista');

// Definindo o conteúdo dos elementos
titulo.textContent = `${item.nome}`;
valor.textContent = `Valor: R$${item.valor.toFixed(2)}`;

// Adicionando os elementos ao 'div'
div.appendChild(titulo);
div.appendChild(valor);

// Adicionando a 'div' ao gallery
gallery.appendChild(div);

  });
}
fetch(apiUrl)