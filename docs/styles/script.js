function copyToClipboard() {
    const code = document.querySelector('pre code').innerText;
    navigator.clipboard.writeText(code).then(() => {
        alert('Código copiado al portapapeles');
    }).catch(err => {
        alert('Error al copiar el código: ', err);
    });
}

