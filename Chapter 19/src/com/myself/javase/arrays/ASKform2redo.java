package com.myself.javase.arrays;
import java.util.Scanner;

public class ASKform2redo {
    public static void main(String[] args) {
        int betul = 0;
        int salah = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Jawab soalan berikut");
        System.out.println("a = 12 , b = 5 , c = 2");
        System.out.println();
        System.out.println("1. a > b");
        System.out.println("2. a % b = 0");
        System.out.println("3. 12 // 5 = c");
        System.out.println("4. a > 6 > b");
        System.out.println("5. b < 2 < a");
        System.out.println();

        System.out.print("Jawapan soalan 1 : ");
        boolean Jp1 = s.nextBoolean();
        System.out.print("Jawapan soalan 2 : ");
        boolean Jp2 = s.nextBoolean();
        System.out.print("Jawapan soalan 3 : ");
        boolean Jp3 = s.nextBoolean();
        System.out.print("Jawapan soalan 4 : ");
        boolean Jp4 = s.nextBoolean();
        System.out.print("Jawapan soalan 5 : ");
        boolean Jp5 = s.nextBoolean();
        System.out.println();

        if (Jp1){
            betul ++;
        }else{
            salah ++;
        }
        if (Jp2){
            salah ++;
        }else{
            betul ++;
        }
        if (Jp3){
            betul ++;
        }else{
            salah ++;
        }
        if (Jp4){
            betul ++;
        }else{
            salah ++;
        }
        if (Jp5){
            salah ++;
        }else{
            betul ++;
        }

        if (betul == 5){
            System.out.println("Tahniah, anda telah menjawab semua soalan dengan betul.");
        }else{
            System.out.println("Anda telah menjawab " + betul + " soalan dengan betul dan "+ salah +" soalan dengan salah.");
            System.out.println("Sila buat ulang kaji.");
        }
    }
}


