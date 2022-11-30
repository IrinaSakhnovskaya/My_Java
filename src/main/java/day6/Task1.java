package day6;

public class Task1 {
    public static void main(String[] args) {

        Car car2 = new Car();
            car2.setModel("Тойота");
            car2.setColor("Синий");
            car2.setYear(2005);

        Bike bike1 = new Bike ("BMW", 2010, "black");

        car2.info();
        bike1.info();

        System.out.println(car2.yearDifference(2020));
        System.out.println(bike1.yearDifference(2020));
    }

    }

