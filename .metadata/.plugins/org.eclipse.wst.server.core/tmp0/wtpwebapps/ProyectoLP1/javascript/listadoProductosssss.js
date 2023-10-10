 //BOTON USER
var dropdownContent = document.querySelector('.dropdown-content');
var dropbtn = document.querySelector('.dropbtn');

dropbtn.addEventListener('click', function(event) {
  event.stopPropagation();
  dropdownContent.classList.toggle('show');
});

document.body.addEventListener('click', function() {
  dropdownContent.classList.remove('show');
});


//Buscar
const search = () => {
    const searchbox = document.getElementById("buscar-producto").value.toUpperCase();
    const storeitems = document.getElementById("productos")
    const product = document.getElementsByClassName("card")
    const pname = storeitems.getElementsByTagName("p")

    for (var i = 0; i < pname.length; i++) {
        let match = product[i].getElementsByTagName('p')[0];

        if (match) {
            let textvalue = match.textContent || match.innerHTML

            if (textvalue.toUpperCase().indexOf(searchbox) > -1) {
                product[i].style.display = "";
            } else {
                product[i].style.display = "none";
            }
        }
    }
}

function eliminarProducto(idProducto) {
    location.href = "CarritoServlet?tipo=eliminar&eliminarIdProducto=" + idProducto;
}



