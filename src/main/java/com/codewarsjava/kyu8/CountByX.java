package com.codewarsjava.kyu8;

import java.util.Scanner;
import java.util.stream.IntStream;

public class CountByX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();

        int[] result = countBy(x, n);

        for (int output : result){
            System.out.println(output);
        }
    }

    // Membuat array dari 2 inputan x dan n
    // n menjadi length nya, x menjadi value kelipatan yang akan masuk ke indeks tiap array
    public static int[] countBy(int x, int n){
//        int value = 0;
//        int[] result = new int[n];
//
//        for(int i = 0; i < n; i++){
//            value += x;
//            result[i] = value;
//        }
//
//        return result;

//        Cara 2
//        return IntStream.rangeClosed(1, n)
//                .map(i -> i * x)
//                .toArray();

//        Cara 3
        return IntStream.iterate(x, it -> it + x).limit(n).toArray();
    }
}
