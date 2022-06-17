/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Kentank-ID
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BelajarJava {

    public static void main(String[] args) {

        //Inisialisasi Objek dan Mendefinisikan Path Lokasi File
        File file = new File("E:\\a UDINUS\\disini.txt");

        //Membuat Statement Try-Resource-Statement
        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

            //Menulis data String
            bw.write("Nama Saya Wildan M Athoillah");

            //Membuat Baris Baru
            bw.newLine();

            bw.write("Admin WILDAN TECHNO ART");
            bw.newLine();
            bw.write("Cianjur Apps Developer");

        } catch (FileNotFoundException ex) {
            //Menampilkan pesan jika file tidak ditemukan
            System.out.println("File " + file.getName() + " Tidak Ditemukan");
        } catch (IOException ex) {
            //Menampilkan pesan jika terjadi error atau file tidak dapat dibaca
            System.out.println("File " + file.getName() + " Tidak Dapat DIbaca");
        }
    }
}
