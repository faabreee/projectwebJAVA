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

