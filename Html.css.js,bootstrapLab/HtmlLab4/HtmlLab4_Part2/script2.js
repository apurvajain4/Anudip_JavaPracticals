document.getElementById('loadImagesBtn').addEventListener('click', loadImages);

function loadImages() {
    fetch('https://api.unsplash.com/photos/random?count=18&client_id=Mz68OKWKXa7RSkRSW2kHeW9963Aa6D9FyF3EMhIraL8')
        .then(response => response.json())
        .then(data => {
            const gallery = document.getElementById('gallery');
            gallery.innerHTML = '';
            data.forEach(image => {
                const card = document.createElement('div');
                card.classList.add('card');
                const img = document.createElement('img');
                img.src = image.urls.small;
                card.appendChild(img);
                gallery.appendChild(card);
            });
        })
        .catch(error => console.error('Error fetching images:', error));
}