document.addEventListener("DOMContentLoaded", (event) => {
    document.querySelectorAll('pre code').forEach((block) => {
        hljs.highlightBlock(block);
        addLineNumbers(block);
    });
});

let listElements = document.querySelectorAll('.list_item--click');
let menu = document.querySelector('.list_items_show');
listElements.forEach((element) => {
    element.addEventListener('click', () => {
        element.classList.toggle('is-active');

        let height = 0;
        if (menu.clientHeight == "0") {
            height = menu.scrollHeight;
        }
        menu.style.height = `${height}px`;
    })
});

function copyToClipboard(event) {
    const elementParent = event.target.parentNode;
    const code = elementParent.querySelector('code').innerText;
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
