package day4;

import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] c = new int[a];

        Random random = new Random();
        random.nextInt(10);

        for (int i = 0; i < c.length; i++) {
            c[i] = random.nextInt(10);
        }

        //for (int i = 0; i < c.length; i++)
        for (int x:c){
            System.out.print(" " + x);
        }
        System.out.println();
        System.out.println("Длина массива: " + c.length);

        int b = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] > 8)
                b++;
        }
        System.out.println("Количество чисел больше 8: " + b);

        int d = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 1)
                d++;
        }
        System.out.println("Количество чисел равных 1: " + d);

        int f = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] % 2 == 0)
                f++;
        }
        System.out.println("Количество четных чисел: " + f);

        int g = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] % 2 != 0)
                g++;
        }
        System.out.println("Количество нечетных чисел: " + g);

        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum = sum + c[i];}
            System.out.println("Сумма всех элементов массива:: " + sum);
        }
    }







