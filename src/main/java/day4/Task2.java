package day4;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int[] c = new int[100];

        Random random = new Random();
        random.nextInt(10000);

        for (int i = 0; i < c.length; i++) {
            c[i] = random.nextInt(10000);
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(" " + c[i]);
            System.out.println();
        }
        int b = 0;
        for (int k : c) {
            if (k > b)
                b = k;

        }
        System.out.println("Максимальный элемент массива " + b);

        int f = 10000;
        for (int k : c) {
            if (k < f)
                f = k;
        }
        System.out.println("Минимальный элемент массива " + f);

        int m = 0;
        for (int k : c) {
            if (k % 10 == 0)
                m++;
        }
        System.out.println("Количество элементов, которые заканчиваются на 0: " + m);

        int sum = 0;
        for (int k : c) {
            if (k % 10 == 0)
                sum=sum+k;
        }
        System.out.println("Сумма элементов, которые заканчиваются на 0: " + sum);
    }
}