var Module = (function() {
    return {
        getNumeros: function(){
            var num = document.getElementById("numero").value;
            var url = '/juego?numero=' + num;
            fetch(url, {
                method: 'GET'
            })
                .then(response => response.text())
                .then(res => document.getElementById("Resultado").innerHTML = res)
        }
    }
})();