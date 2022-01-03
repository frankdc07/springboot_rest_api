
INSERT INTO regiones (nombre) VALUES ('Sudamérica');
INSERT INTO regiones (nombre) VALUES ('Centroamérica');
INSERT INTO regiones (nombre) VALUES ('Norteamérica');
INSERT INTO regiones (nombre) VALUES ('Europa');
INSERT INTO regiones (nombre) VALUES ('Asia');
INSERT INTO regiones (nombre) VALUES ('Africa');	
INSERT INTO regiones (nombre) VALUES ('Oceanía');
INSERT INTO regiones (nombre) VALUES ('Antartida');

INSERT INTO clientes (nombre, apellido, email, create_at, fk_region_id) VALUES ('Frank', 'Ramirez', 'frank.ramirez@test.com', '2021-01-01', 3);
INSERT INTO clientes (nombre, apellido, email, create_at, fk_region_id) VALUES ('Elkin', 'Rubio', 'elkin.rubio@test.com', '2021-01-02', 6);
INSERT INTO clientes (nombre, apellido, email, create_at, fk_region_id) VALUES ('Fabio', 'Gonzalez', 'fabio.gonzalez@test.com', '2021-01-03', 7);
INSERT INTO clientes (nombre, apellido, email, create_at, fk_region_id) VALUES ('Maria', 'Rodriguez', 'maria.rodriguez@test.com', '2021-01-04', 7);
INSERT INTO clientes (nombre, apellido, email, create_at, fk_region_id) VALUES ('Luisa', 'Chaparro', 'luisa.chaparro@test.com', '2021-01-05', 4);
INSERT INTO clientes (nombre, apellido, email, create_at, fk_region_id) VALUES ('Jane', 'Romero', 'jane.romero@test.com', '2021-01-06', 3);
INSERT INTO clientes (nombre, apellido, email, create_at, fk_region_id) VALUES ('Alberto', 'Lozano', 'alberto.lozano@test.com', '2021-01-07', 6);
INSERT INTO clientes (nombre, apellido, email, create_at, fk_region_id) VALUES ('Carlos', 'Ruiz', 'carlos.ruiz@test.com', '2021-01-08', 1);
INSERT INTO clientes (nombre, apellido, email, create_at, fk_region_id) VALUES ('Julio', 'Camelo', 'julio.camelo@test.com', '2021-01-09', 5);
INSERT INTO clientes (nombre, apellido, email, create_at, fk_region_id) VALUES ('Juan', 'Fernandez', 'juan.fernandez@test.com', '2021-01-10', 2);
INSERT INTO clientes (nombre, apellido, email, create_at, fk_region_id) VALUES ('Andres', 'Beltran', 'andres.beltran@test.com', '2021-01-11', 4);
INSERT INTO clientes (nombre, apellido, email, create_at, fk_region_id) VALUES ('Felipe', 'Suarez', 'felipe.suarez@test.com', '2021-01-12', 5);
INSERT INTO clientes (nombre, apellido, email, create_at, fk_region_id) VALUES ('Milena', 'Lopez', 'milena.lopez@test.com', '2021-01-13', 4);
INSERT INTO clientes (nombre, apellido, email, create_at, fk_region_id) VALUES ('Juana', 'Linares', 'juana.linares@test.com', '2021-01-14', 5);
INSERT INTO clientes (nombre, apellido, email, create_at, fk_region_id) VALUES ('Sara', 'Carrillo', 'sara.carrillo@test.com', '2021-01-15', 5);
INSERT INTO clientes (nombre, apellido, email, create_at, fk_region_id) VALUES ('Andrea', 'Barrera', 'andrea.barrera@test.com', '2021-01-16', 3);
INSERT INTO clientes (nombre, apellido, email, create_at, fk_region_id) VALUES ('Johana', 'Botero', 'johana.botero@test.com', '2021-01-17', 3);
INSERT INTO clientes (nombre, apellido, email, create_at, fk_region_id) VALUES ('Francisco', 'Celis', 'francisco.celis@test.com', '2021-01-18', 1);
INSERT INTO clientes (nombre, apellido, email, create_at, fk_region_id) VALUES ('Leonardo', 'Pacheco', 'leonardo.pacheco@test.com', '2021-01-19', 1);
INSERT INTO clientes (nombre, apellido, email, create_at, fk_region_id) VALUES ('Nicolas', 'Perez', 'nicolas.perez@test.com', '2021-01-20', 6);

insert into usuarios (username, password, enabled, nombre, apellido, email) values ('andres', '$2a$10$pCTtnZ4CCpX3eobSn6fuYOK0vqytOzdWip7ZruygDNcSdHjM7tQR2', 1, 'Andres Jose', 'Guzman', 'andres@gmail.com');
insert into usuarios (username, password, enabled, nombre, apellido, email) values ('admin', '$2a$10$TEwl2VZEy7K1aFNUg5wpSOR/henbGbfMPLGrjKNwKubOq48lQQLQO', 1, 'Admin', 'Administrador', 'admin@gmail.com');

insert into roles (nombre) values ('ROLE_USER');
insert into roles (nombre) values ('ROLE_ADMIN');

insert into users_authorities (fk_usuario_id, fk_rol_id) values (1, 1);
insert into users_authorities (fk_usuario_id, fk_rol_id) values (2, 2);
insert into users_authorities (fk_usuario_id, fk_rol_id) values (2, 1);

insert into productos (nombre, precio, create_at) values ('Panasonic Pantalla LCD', 259990, NOW());
insert into productos (nombre, precio, create_at) values ('Sony camara digital DSC w-3200', 123490, NOW());
insert into productos (nombre, precio, create_at) values ('Apple iPod Shuffle', 1499990, NOW());
insert into productos (nombre, precio, create_at) values ('Sony Notebook Z110', 37990, NOW());
insert into productos (nombre, precio, create_at) values ('Hewlett Packard Multifuncional F2280', 69990,NOW());
insert into productos (nombre, precio, create_at) values ('Bianchi Bicicleta Aro 26', 69990, NOW());
insert into productos (nombre, precio, create_at) values ('Mica Comoda 5 Cajones', 299990, NOW());

insert into facturas (descripcion, observacion, fk_cliente_id, create_at) values ('Factura equipos de oficina', null, 1, NOW());
insert into facturas_items (cantidad, fk_factura_id, fk_producto_id) values (1, 1, 1);
insert into facturas_items (cantidad, fk_factura_id, fk_producto_id) values (2, 1, 4);
insert into facturas_items (cantidad, fk_factura_id, fk_producto_id) values (1, 1, 5);
insert into facturas_items (cantidad, fk_factura_id, fk_producto_id) values (1, 1, 7);

insert into facturas (descripcion, observacion, fk_cliente_id, create_at) values ('Factura Bicicleta', 'Alguna nota importante!', 1, NOW());
insert into facturas_items (cantidad, fk_factura_id, fk_producto_id) values (3, 2, 6);










