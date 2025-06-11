/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author AZ
 */
public class DataDiri {
    private String nama;
    private String npm;
    private String kelas;
    
    public DataDiri(String nama, String npm, String kelas){
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }
    public void tampilkanData(){
        System.out.println("Data Diri : ");
        System.out.println("Nama :" +nama);
        System.out.println("NPM :" +npm);
        System.out.println("Kelas : +" +kelas);
        }
    }
