document.addEventListener("DOMContentLoaded", function() {
    const codeElement = document.getElementById('code');
    highlightCode(codeElement);
});

function highlightCode(element) {
    const code = element.textContent;
    const highlightedCode = code
        .replace(/(fun|val)/g, '<span class="token keyword">$1</span>')
        .replace(/(\w+)(?=\()/g, '<span class="token function">$1</span>')
        .replace(/"(.*?)"/g, '<span class="token string">"$1"</span>')
        .replace(/\/\/(.*?)(\n|$)/g, '<span class="token comment">//$1</span>$2')
        .replace(/(\+|\-|\/|\*|=)/g, '<span class="token operator">$1</span>')
        .replace(/([{}()\[\].,;])/g, '<span class="token punctuation">$1</span>');

    element.innerHTML = highlightedCode;
}
