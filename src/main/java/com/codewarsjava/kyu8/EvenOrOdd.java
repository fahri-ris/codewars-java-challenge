package com.codewarsjava.kyu8;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String result = cekEvenOdd(a);

        System.out.println(result);
    }

//    Melakukan print jika angka ganjil atau genap
    public static String cekEvenOdd(int number){
//        String result;
//        if(number % 2 == 0){
//            result = "Even";
//        } else {
//            result = "Odd";
//        }
//
//        return result;

        // Cara cepat
        return number % 2 == 0? "Even" : "Odd";
    }
}
