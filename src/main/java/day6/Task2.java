package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane ("Boeing", 1990, 25, 30000);

        airplane.setYear(1984);
        airplane.setLength(33);

        airplane.fillUp(2000);
        airplane.fillUp(5000);
        airplane.info();

    }
}
