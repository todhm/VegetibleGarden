package model;

public class Tomato extends Vegetable {
    int sweet;
    int radius;


    public Tomato(String name, VegType vegtype){
        super(name,vegtype, 10,20,250);
        int sweet =0 ;
        int radius = 0;
        this.setInstructions("You can grow tomato");

    }


    @Override
    public void feed(){
        sweet += 1;
        radius += 10;
        System.out.println("Tomato feat Vitamin");


    }

    @Override
    public void secking(){
        this.humidity -= 0.02;
    }

    @Override
    public void water() {
        this.humidity = 0.76;
        System.out.println("Tomato drunk water!");
    }


}
