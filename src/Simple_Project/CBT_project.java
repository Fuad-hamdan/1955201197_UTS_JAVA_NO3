/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simple_Project;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class CBT_project {
    public static void main(String[] args) {

        int benar = 1, salah = 1, totbenar, totsalah, b1 = 0, b2 = 0, b3 = 0, b4 = 0, b5 = 0;
        int s1 = 0, s2 = 0, s3 = 0, s4 = 0, s5 = 0;
        
        String hasil;
        String[] n = new String[6];
        
        boolean running = true;
        int ulang = 0;
        String henti;
        Scanner scan = new Scanner(System.in);
        
        while (running){
            System.out.println("                 U N I V E R S I T A S   N A H D L A T U L   U L A M A   B L I T A R");
            System.out.println("                                  UTS ALGORITMA dan PEMROGRAMAN 1");
            System.out.println("                                      Semester 2 | Juni 2020");
            System.out.println("");
            
            n[0] = "Apa nama aplikasi yang kita gunakan untuk praktikum Algoritma dan Pemrograman ?";
            n[1] = "Notepad++";
            n[2] = "Sublime Text";
            n[3] = "NetBeans";
            n[4] = "Visual Studio Code";
            System.out.println("1. "+n[0]);
            System.out.println("   a. "+n[1]);
            System.out.println("   b. "+n[2]);
            System.out.println("   c. "+n[3]);
            System.out.println("   d. "+n[4]);
            Scanner a1 = new Scanner(System.in);
            System.out.print("Jawab : ");
            hasil = a1.nextLine();
            switch (hasil){
                case "c":
                    b1 = benar;
                    totbenar = b1;
                    totsalah = s1;
                    break;
                case "a":
                    s1 = salah;
                    totbenar = b1;
                    totsalah = s1;
                    break;
                case "b":
                    s1 = salah;
                    totbenar = b1;
                    totsalah = s1;
                    break;
                case "d":
                    s1 = salah;
                    totbenar = b1;
                    totsalah = s1;
                    break;
            }
            System.out.println("");
            n[0] = "for (int  i = 0; i < 10 ; i++)";
            n[1] = "Berapa banyak perulangan yang dihasilkan dari sintaks di atas ?";
            n[2] = "10 kali";
            n[3] = "11 kali";
            n[4] = "8 kali";
            n[5] = "9 kali";
            System.out.println("2. "+n[0]);
            System.out.println("   "+n[1]);
            System.out.println("   a. "+n[2]);
            System.out.println("   b. "+n[3]);
            System.out.println("   c. "+n[4]);
            System.out.println("   d. "+n[5]);
            Scanner a2 = new Scanner(System.in);
            System.out.print("Jawab : ");
            hasil = a1.nextLine();
            switch (hasil){
                case "a":
                    b2 = benar;
                    totbenar = b1+b2;
                    totsalah = s1+s2;
                    break;
                case "b":
                    s2 = salah;
                    totbenar = b1+b2;
                    totsalah = s1+s2;
                    break;
                case "c":
                    s2 = salah;
                    totbenar = b1+b2;
                    totsalah = s1+s2;
                    break;
                case "d":
                    s2 = salah;
                    totbenar = b1+b2;
                    totsalah = s1+s2;
                    break;
            }
            System.out.println("");
            n[0] = "Siapa nama dosen pengampu mata kuliah Algoritma dan Pemrograman 1 ?";
            n[1] = "Moh. Fuad Hamdani";
            n[2] = "Ahmad Syaifudin";
            n[3] = "Dimas Ari Setyawan";
            n[4] = "Abd. Charis Fauzan";
            System.out.println("3. "+n[0]);
            System.out.println("   a. "+n[1]);
            System.out.println("   b. "+n[2]);
            System.out.println("   c. "+n[3]);
            System.out.println("   d. "+n[4]);
            Scanner a3 = new Scanner(System.in);
            System.out.print("Jawab : ");
            hasil = a1.nextLine();
            switch (hasil){
                case "d":
                    b3 = benar;
                    totbenar = b1+b2+b3;
                    totsalah = s1+s2+s3;
                    break;
                case "a":
                    s3 = salah;
                    totbenar = b1+b2+b3;
                    totsalah = s1+s2+s3;
                    break;
                case "b":
                    s3 = salah;
                    totbenar = b1+b2+b3;
                    totsalah = s1+s2+s3;
                    break;
                case "c":
                    s3 = salah;
                    totbenar = b1+b2+b3;
                    totsalah = s1+s2+s3;
                    break;
            }
            System.out.println("");
            n[0] = "Pada tanggal berapa batas waktu pengumpulan tugas UTS Algoritma dan Pemrograman 1";
            n[1] = "20 juni 2020";
            n[2] = "18 juni 2020";
            n[3] = "19 juni 2020";
            n[4] = "21 juni 2020";
            System.out.println("4. "+n[0]);
            System.out.println("   a. "+n[1]);
            System.out.println("   b. "+n[2]);
            System.out.println("   c. "+n[3]);
            System.out.println("   d. "+n[4]);
            Scanner a4 = new Scanner(System.in);
            System.out.print("Jawab : ");
            hasil = a1.nextLine();
            switch (hasil){
                case "b":
                    b4 = benar;
                    totbenar = b1+b2+b3+b4;
                    totsalah = s1+s2+s3+s4;
                    break;
                case "a":
                    s4 = salah;
                    totbenar = b1+b2+b3+b4;
                    totsalah = s1+s2+s3+s4;
                    break;
                case "c":
                    s4 = salah;
                    totbenar = b1+b2+b3+b4;
                    totsalah = s1+s2+s3+s4;
                    break;
                case "d":
                    s4 = salah;
                    totbenar = b1+b2+b3+b4;
                    totsalah = s1+s2+s3+s4;
                    break;
                    }
            System.out.println("");
            n[0] = "Dibawah ini yang termasuk Input/Output";
            n[1] = "BufferedReader, Scanner, JOptionPane, ";
            n[2] = "Scanner, do while, switch case";
            n[3] = "JOptionPane, if else, Scanner";
            n[4] = "for, switch case, while";
            System.out.println("5. "+n[0]);
            System.out.println("   a. "+n[1]);
            System.out.println("   b. "+n[2]);
            System.out.println("   c. "+n[3]);
            System.out.println("   d. "+n[4]);
            Scanner a5 = new Scanner(System.in);
            System.out.print("Jawab : ");
            hasil = a1.nextLine();
            switch (hasil){
                case "a":
                    b5 = benar;
                    totbenar = b1+b2+b3+b4+b5;
                    totsalah = s1+s2+s3+s4+s5;
                    break;
                case "b":
                    s5 = salah;
                    totbenar = b1+b2+b3+b4+b5;
                    totsalah = s1+s2+s3+s4+s5;
                    break;
                case "c":
                    s5 = salah;
                    totbenar = b1+b2+b3+b4+b5;
                    totsalah = s1+s2+s3+s4+s5;
                    break;
                case "d":
                    s5 = salah;
                    totbenar = b1+b2+b3+b4+b5;
                    totsalah = s1+s2+s3+s4+s5;  
                    break;
                    }
            System.out.println("====================== UJIAN SELESAI ======================");
            totbenar = b1+b2+b3+b4+b5;
            System.out.println("Jumlah soal benar    : "+totbenar);
            totsalah = s1+s2+s3+s4+s5;
            System.out.println("Jumlah soal salah    : "+totsalah);
            
            String nilai;
            if (totbenar*20>=100){
                nilai = "A";
            }
            else if (totbenar*20>=80){
                nilai = "B";
            }
            else if (totbenar*20>=60){
                nilai = "C";
            }
            else if (totbenar*20>=40){
                nilai = "D";
            }
            else if (totbenar*20>=20){
                nilai = "E";
            }
            else{
                nilai = "Nilai akhir          : 0  (F)";
            }
            if (nilai == "Nilai akhir          : 0  (F)"){
                System.out.println(nilai);
            }else{
                System.out.println("Nilai akhir          : "+(totbenar*20)+("  (")+(nilai)+(")"));}
            
            System.out.println("Apakah Anda Ingin Mengulang ? Y/N");
            henti = scan.nextLine();
            if(henti.equalsIgnoreCase("N")){
                running = false;
            }ulang++;
        }
    }
}