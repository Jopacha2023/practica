/*Se crea la base de datos */
drop schema if exists practica;
drop user if exists usuario_practica;
CREATE SCHEMA practica ;


create user 'usuario_practica'@'%' identified by 'la_Clave';

/*Se asignan los prvilegios sobr ela base de datos TechShop al usuario creado */
grant all privileges on practica.* to 'usuario_practica'@'%';
flush privileges;

/* la tabla de categoria contiene categorias de productos*/
create table practica.arbol (
  id_arbol INT NOT NULL AUTO_INCREMENT,
  tipo_arbol VARCHAR(30) NOT NULL,
  tipo_flor VARCHAR(30) NOT NULL,
  dureza_madera VARCHAR(30) NOT NULL,
  ruta_imagen varchar(1024),
  activo bool,
  PRIMARY KEY (id_arbol))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;
INSERT INTO practica.arbol (id_arbol, tipo_arbol,tipo_flor,dureza_madera, ruta_imagen, activo) VALUES 
(1,'Pino','Cipres','dureza fuerte', 'https://static-uat.cambiocolombia.com/s3fs-public/styles/style_aspect_4_3_large/public/2023-08/hermosos-pinos-montanas.jpg.webp?itok=4F41yDT_',true),
(2,'Mimosa','Guaria','dureza media', 'https://www.viverosshangai.es/image/cache/catalog/blog/Cuidados-de-la-Acacia-mimosa-o-Acacia-Dealbata-1250x750.jpg',true),
(3,'Acacia','Petalo','dureza baja', 'https://cdn.britannica.com/62/156362-050-4E8FE282/Acacia-tree-savanna-Zimbabwe.jpg',true);
