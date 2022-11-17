/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js12;

//Created by 21343032_Muhammad Rizky Sandyra

public class RodaEmpat extends Kendaraan{
    double NaikHargaKe = 8;// 1 kali
    void hargaAkhir(){
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah di mofikasi, harga mobil menjadi Rp. " + hargaDasar);
    }
}
