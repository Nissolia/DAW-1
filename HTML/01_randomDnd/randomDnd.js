const razas = ["Humano", "Elfo", "Enano", "Mediano", "Dragonborn", "Gnomo", "Medusa", "Tiefling", "Orco"];
        const clases = ["Bárbaro", "Bardo", "Clérigo", "Druida", "Hechicero", "Mago", "Monje", "Paladín", "Pícaro", "Explorador", "Guerrero"];
        const trasfondos = ["Acolito", "Charlatán", "Criminal", "Erudito", "Héroe de guerra", "Noble", "Saber popular", "Sacerdote", "Vagabundo"];
        const profesiones = ["Alquimista", "Cazador", "Forjador", "Granjero", "Mercenario", "Pescador", "Sastre", "Tavernero", "Médico", "Minero"];
        const alineamientos = ["Legal Bueno", "Neutral Bueno", "Caótico Bueno", "Legal Neutral", "Neutral", "Caótico Neutral", "Legal Malvado", "Neutral Malvado", "Caótico Malvado"];

        function randomNumber(min, max) {
            return Math.floor(Math.random() * (max - min + 1)) + min;
        }

        function generarPersonaje() {
            const razaIndex = randomNumber(0, razas.length - 1);
            const claseIndex = randomNumber(0, clases.length - 1);
            const trasfondoIndex = randomNumber(0, trasfondos.length - 1);
            const profesionIndex = randomNumber(0, profesiones.length - 1);
            const alineamientoIndex = randomNumber(0, alineamientos.length - 1);

            const output = document.getElementById("output");
            output.innerHTML = `
                <h3>${razas[razaIndex]}</h3>
                <h3>${clases[claseIndex]}</h3>
                <h3>${trasfondos[trasfondoIndex]}</h3>
                <h3>${profesiones[profesionIndex]}</h3>
                <h3>${alineamientos[alineamientoIndex]}</h3>
            `;
        }