package com.practica01.service;

import com.practica01.domain.Arbol;
import java.util.List;

public interface ArbolService {
//Se define la firma del metodo que recupera la lista de objetos tipo categoria de la tabla Categoria
    //que son los registros de la tabla categoria

    public List<Arbol> getArboles(boolean activos);//FIRMAS DEL METODO CATEGORIA

    //SE DEFINE LA FIRMA DEL METODO PARA RECUPERAR UN REGISTRO DE LA TABLA CATEGORIA RECUPERANDO EL REGISTRO QUE TIENE EL ID CATEGORIA
    //SI NO LO ENCUENTRA RETORNA NULL
    public Arbol getArboles(Arbol arbol);

    //SE DEFINE LA FIRMA DEL METODO PARA CREAR O ACTUALIZAR UN REGISTRO DE LA TABLA CATEGORIA
    //SI EL ID CATEGORIA NO TIENE VALOR, SE CREA EL REGISTRO
    //SI EL ID CATEGORIA TIENE VALOR, ENTONCES MODIFICA ESE REGISTRO
    public void save(Arbol arbol);

    //SE DEFINE LA FIRMA DEL METODO PARA ELIMINAR UN REGISTRO DE LA TABLA CATEGORIA
    //CONSIDERANDO IDCATEGORIA 
    public void delete(Arbol arbol);
}
