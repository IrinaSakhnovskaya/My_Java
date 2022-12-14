package day6;

public class Airplane {
    private String manufacturer;
    private int year;
    private double length;
    private int weight;
    private int fuel;

    public Airplane (String manufacturer, int year, double length, int weight, int fuel) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }

    public Airplane(String boeing, int year, int length, int weight) {

    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }
    public void info () {
        System.out.println("Изготовитель: " + manufacturer + ", "+ "год выпуска: " + year + ",  длина: " + length + ", вес: " + weight +", количество топлива в баке: "+ fuel);
    }

    public void fillUp(int n){
        fuel += n;
    }
}
