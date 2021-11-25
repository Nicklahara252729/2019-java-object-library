/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intanperpustakaan;

/**
 *
 * @author nicolahara
 */
public class IntanPerpustakaan {
        String nama_perpus, alamat_perpus; 
        IntanPerpustakaan (String n, String u) { 
            nama_perpus=n; 
            alamat_perpus=u; 
        }
        
        public void setJudulBuku (String judulbuku) { 
        }
        
        public void setPengarang (String pengarang) { 
        }
        
        public void setTanggalPinjam (String tanggalpinjam) { 
        }
        
        public void setTanggalKembali (String tanggalkembali) { 
        }
        
        public void setNamaPeminjam (String namapeminjam) { 
        }
        
        public void printPeminjaman (String judulbuku, String pengarang, String tanggalpinjam, 
            String tanggalkembali, String namapeminjam) { 
            System.out.println("Judul Buku : " +judulbuku); 
            System. out.println("Pengarang : "+pengarang); 
            System.out.println("Tanggal Pinjam : "+tanggalpinjam); 
            System. out.println("Tanggal Kembali : " +tanggalkembali); 
            System. out.println("Nama Peminjam : " +namapeminjam); 
            } 

        
        void tampilPerpustakaan() { 
            System.out.println("Nama Perpustakan : "+nama_perpus); 
            System. out.println("Alamat Perpustakaan : "+alamat_perpus); 
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int t=1; t<=5; t++){
            for(int b=1; b<=t; b++){
                System.out.print("  ");
            }
            for(int o=t; o<=5; o++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}
