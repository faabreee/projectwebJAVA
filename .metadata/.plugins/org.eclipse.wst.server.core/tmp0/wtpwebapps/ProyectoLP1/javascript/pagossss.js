/**
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

// SELECCION DE PROVINCIA
// SELECCION DE PROVINCIA
function cambiarOpciones() {
  var select1 = document.getElementById('provincia');
  var select2 = document.getElementById('distrito');

  // Obtener la opción seleccionada en el primer select
  var opcionSeleccionada = select1.value;

  // Limpiar las opciones actuales del segundo select
  select2.innerHTML = '';

  // Generar las nuevas opciones según la selección
  var opciones = []; // Declarar la variable opciones antes del bloque condicional

  if (opcionSeleccionada === 'Lima') {
    opciones = ['Lima Cercado', 'Brena', 'Barranco', 'Jesus Maria', 'Miraflores', 'San Borja', 'San Isidro', 'San Miguel'];
  } else if (opcionSeleccionada === 'Callao') {
    opciones = ['Callao', 'Ventanilla', 'Bellavista', 'La Perla', 'Mi Peru', 'Carmen de la Legua Reynoso', 'La Punta'];
  }

  // Agregar las nuevas opciones al segundo select
  opciones.forEach(function(opcion) {
    var nuevaOpcion = document.createElement('option');
    nuevaOpcion.text = opcion;
    nuevaOpcion.value = opcion; // Establecer el mismo valor que el texto de la opción
    select2.add(nuevaOpcion);
  });

  // Establecer la opción predeterminada en el segundo select
  var opcionPredeterminada = '';
  
  if (opcionSeleccionada === 'Lima') {
    opcionPredeterminada = 'Lima Cercado'; // Establecer el valor predeterminado para Lima
  } else if (opcionSeleccionada === 'Callao') {
    opcionPredeterminada = 'Callao'; // Establecer el valor predeterminado para Callao
  }

  // Buscar y seleccionar la opción predeterminada en el segundo select
  var opcionesSegundoSelect = select2.options;
  for (var i = 0; i < opcionesSegundoSelect.length; i++) {
    if (opcionesSegundoSelect[i].value === opcionPredeterminada) {
      select2.selectedIndex = i;
      break;
    }
  }
}

// Llamar a la función cambiarOpciones al cargar la página
window.addEventListener('load', cambiarOpciones);



	//CALCULAR EL IMPORTE TOTAL
        var divImportetotal = document.getElementById('divImportetotal');

        // Obtener los elementos necesarios
        var divImporteSub = document.getElementById('divImporteSub');
        var tarifaValue = document.getElementById('tarifaValue');
        var envioValue = document.getElementById('envioValue');

        // Obtener los valores numéricos
        var importeSub = parseFloat(divImporteSub.textContent);
        var tarifa = parseFloat(tarifaValue.getAttribute('value'));
        var envio = parseFloat(envioValue.getAttribute('value'));

        // Calcular el total
        var total = importeSub + tarifa + envio;

        // Mostrar el total en txtImportetotal
        divImportetotal.textContent = total.toFixed(2).toString(); // Mostrar el total en el contenido del campo <div> como string con 2 decimales

					var fechaActualInput = document
							.getElementById("fechaActual");
					var fechaActual = new Date().toISOString().split("T")[0];
					fechaActualInput.value = fechaActual;

					var divImportetotal = document
							.getElementById('divImportetotal');
					var txtImportetotal = document
							.getElementById("importeTotal");
					txtImportetotal.value = total.toFixed(2).toString(); // Mostrar el total en el atributo value del campo <div> como string con 2 decimales
			


//ELECCIONES NULL QUE FALTAN
    document.getElementById("btnHacerPedido").addEventListener("click", function(event) {
        // Obtener los valores de los campos
        var provincia = document.getElementById("provincia");
        var distrito = document.getElementById("distrito");
        var referencia = document.getElementById("txtReferencia");
        var metodoPago = document.querySelector('input[name="txtMetodo"]:checked');

        // Validar que los campos no sean nulos
        var isValid = true;
        if (!provincia.value) {
            provincia.classList.add("campo-invalido");
            isValid = false;
        } else {
            provincia.classList.remove("campo-invalido");
        }
        
        if (!distrito.value) {
            distrito.classList.add("campo-invalido");
            isValid = false;
        } else {
            distrito.classList.remove("campo-invalido");
        }
        
        if (!referencia.value) {
            referencia.classList.add("campo-invalido");
            isValid = false;
        } else {
            referencia.classList.remove("campo-invalido");
        }
        
        if (!metodoPago) {
            var metodoPagoElements = document.getElementsByName("txtMetodo");
            for (var i = 0; i < metodoPagoElements.length; i++) {
                metodoPagoElements[i].classList.add("campo-invalido-radio");
            }
            isValid = false;
        } else {
            var metodoPagoElements = document.getElementsByName("txtMetodo");
            for (var i = 0; i < metodoPagoElements.length; i++) {
                metodoPagoElements[i].classList.remove("campo-invalido-radio");
            }
        }

        // Evitar el envío del formulario si no es válido
        if (!isValid) {
            event.preventDefault(); // Evitar el envío del formulario
            alert("Por favor, complete todos los campos antes de realizar el pedido.");
        }
    });