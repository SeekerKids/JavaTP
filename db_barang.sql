CREATE TABLE barang(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nama_barang VARCHAR(255) NOT NULL,
    kategori VARCHAR(100) NOT NULL,
    harga DECIMAL(10, 2) NOT NULL,
    stok INT NOT NULL
);

INSERT INTO barang (nama_barang, kategori, harga, stok)
VALUES
    ('Laptop Asus ROG', 'Elektronik', 15000000.00, 10),
    ('Meja Belajar', 'Furniture', 500000.00, 25),
    ('Buku Tulis', 'Alat Tulis', 5000.00, 100),
    ('Smartphone Samsung', 'Elektronik', 8000000.00, 15),
    ('Kursi Kantor', 'Furniture', 750000.00, 20),
    ('Printer Canon', 'Elektronik', 2000000.00, 5),
    ('Pensil', 'Alat Tulis', 2000.00, 200),
    ('Headphone Sony', 'Elektronik', 1200000.00, 12),
    ('Rak Buku', 'Furniture', 300000.00, 30),
    ('Penghapus', 'Alat Tulis', 1000.00, 150);
