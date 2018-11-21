
function onHome(){
    cleanMain();

    var html = "";
   
    html += "<div class='bg-container-1'>"
        html += "<div class='container'>"
            html +=	"<div class='row'>"
                html += "<a class='col-md-4' href='http://orig03.deviantart.net/b3ed/f/2014/122/d/6/spess___by_drzestarooni-d7gw4sw.jpg'><img src='https://via.placeholder.com/150'></a>"
                html += "<a class='col-md-4' href='http://orig03.deviantart.net/b3ed/f/2014/122/d/6/spess___by_drzestarooni-d7gw4sw.jpg'><img src='https://via.placeholder.com/350'></a>"
                html += "<a class='col-md-4' href='http://orig03.deviantart.net/b3ed/f/2014/122/d/6/spess___by_drzestarooni-d7gw4sw.jpg'><img src='https://via.placeholder.com/200'></a>"
            html +=	"</div>"
            html +=	"<div class='row'>"
                html += "<a class='col-md-3' href='http://orig03.deviantart.net/b3ed/f/2014/122/d/6/spess___by_drzestarooni-d7gw4sw.jpg'><img src='https://via.placeholder.com/150'></a>"
                html += "<a class='col-md-3' href='http://orig03.deviantart.net/b3ed/f/2014/122/d/6/spess___by_drzestarooni-d7gw4sw.jpg'><img src='https://via.placeholder.com/150'></a>"
                html += "<a class='col-md-3' href='http://orig03.deviantart.net/b3ed/f/2014/122/d/6/spess___by_drzestarooni-d7gw4sw.jpg'><img src='https://via.placeholder.com/100'></a>"
                html += "<a class='col-md-3' href='http://orig03.deviantart.net/b3ed/f/2014/122/d/6/spess___by_drzestarooni-d7gw4sw.jpg'><img src='https://via.placeholder.com/250'></a>"
                html += "<a class='col-md-3' href='http://orig03.deviantart.net/b3ed/f/2014/122/d/6/spess___by_drzestarooni-d7gw4sw.jpg'><img src='https://via.placeholder.com/400'></a>"
            html +=	"</div>"
        html +=	"</div>"
    html +=	"</div>"

    html += "<div class='container-fluid black-bg'>"
        html += "<h1 class='splitter-header'>MORE SPESS</h1>"
    html += "</div>"

    html += "<div class='bg-container-2'>"
        html += "<div class='container'>"
            html +=	"<div class='row'>"
                html += "<a class='col-md-4' href='http://orig03.deviantart.net/b3ed/f/2014/122/d/6/spess___by_drzestarooni-d7gw4sw.jpg'><img src='https://via.placeholder.com/150'></a>"
                html += "<a class='col-md-4' href='http://orig03.deviantart.net/b3ed/f/2014/122/d/6/spess___by_drzestarooni-d7gw4sw.jpg'><img src='https://via.placeholder.com/350'></a>"
                html += "<a class='col-md-4' href='http://orig03.deviantart.net/b3ed/f/2014/122/d/6/spess___by_drzestarooni-d7gw4sw.jpg'><img src='https://via.placeholder.com/200'></a>"
            html +=	"</div>"
            html +=	"<div class='row'>"
                html += "<a class='col-md-3' href='http://orig03.deviantart.net/b3ed/f/2014/122/d/6/spess___by_drzestarooni-d7gw4sw.jpg'><img src='https://via.placeholder.com/150'></a>"
                html += "<a class='col-md-3' href='http://orig03.deviantart.net/b3ed/f/2014/122/d/6/spess___by_drzestarooni-d7gw4sw.jpg'><img src='https://via.placeholder.com/150'></a>"
                html += "<a class='col-md-3' href='http://orig03.deviantart.net/b3ed/f/2014/122/d/6/spess___by_drzestarooni-d7gw4sw.jpg'><img src='https://via.placeholder.com/100'></a>"
                html += "<a class='col-md-3' href='http://orig03.deviantart.net/b3ed/f/2014/122/d/6/spess___by_drzestarooni-d7gw4sw.jpg'><img src='https://via.placeholder.com/250'></a>"
                html += "<a class='col-md-3' href='http://orig03.deviantart.net/b3ed/f/2014/122/d/6/spess___by_drzestarooni-d7gw4sw.jpg'><img src='https://via.placeholder.com/400'></a>"
            html +=	"</div>"
        html +=	"</div>"
    html +=	"</div>"

    document.getElementsByTagName("main")[0].insertAdjacentHTML("afterbegin", html);
   
}

function onGallery(){
    cleanMain();

    var html = "";
   
    html += "<div class='bg-container-1'>"
        html += "<div class='container gallery-container'>"
            html +=	"<div class='row img-container'>"
                html += "<a href='./res/earth_1.jpg' data-toggle='lightbox' data-gallery='gallery' class='col-md-3'>"
                    html += "<img src='./res/earth_1.jpg' class='img-fluid rounded'>"
                html += "</a>"
                html +=	"<a href='./res/jupiter_1.jpg' data-toggle='lightbox' data-gallery='gallery' class='col-md-3'>"
                    html +=	"<img src='./res/jupiter_1.jpg' class='img-fluid rounded'>"
                html +=	"</a>"
                html +=	"<a href='./res/mars_1.jpg' data-toggle='lightbox' data-gallery='gallery' class='col-md-3'>"
                    html +=	"<img src='./res/mars_1.jpg' class='img-fluid rounded'>"
                html +=	"</a>"
                html +=	"<a href='./res/mercury_1.jpg' data-toggle='lightbox' data-gallery='gallery' class='col-md-3'>"
                    html +=	"<img src='./res/mercury_1.jpg' class='img-fluid rounded'>"
                html +=	"</a>"
            html +=	"</div>"
            html +=	"<div class='row img-container'>"
                html += "<a href='./res/saturn_1.jpg' data-toggle='lightbox' data-gallery='gallery' class='col-md-12'>"
                    html += "<img src='./res/saturn_1.jpg' class='img-fluid rounded'>"
                html += "</a>"
            html +=	"</div>"
            html +=	"<div class='row img-container'>"
                html +=	"<a href='./res/uranus_1.jpg' data-toggle='lightbox' data-gallery='gallery' class='col-md-4'>"
                    html +=	"<img src='./res/uranus_1.jpg' class='img-fluid rounded'>"
                html +=	"</a>"
                html += "<a href='./res/neptune_1.jpg' data-toggle='lightbox' data-gallery='gallery' class='col-md-4'>"
                    html += "<img src='./res/neptune_1.jpg' class='img-fluid rounded'>"
                html += "</a>"
                html +=	"<a href='./res/pluto_1.jpg' data-toggle='lightbox' data-gallery='gallery' class='col-md-4'>"
                    html +=	"<img src='./res/pluto_1.jpg' class='img-fluid rounded'>"
                html +=	"</a>"
            html +=	"</div>"
        html +=	"</div>"
    html +=	"</div>"
    
    document.getElementsByTagName("main")[0].insertAdjacentHTML("afterbegin", html);
}

function onRandom(){
    cleanMain();

    var html = "";

    html += "<iframe src='https://www.youtube.com/embed/CfV_ZMh5eRA' frameborder='0' allow='accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture' allowfullscreen></iframe>"
    
    document.getElementsByTagName("main")[0].insertAdjacentHTML("afterbegin", html);
}

function cleanMain(){
    let ele = document.getElementsByTagName("main")[0];
    while (ele.firstChild) {
        ele.removeChild(ele.firstChild);
    }
}