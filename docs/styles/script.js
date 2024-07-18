document.addEventListener("DOMContentLoaded", (event) => {
    document.querySelectorAll('pre code').forEach((block) => {
        hljs.highlightBlock(block);
        addLineNumbers(block);
    });
});

function addLineNumbers(code) {
    const lines = code.textContent.split('\n').length;
    const lineNumbers = document.createElement('div');
    lineNumbers.className = 'line-numbers';

    for (let i = 1; i <= lines; i++) {
        const lineNumber = document.createElement('div');
        lineNumber.textContent = i;
        lineNumbers.appendChild(lineNumber);
    }

    code.parentNode.insertBefore(lineNumbers, code);
}

function copyToClipboard() {
    const code = document.querySelector('pre code').textContent;
    navigator.clipboard.writeText(code).then(() => {
        alert('Código copiado al portapapeles');
    }).catch(err => {
        alert('Error al copiar el código: ', err);
    });
}