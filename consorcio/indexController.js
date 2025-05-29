let apiUrl = 'http://localhost:8080/consorcios';

fetch(apiUrl)
  .then(response => response.json())
  .then(data => {
    console.log('Consórcios   :', data);
    displayConsorcios(data); // 👈 CHAMADA PARA EXIBIR NA TELA
  })
  .catch(error => {
    console.error('Erro ao buscar consórcios:', error);
  });

function displayConsorcios(consorcios) {
  const gallery = document.getElementById('gallery');
  gallery.innerHTML = '';

  consorcios.forEach(item => {
    const div = document.createElement('div');
    div.textContent = `${item.nome} - Valor: R$${item.valor.toFixed(2)}`;
    gallery.appendChild(div);
  });
}
