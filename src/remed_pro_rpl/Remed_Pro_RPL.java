/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remed_pro_rpl;
import java.util.Scanner;
public class Remed_Pro_RPL {
static void nama(){
    System.out.println("Laili Nur Rachmawati");}
static void kelas(){
    System.out.println("X RPL 3/23");}
static void usia(){
    System.out.println("Usia: "+(2020-2004));
}
    public static void main(String[] args) {
 Scanner sken=new
        Scanner(System.in);
 int tugas1,tugas2,tugas3,nilaiMAT,rerataMAT;
 boolean keluar=true;
 String ulang;
 
 nama();
 kelas();
 usia();
 
        System.out.println("\n");
        System.out.println("Nilai Rapor MAT");
        
        System.out.println("Masukkan nilai tugas 1 anda: ");
        tugas1=sken.nextInt();
        System.out.println("Masukkan nilai tugas 2 anda: ");
        tugas2=sken.nextInt();
        System.out.println("Masukkan nilai tugas 3 anda: ");
        tugas3=sken.nextInt();
        nilaiMAT=(tugas1+tugas2+tugas3);
        rerataMAT=(nilaiMAT/3);
        System.out.println("Nilai rapor MAT anda= "+rerataMAT);
        
        if(rerataMAT>=85){
            System.out.println("Grade anda adalah A");
            System.out.println("Selamat anda naik kelas");}
        if(rerataMAT>=75&&rerataMAT<=75){
            System.out.println("Grade anda adalah B");
            System.out.println("Selamat anda naik kelas");}
        if(rerataMAT>=70&&rerataMAT<=75){
            System.out.println("Grade anda adalah C");
            System.out.println("Mohon maaf,anda tidak naik kelas");}
       
        while(keluar){
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab YA atau TIDAK: ");
            
            ulang=sken.next();
            
            if(ulang.equalsIgnoreCase("ya")){
                keluar=false;
            }
        }
    
}
    }

