/** 1. Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна строка, полученная
 * конкатенацией (“склеиванием”) чисел из диапазона через пробел (0 + “ “ + 1 + “ “ + 2 + … + 20000).
 После создания такой строки, вызов System.out.println() на этой строке должен вывести в консоль сразу все числа из диапазона:
 0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000**/

 package day8;

public class Task1 {
    public static void main(String[] args) {
        String a = " ";
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++)
            a += i + " ";
        long stopTime1 = System.currentTimeMillis();
        System.out.println(stopTime1-startTime1);
        System.out.println("Time: " + a);



        StringBuilder b = new StringBuilder(" ");
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++)
            b.append(i).append(' ');
        long stopTime2 = System.currentTimeMillis();
        System.out.println(stopTime2-startTime2);
        System.out.println("Time: " + b);
    }
}


