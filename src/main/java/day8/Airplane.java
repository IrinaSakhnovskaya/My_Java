package day8;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;


    public Airplane (String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;

    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void info () {
        System.out.println("Изготовитель: " + manufacturer + ", " + "год выпуска: " + year + ",  длина: " + length + ", вес: " + weight);
    }
    public String toString() {
        return ("Изготовитель: " + manufacturer + ", "+ "год выпуска: " + year + ",  длина: " + length + ", вес: " + weight);
    }
}
