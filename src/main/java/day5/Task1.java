package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car2 = new Car();
        car2.setModel("Тойота");
        car2.setColor("Синий");
        car2.setYear(2022);
        System.out.println("Модель машины " + car2.getModel() + " , цвет машины " + car2.getColor() + ", год выпуска машины " + car2.getYear());
    }
}



