package pertemuan1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maharani Diradinova
 */
public class mahasiswa {
    String nama,nobp,kelas,prodi,jurusan;
    
    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa ();
        mhs.nama="rani";
        mhs.nobp="2101092052";
        mhs.kelas="B";
        mhs.prodi="Manajemen Informatika";
        mhs.jurusan="Teknologi Informasi";
        
            System.out.println("Nama :" +mhs.nama+ "\n"
                    +"No BP : "+mhs.nobp+"\n"
                    + "Jurusan : "+mhs.jurusan+"\n"
                    + "Prodi : "+mhs.prodi+"\n"
                    + "Kelas :"+mhs.kelas);
            
        System.out.println("");
        
        mahasiswa mhs2 = new mahasiswa ();
        mhs2.nama="gani";
        mhs2.nobp="2101092021";
        mhs2.kelas="A";
        mhs2.prodi="Manajemen Informatika";
        mhs2.jurusan="Teknologi Informasi";
        
            System.out.println("Nama :" +mhs2.nama+ "\n"
                    +"No BP : "+mhs2.nobp+"\n"
                    + "Jurusan : "+mhs2.jurusan+"\n"
                    + "Prodi : "+mhs2.prodi+"\n"
                    + "Kelas :"+mhs2.kelas);
         
}
}
