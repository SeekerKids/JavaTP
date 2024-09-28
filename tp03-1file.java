public class TPMOD03 {

    // Kelas Prodi
    static class Prodi {
        private String nama;

        // Setter untuk nama prodi
        public void setNama(String nama) {
            this.nama = nama;
        }

        // Getter untuk nama prodi
        public String getNama() {
            return this.nama;
        }
    }

    // Kelas Mahasiswa
    static class Mahasiswa {
        private String nama;
        private Prodi prodi;

        // Setter untuk nama mahasiswa
        public void setNama(String nama) {
            this.nama = nama;
        }

        // Setter untuk prodi mahasiswa
        public void setProdi(Prodi prodi) {
            this.prodi = prodi;
        }

        // Getter untuk nama mahasiswa
        public String getNama() {
            return this.nama;
        }

        // Getter untuk nama prodi mahasiswa
        public String getProdi() {
            return this.prodi.getNama();
        }

        // Method untuk menampilkan data mahasiswa
        public void displayMahasiswa() {
            System.out.println("Nama Mahasiswa: " + this.getNama());
            System.out.println("Nama Prodi: " + this.getProdi());
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        // Membuat dua objek Prodi pr1 dan pr2
        Prodi pr1 = new Prodi();
        Prodi pr2 = new Prodi();

        // Mengisi atribut nama pada objek Prodi
        pr1.setNama("Informatika");
        pr2.setNama("Rekayasa Perangkat Lunak");

        // Membuat dua objek Mahasiswa mhs1 dan mhs2
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();

        // Mengisi atribut nama dan prodi pada objek Mahasiswa
        mhs1.setNama("Heritsam Yuniawan");
        mhs1.setProdi(pr1);

        mhs2.setNama("Nugroho Rahmanto");
        mhs2.setProdi(pr2);

        // Menampilkan data mahasiswa menggunakan method displayMahasiswa
        mhs1.displayMahasiswa();
        mhs2.displayMahasiswa();
    }

}
