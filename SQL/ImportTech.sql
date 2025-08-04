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