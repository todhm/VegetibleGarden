package model;

public class Cabbage extends Vegetable {

    int length ;
    int greenity;
    public Cabbage(String name, VegType vegtype) {
        super(name, vegtype,6,20,220);
        length = 10;
        greenity = 1;
    }

    @Override
    public void feed() {
        this.greenity += 0.2;
        this.length += 0.02;
        System.out.println("Grow Cabage");

    }

    @Override
    public void water() {
        this.humidity = 1.3;

    }

    @Override
    public void secking() {
        this.humidity -= 0.01;
    }


}
