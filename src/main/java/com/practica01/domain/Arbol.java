package com.practica01.domain;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity  
@Table(name="arbol") /*Va a mapear registros de la tabla Categoria*/

public class Arbol implements Serializable{
    private static final long serialVersionUID = 1L;/*Para comunicarse con las constantes de la base de datos */
    
    @Id /*es el atributo que va a autoincrementarse*/
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*Van a ser identicos a los generados por la base de datos*/
    @Column(name="id_arbol")
    
    private Long idArbol;
    
    private String tipo_arbol;
    private String tipo_flor;
    private String dureza_madera;
    private String rutaImagen;
    private boolean activo;   
   
}
