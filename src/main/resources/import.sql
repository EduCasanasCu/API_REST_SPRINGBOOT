-- Inserts para la tabla "fabricante"
INSERT INTO fabricante(id, nombre_fabricante) VALUES(1, 'Asus');
INSERT INTO fabricante(id, nombre_fabricante) VALUES(2, 'Lenovo');
INSERT INTO fabricante(id, nombre_fabricante) VALUES(3, 'Hewlett-Packard');
INSERT INTO fabricante(id, nombre_fabricante) VALUES(4, 'Samsung');
INSERT INTO fabricante(id, nombre_fabricante) VALUES(5, 'Seagate');
INSERT INTO fabricante(id, nombre_fabricante) VALUES(6, 'Crucial');
INSERT INTO fabricante(id, nombre_fabricante) VALUES(7, 'Gigabyte');
INSERT INTO fabricante(id, nombre_fabricante) VALUES(8, 'Huawei');
INSERT INTO fabricante(id, nombre_fabricante) VALUES(9, 'Xiaomi');

-- Inserts para la tabla "producto"
INSERT INTO producto(id, nombre_producto, precio_producto, id_fabricante)VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5);

INSERT INTO producto(id, nombre_producto, precio_producto, id_fabricante)VALUES(2, 'Memoria RAM DDR4 8GB', 120, 6);

INSERT INTO producto(id, nombre_producto, precio_producto, id_fabricante)VALUES(3, 'Disco SSD 1 TB', 150.99, 4);

INSERT INTO producto(id, nombre_producto, precio_producto, id_fabricante)VALUES(4, 'Geforce GTX 1050Ti', 185, 7);

INSERT INTO producto(id, nombre_producto, precio_producto, id_fabricante)VALUES(5, 'Geforce GTX 1080 Xtreme', 755, 6);

INSERT INTO producto(id, nombre_producto, precio_producto, id_fabricante)VALUES(6, 'Monitor 24 LED Full HD', 202, 1);

INSERT INTO producto(id, nombre_producto, precio_producto, id_fabricante)VALUES(7, 'Monitor 27 LED Full HD', 245.99, 1);

INSERT INTO producto(id, nombre_producto, precio_producto, id_fabricante)VALUES(8, 'Portátil Yoga 520', 559, 2);

INSERT INTO producto(id, nombre_producto, precio_producto, id_fabricante)VALUES(9, 'Portátil Ideapad 320', 444, 2);

INSERT INTO producto(id, nombre_producto, precio_producto, id_fabricante)VALUES(10, 'Impresora HP Deskjet 3720', 59.99, 3);

INSERT INTO producto(id, nombre_producto, precio_producto, id_fabricante)VALUES(11, 'Impresora HP Laserjet Pro M26nw', 180, 3);