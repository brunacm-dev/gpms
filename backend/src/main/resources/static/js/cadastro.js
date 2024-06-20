document.getElementById('motorista').addEventListener('change', function () {
    let dadosVeiculo = document.getElementById('dadosVeiculo');
    dadosVeiculo.classList.toggle('d-none');
    let camposVeiculo = dadosVeiculo.querySelectorAll('input');
    camposVeiculo.forEach(function (campo) {
        campo.required = !campo.required;
    });
});
