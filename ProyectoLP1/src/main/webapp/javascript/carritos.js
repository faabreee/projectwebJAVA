/**
 * 


//SUMA TOTAL
// Obtener todos los elementos con la clase "registro"
var registros = document.getElementsByClassName("precioPro");

// Variable para almacenar la suma
var suma = 0;

// Recorrer los elementos y sumar sus valores
for (var i = 0; i < registros.length; i++) {
  var valor = parseFloat(registros[i].textContent);
  suma += valor;
}

// Formatear la suma con dos decimales
var sumaFormateada = suma.toFixed(2);

document.getElementById("total").textContent = sumaFormateada;

 * 
 */



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

//Eliminar el carrito
function eliminarProducto(productoId) {
    var url = "ServletCarrito?accion=eliminar&id=" + productoId;
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function() {
        if (xmlhttp.readyState === 4 && xmlhttp.status === 200) {
            // Actualizar la vista o realizar otras acciones necesarias
            // en caso de eliminación exitosa
        }
    };
    xmlhttp.open("GET", url, true);
    xmlhttp.send();
}

