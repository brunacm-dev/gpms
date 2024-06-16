const tipoEmbarqueSelect = document.getElementById('tipoEmbarque')
const dataViagemContainer = document.getElementById('dataViagemContainer')
const horaViagemContainer = document.getElementById('horaViagemContainer')

tipoEmbarqueSelect.addEventListener('change', function () {
  if (this.value === 'agendado') {
    dataViagemContainer.classList.remove('d-none')
    horaViagemContainer.classList.remove('d-none')
  } else {
    dataViagemContainer.classList.add('d-none')
    horaViagemContainer.classList.add('d-none')
  }
})

fetch('https://worldtimeapi.org/api/ip')
  .then(response => response.json())
  .then(data => {
    const dateTime = new Date(data.datetime);
    const hora = ('0' + dateTime.getHours()).slice(-2); 
    const minutos = ('0' + dateTime.getMinutes()).slice(-2); 
    const horaFormatada = `${hora}:${minutos}`;

    document.getElementById('horaViagem').value = horaFormatada;

    const ano = dateTime.getFullYear();
    const mes = ('0' + (dateTime.getMonth() + 1)).slice(-2); 
    const dia = ('0' + dateTime.getDate()).slice(-2); 
    const dataFormatada = `${ano}-${mes}-${dia}`;

    document.getElementById('dataViagem').value = dataFormatada;
  })
  .catch(error => {
    console.error('Ocorreu um erro:', error);
  });


