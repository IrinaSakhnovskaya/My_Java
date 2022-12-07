package day7;


public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane(" ",1990, 20, 30000, 1000);
        Airplane airplane2 = new Airplane(" ", 1987, 33, 32000, 2000);

        Airplane.compareAirplanes(airplane1, airplane2);
}
}
