var id = -1;

function alertMe() {
    alert("script loaded");
}

function alertMe(id) {
    alert(id);
}

function getCatalog() {
    var option = document.getElementById("options");
    var value = Number(option.options[option.selectedIndex].value) + 1;

    var htmlStr = "<h3><font color='#f0ffff' size='10px'>Catalog " + value + "</font></h3>";

    var catalogNum = document.getElementById("catalogNum");
    catalogNum.innerHTML = htmlStr;

    var jsonURL = "http://127.0.0.1:9412/getCatalog/" + value;
    $.getJSON(jsonURL, useData);
}

function useData(data) {
    for(var i=0; i < data.videos.length; i++) {
        var videoPath = data.videos[i];

        var table = document.getElementById("tableofvideos");

        var tr = document.createElement("tr");

        var td = document.createElement("td");

        var video = document.createElement("video");
        video.setAttribute("width", 320);
        video.setAttribute("height", 240);
        video.setAttribute("controls", "");

        var source = document.createElement("source");
        source.setAttribute("src", videoPath);
        source.setAttribute("type", "video/mp4");
        source.innerHTML = "Your browser does not support the video tag.";

        video.appendChild(source);
        td.appendChild(video);
        tr.appendChild(td);
        table.appendChild(tr);
    }
}
