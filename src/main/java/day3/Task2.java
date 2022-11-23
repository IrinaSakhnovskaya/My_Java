package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double c = 0;
        while (true){
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
       c=a/b;
            if (b == 0) {
                break;
            }
            System.out.println(c);
        }
    }
}





