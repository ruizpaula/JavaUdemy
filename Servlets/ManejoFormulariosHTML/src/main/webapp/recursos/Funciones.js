function validarForma(forma){ 
    var usuario = forma.usuario; //recupera el elemento usuario 
    if(usuario.value == "" || usuario.value == "Escribir usuario"){ // si contiene el valor vacio o si es el igual al texto Escribir usuario
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();//foco sobre el elemento usuario
        usuario.select();// lo selecciona para que el usuario sepa que es lo que debe modificar
        return false; // 
    }
    
    // si es verdadero se hara el envio al action que se indico  servlet
    //pero si es falso no se hara el envio de este formulario le debera indicar el campo que debe corregir
    
    
    var password =forma.password;
    if(password.value == "" || password.value.length < 3 ){ // el valor del largo si es menor que 3
        alert("Debe proporcionar un password al menos de 3 caracteres");
        password.focus();
        password.select();
        return false; // no se enviara los fatos al action 
    }
    
    var tecnologias = forma.tecnologias;
    // 3 elementos de typo checkbox
    var checkSeleccionado = false;
    for(var i = 0; i < tecnologias.length; i++){//recorrer una colección y devolver un valor al terminar
        if(tecnologia[i].checked){ //si se ha seleccionado alguno de esos elementos
            checkSeleccionado = true;
        }
    }
    if (!checkSeleccionado) {
        alert ("Debe seleccionar una tecnologia")
        return false;
    }
    
    var genero = forma.genero;
    var radioDeleccionado = false; // si el usuario ha seleccionado una opcion
    for(var i = 0; i < genero.length; i++){
        if(generos[i].checked){ //ierar los elemento para despues verificar si se ha selecionado uno
            radioDeleccionado = true; // se ha seleccionado
        }
    }
    if(!radioDeleccionado){
        alert("Debe seleccionar un genero")
        return false;
    }
    
    
    
    
    
    var ocupacion = forma.ocupacion;
    if(ocupacion.value ==""){
        alert("Debe seleccionar una ocupacion");
        return false;
    }
    
    
    //Formulario es valido
    alert("Formulario valido, enviado datos al servidor ");
    return true;

}



