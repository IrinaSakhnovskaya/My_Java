package day6;

public class Bike {
    private String model;
    private int year;
    private String color;


    public Bike(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }


    public void info () {

        System.out.println("Это мотоцикл");
    }
    public int yearDifference (int inputYear){
        return inputYear - year;
    }
}





