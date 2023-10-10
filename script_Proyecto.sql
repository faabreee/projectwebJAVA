CREATE SCHEMA `minimarkett` ;
USE minimarket;
CREATE TABLE `minimarket`.`usuarios` (
  `codigo` INT NOT NULL,
  `correo` VARCHAR(50) NULL,
  `clave` VARCHAR(50) NULL,
  `nombre1` VARCHAR(30) NULL,
  `nombre2` VARCHAR(30) NULL,
  `apellido1` VARCHAR(30) NULL,
  `apellido2` VARCHAR(30) NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

ALTER TABLE `minimarket`.`usuarios` 
CHANGE COLUMN `codigo` `codigo` INT NOT NULL AUTO_INCREMENT ;

INSERT INTO usuarios (correo, clave, nombre1, nombre2, apellido1, apellido2) VALUES
  ('reyescocafagardo@gmail.com', '12345', 'Fabrizio', 'Edgardo', 'Reyes', 'Coca');
select*from minimarket.usuarios

use minimarket
CREATE TABLE `minimarket`.`productos` (
  `idproducto` INT NOT NULL,
  `nombrePro` VARCHAR(30) NULL,
  `descripcionPro` VARCHAR(100) NULL,
  `precioPro` DECIMAL(10,2) NULL,
  `imagenPro` LONGBLOB NULL,
  PRIMARY KEY (`idproducto`));
  
ALTER TABLE `minimarket`.`productos` 
CHANGE COLUMN `idproducto` `idproducto` INT NOT NULL AUTO_INCREMENT ;
ALTER TABLE `minimarket`.`productos` 
CHANGE COLUMN `imagenPro` `imagenPro` VARCHAR(200) NULL DEFAULT NULL ;
INSERT INTO productos (nombrePro, descripcionPro, precioPro, imagenPro) VALUES
    ('Manzanas', 'Manzanas rojas frescas importadas, 1 kg', 8.68, ('https://biotrendies.com/wp-content/uploads/2015/06/manzana.jpg')),
    ('Leche', 'Leche entera, 1 litro', 5.00, ('https://www.supermercadosantamaria.com/documents/10180/10504/37526_G.jpg')),
    ('Pan', 'Pan frances, 500 gramos', 3.20, ('https://wongfood.vtexassets.com/arquivos/ids/537057-800-auto?v=637853063460930000&width=800&height=auto&aspect=true')),
    ('Arroz', 'Arroz blanco, 5 kg', 24.90, ('https://wongfood.vtexassets.com/arquivos/ids/254547-800-auto?v=636765120201500000&width=800&height=auto&aspect=true')),
    ('Azúcar', 'Azúcar rubia, 1 kg', 5.90, ('https://plazavea.vteximg.com.br/arquivos/ids/561635-1000-1000/20184796.jpg?v=637427438523200000')),
    ('Sal', 'Sal de mesa, 1 kg', 1.80, ('https://wongfood.vteximg.com.br/arquivos/ids/225392-1000-1000/59478002-1.jpg?v=636632113620370000')),
    ('Aceite de oliva', 'Aceite de oliva extra virgen, 1 litro', 41.00, ('https://s.cornershopapp.com/product-images/858021.jpg?versionId=bRv1PlGm928tneK5tYc.YoUhvMo1t94v')),
    ('Huevos', 'Huevos frescos, docena', 16.90, ('https://vivanda.vtexassets.com/arquivos/ids/208130/20201069.jpg?v=637365080622730000')),
    ('Fideos', 'Fideos de trigo, 500 gramos', 3.90, ('https://www.fullabarrotes.com/wp-content/uploads/2020/03/fideos_don_vittorio_spaghetti_500g.jpg')),
    ('Café', 'Café molido, 180 gramos',35.40, ('https://plazavea.vteximg.com.br/arquivos/ids/16382178-1000-1000/20256619.jpg?v=637970165632070000')),
    ('Papas', 'Papas frescas, 1 kg', 2.60, ('https://www.slotfrans.nl/wp-content/uploads/2021/07/Potatoes.jpg')),
    ('Tomates', 'Tomates frescos 1 kg', 8.50, ('https://img.freepik.com/foto-gratis/tomates-frescos-rojos-grandes-sobre-fondo-blanco_114579-55590.jpg?w=2000')),
    ('Pollo', 'Pechugas de pollo, 1 kg', 15.50, ('https://santaisabel.vtexassets.com/arquivos/ids/168472/Pechuga-de-pollo-entera-granel.jpg?v=637503135891500000')),
    ('Queso', 'Queso cheddar, 200 gramos', 11.30, ('https://plazavea.vteximg.com.br/arquivos/ids/522306-1000-1000/20182475.jpg?v=637418522977970000')),
    ('Cereal', 'Cereal de maíz, 500 gramos', 13.90, ('https://wongfood.vtexassets.com/arquivos/ids/409734/542677-01-21447.jpg?v=637485780117000000')),
    ('Jabón', 'Jabón de baño, paquete de 540 gramos', 22.90, ('https://www.hogarysalud.com.pe/wp-content/uploads/2021/02/00195271-3.jpg')),
    ('Cepillo de dientes', 'Paquete de 3 unidades', 11.00, ('https://farmaciacatedral.com.py/upload/imagenes_productos/06033147_24273834_6000984F891F0_B.webp')),
    ('Papel higiénico', 'Papel higiénico, paquete de 24 rollos', 26.70, ('https://images.utilex.pe/057711/650x650/papel-higienico-doble-hoja-20m-paquete-x-4-rollos-CYJRSYP4CA754.jpeg')),
    ('Galletas', 'Galletas de chocolate, bandeja de 10 unidades', 13.90, ('https://plazavea.vteximg.com.br/arquivos/ids/740935-512-512/20205545.jpg')),
    ('Refresco', 'Bebida de naranja 1 litro', 4.50, ('https://plazavea.vteximg.com.br/arquivos/ids/2248145-512-512/20075685.jpg')); 
  
DELETE FROM minimarket.productos WHERE idproducto = '1';

SELECT imagenPro FROM productos WHERE idproducto = 1
select *from minimarket.productos

select*from minimarket.productos

CREATE TABLE `minimarket`.`detallepago` (
  `idPago` INT NOT NULL AUTO_INCREMENT,
  `idCliente` INT NULL,
  `nombre1Cliente` VARCHAR(30) NULL,
  `nombre2Cliente` VARCHAR(30) NULL,
  `apellido1Cliente` VARCHAR(30) NULL,
  `apellido2Cliente` VARCHAR(30) NULL,
  `provincia` VARCHAR(30) NULL,
  `distrito` VARCHAR(30) NULL,
  `referencia` VARCHAR(50) NULL,
  `metodoPago` VARCHAR(30) NULL,
  `importeSub` DOUBLE NULL,
  `importeTotal` DOUBLE NULL,
  PRIMARY KEY (`idPago`),
  INDEX `idCliente_idx` (`idCliente` ASC) VISIBLE,
  CONSTRAINT `idCliente`
    FOREIGN KEY (`idCliente`)
    REFERENCES `minimarket`.`usuarios` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
ALTER TABLE `minimarket`.`detallepago` 
ADD COLUMN `fecha` DATE NULL AFTER `metodoPago`;

use minimarket
select*from detallepago

select*from usuarios

DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizarUsuario`(
    IN p_codigo INT,
    IN p_nombre1 VARCHAR(50),
    IN p_nombre2 VARCHAR(50),
    IN p_apellido1 VARCHAR(50),
    IN p_apellido2 VARCHAR(50),
    IN p_correo VARCHAR(100),
    IN p_clave VARCHAR(100)
)
BEGIN
    UPDATE usuarios
    SET nombre1 = p_nombre1,
        nombre2 = p_nombre2,
        apellido1 = p_apellido1,
        apellido2 = p_apellido2,
        correo = p_correo,
        clave = p_clave
    WHERE codigo = p_codigo;
END//
DELIMITER ;

CALL actualizarUsuario()

SELECT detallepago.*
FROM detallepago
JOIN usuarios ON detallepago.idCliente = usuarios.codigo
WHERE usuarios.codigo = '1';

use minimarket
select*from minimarket.usuarios 
select*from minimarket.productos 
select*from minimarket.detallepago 





