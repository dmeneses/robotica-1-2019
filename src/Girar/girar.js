function girarDerecha(gradosAGirar) {
    const radioAuto = 6;
    const perimetroAuto = 2 * Math.PI * radioAuto;

    const cmAGirar = gradosAGirar * perimetroAuto / 360;
    console.log('cm a girar', cmAGirar)
    avanzarCmDerecha(cmAGirar);
}

function avanzarCmDerecha(cm) {
    const radioLlanta = 3;
    const perimetroLlanta = 2 * Math.PI * radioLlanta;

    const gradosAGirar = 360 * cm / perimetroLlanta;
    console.log('grados a girar en llanta', gradosAGirar);
}


girarDerecha(45);