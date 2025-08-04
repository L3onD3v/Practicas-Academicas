CREATE DATABASE importec_db;

USE importec_db;

CREATE TABLE Clientes (
    nip VARCHAR(15) PRIMARY KEY,
    nombre VARCHAR(100),
    direccion VARCHAR(200),
    fecha_creacion DATETIME DEFAULT CURRENT_TIMESTAMP,
    fecha_actualizacion DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE Proveedores (
    nip VARCHAR(15) PRIMARY KEY,
    nombre VARCHAR(100),
    direccion VARCHAR(200),
    telefono VARCHAR(20),
    pagina_web VARCHAR(100),
    fecha_creacion DATETIME DEFAULT CURRENT_TIMESTAMP,
    fecha_actualizacion DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE TelefonosCliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nip_cliente VARCHAR(15),
    telefono VARCHAR(20),
    fecha_creacion DATETIME DEFAULT CURRENT_TIMESTAMP,
    fecha_actualizacion DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (nip_cliente) REFERENCES Clientes (nip)
);

CREATE TABLE Categorias (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    descripcion TEXT,
    fecha_creacion DATETIME DEFAULT CURRENT_TIMESTAMP,
    fecha_actualizacion DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE Productos (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    precio_actual DECIMAL(10, 2),
    stock INT,
    id_categoria INT,
    fecha_creacion DATETIME DEFAULT CURRENT_TIMESTAMP,
    fecha_actualizacion DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (id_categoria) REFERENCES Categorias (id_categoria)
);

CREATE TABLE ProveedorProducto (
    nip_proveedor VARCHAR(15),
    id_producto INT,
    fecha_creacion DATETIME DEFAULT CURRENT_TIMESTAMP,
    fecha_actualizacion DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (nip_proveedor, id_producto),
    FOREIGN KEY (nip_proveedor) REFERENCES Proveedores (nip),
    FOREIGN KEY (id_producto) REFERENCES Productos (id_producto)
);

CREATE TABLE Ventas (
    num_factura INT AUTO_INCREMENT PRIMARY KEY,
    fecha_venta DATE,
    nip_cliente VARCHAR(15),
    descuento DECIMAL(5, 2),
    monto_final DECIMAL(10, 2),
    fecha_creacion DATETIME DEFAULT CURRENT_TIMESTAMP,
    fecha_actualizacion DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (nip_cliente) REFERENCES Clientes (nip)
);

CREATE TABLE DetalleVenta (
    id INT AUTO_INCREMENT PRIMARY KEY,
    num_factura INT,
    id_producto INT,
    precio_venta DECIMAL(10, 2),
    cantidad INT,
    total_producto DECIMAL(10, 2),
    fecha_creacion DATETIME DEFAULT CURRENT_TIMESTAMP,
    fecha_actualizacion DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (num_factura) REFERENCES Ventas (num_factura),
    FOREIGN KEY (id_producto) REFERENCES Productos (id_producto)
);

INSERT INTO
    Proveedores (
        nip,
        nombre,
        direccion,
        telefono,
        pagina_web
    )
VALUES (
        '900123456',
        'Distribuciones TEC',
        'Calle 45 #10-20, Bogotá',
        '6013456789',
        'http://dtec.com'
    ),
    (
        '900789012',
        'Insumos Alpha',
        'Av. 30 #15-10, Cali',
        '6025678910',
        'http://alpha.com'
    ),
    (
        '900456789',
        'TecnoPro',
        'Cra. 20 #11-50, Medellín',
        '6041234567',
        'http://tecnopro.co'
    );

INSERT INTO
    Clientes (nip, nombre, direccion)
VALUES (
        '1020304050',
        'Juan Pérez',
        'Carrera 12 #8-34, Medellín'
    ),
    (
        '1122334455',
        'Luisa Gómez',
        'Calle 60 #14-22, Bogotá'
    ),
    (
        '1234567890',
        'Carlos Ruiz',
        'Av. Las Palmas #9-10, Cali'
    );

INSERT INTO
    TelefonosCliente (nip_cliente, telefono)
VALUES ('1020304050', '3014567890'),
    ('1020304050', '3001234567'),
    ('1122334455', '3029876543');

INSERT INTO
    Categorias (nombre, descripcion)
VALUES (
        'Periféricos',
        'Dispositivos como mouse, teclados e impresoras'
    ),
    (
        'Almacenamiento',
        'Discos duros, SSDs y memorias USB'
    ),
    (
        'Redes',
        'Equipos de conexión y cableado de redes'
    );

INSERT INTO
    Productos (
        nombre,
        precio_actual,
        stock,
        id_categoria
    )
VALUES (
        'Impresora HP 2135',
        250000,
        20,
        1
    ),
    (
        'Teclado Logitech K120',
        55000,
        35,
        1
    ),
    (
        'Disco Duro Seagate 1TB',
        320000,
        15,
        2
    );

INSERT INTO
    ProveedorProducto (nip_proveedor, id_producto)
VALUES ('900123456', 1),
    ('900789012', 2),
    ('900456789', 3);

INSERT INTO
    Ventas (
        fecha_venta,
        nip_cliente,
        descuento,
        monto_final
    )
VALUES (
        '2025-08-04',
        '1020304050',
        0.00,
        250000
    ),
    (
        '2025-08-04',
        '1122334455',
        100,
        310000
    ),
    (
        '2025-08-04',
        '1234567890',
        0.00,
        55000
    );

INSERT INTO
    DetalleVenta (
        num_factura,
        id_producto,
        precio_venta,
        cantidad,
        total_producto
    )
VALUES (1, 1, 250000, 1, 250000),
    (2, 3, 320000, 1, 320000),
    (3, 2, 55000, 1, 55000);

SELECT num_factura, nip_cliente FROM Ventas;

INSERT INTO
    Ventas (
        num_factura,
        fecha_venta,
        nip_cliente,
        descuento,
        monto_final
    )
VALUES (
        1,
        '2025-08-04',
        '1020304050',
        0.00,
        250000
    ),
    (
        2,
        '2025-08-04',
        '1122334455',
        100.00,
        310000
    ),
    (
        3,
        '2025-08-04',
        '1234567890',
        0.00,
        55000
    );