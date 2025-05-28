// URL da API
/*const apiUrl = 'https://run.mocky.io/v3/726a5cb4-5894-44a1-b624-f166abb59767';

// Função para buscar os produtos da API
async function fetchPhotos() {
  try {
    const response = await fetch(apiUrl);
    if (!response.ok) throw new Error('Erro na requisição');

    const consorcios = await response.json();
    displayPhotos(consorcios);
  } catch (error) {
    console.error('Erro ao carregar os produtos:', error);
  }
}

function displayPhotos(consorcios) {
  const gallery = document.getElementById('gallery');
  const totalPhotosElement = document.getElementById('total-photos');
  gallery.innerHTML = '';

  totalPhotosElement.textContent = consorcios.length;

  consorcios.forEach(item => {
    const photoContainer = document.createElement('div');
    photoContainer.classList.add('photo-item');

    const imgElement = document.createElement('img');
    imgElement.src = item.imagemUrl;
    imgElement.alt = item.nome;

    const titleElement = document.createElement('h3');
    titleElement.textContent = item.nome;

    const valorElement = document.createElement('p');
    valorElement.textContent = `Valor: R$ ${item.valor.toFixed(2)}`;

    const parcelasElement = document.createElement('p');
    parcelasElement.textContent = `Parcelas: ${item.parcelas}`;

    const dataElement = document.createElement('p');
    dataElement.textContent = `Criado em: ${new Date(item.dataCriacao).toLocaleDateString('pt-BR')}`;

    photoContainer.append(imgElement, titleElement, valorElement, parcelasElement, dataElement);
    gallery.appendChild(photoContainer);
  });
}

fetchPhotos();
const consorcios = await response.json();
console.log('Dados recebidos:', consorcios);
*/

