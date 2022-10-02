/*
- Crea un mapa en HTML

- Pon chinchetas en tus 3 lugares favoritos del planeta tierra
*/

function initMap() {
    // The location of Uluru
    const barcelona = { lat: 41.475, lng: 2.162 }; //41.47501344578239, 2.1621595301290246
    const bilbao = { lat: 43.359, lng: -2.961 }; //43.35924692336581, -2.961030761045437
    const roma = { lat: 41.888, lng: 12.492 }; //41.888009267200104, 12.492730423017994

    const map = new google.maps.Map(document.getElementById("map"), {
      zoom: 6,
      center: barcelona,
    });

    const marker_1 = new google.maps.Marker({
      position: barcelona,
      map: map,
    });

    const marker_2 = new google.maps.Marker({
        position: bilbao,
        map: map,
    });

    const marker_3 = new google.maps.Marker({
        position: roma,
        map: map,
    });
  }