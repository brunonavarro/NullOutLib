document.addEventListener("DOMContentLoaded", (event) => {
    document.querySelectorAll('pre code').forEach((block) => {
        hljs.highlightBlock(block);
        addLineNumbers(block);
    });
});

function copyToClipboard() {
    const code = document.querySelector('pre code').innerText;
    navigator.clipboard.writeText(code).then(() => {
        alert('Código copiado al portapapeles');
    }).catch(err => {
        alert('Error al copiar el código: ', err);
    });
}

function addLineNumbers(code) {
    const lines = code.innerHTML.split('\n');
    code.innerHTML = lines.map((line, index) => {
        return `<span class="line">${line}</span>`;
    }).join('\n');
}

