/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js12;

//Created by 21343032_Muhammad Rizky Sandyra

public class polymorphismDynamic {
    public static void main(String[] args) {
        Bank B;
        B = new BRI();
        System.out.println("Tingkat Suku Bunga BRI adalah: "+B.sukuBunga());
        B = new BNI();
        System.out.println("Tingkat Suku Bunga BNI adalah: "+B.sukuBunga());
        B = new Mandiri();
        System.out.println("Tingkat Suku Bunga Mandiri adalah: "+B.sukuBunga());
    }
}
