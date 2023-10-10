//LOGIN Y REGISTER
const loginsec=document.querySelector('.entrar')
const loginlink=document.querySelector('.login-link')
const registerlink=document.querySelector('.register-link')
registerlink.addEventListener('click',()=>{
    loginsec.classList.add('active')
})
loginlink.addEventListener('click',()=>{
    loginsec.classList.remove('active')
})


//MENSAJE
	setTimeout(function() {
	    document.getElementById("mensaje").style.display = "none"; // Oculta el mensaje después de 10 segundos
	  }, 5000);
 
//LOADER
function showLoading() {
    document.getElementById("loadingOverlay").style.display = "block";
    setTimeout(function() {
      window.location.href = "Beneficios.html";
    }, 1000); // Cambia el valor a la cantidad de tiempo que desees que dure la animación de carga (en milisegundos)
  }

 