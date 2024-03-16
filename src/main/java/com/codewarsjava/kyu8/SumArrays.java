package com.codewarsjava.kyu8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class SumArrays {
    public static void main(String[] args) {
        double[] numbers = new double[3];
        Scanner scanner = new Scanner(System.in);
        double a;

        for(int i = 0; i < numbers.length; i++){
            a = scanner.nextDouble();
            numbers[i] = a;
        }

        double result = sum(numbers);
        System.out.println(result);
    }

    // Menjumlahkan isi tiap index array
    public static double sum(double[] numbers) {
//        double result = 0.0;
//        for(double number : numbers){
//            result += number;
//        }
//        return result;

        // cara cepat
        return Arrays.stream(numbers).sum();
    }
}
