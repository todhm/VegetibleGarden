package model;

public abstract class Vegetable implements Growable {

    public String name;
    public String instruction;
    public VegType vegtype;

    public int feedPeriod;
    public int waterPeriod;
    public int harvestDate;

    double humidity;


    public Vegetable(String name, VegType vegtype, int fp, int wp, int hd){
        this.name = name;
        this.vegtype = vegtype;
        this.feedPeriod = fp;
        this.waterPeriod = wp;
        this.harvestDate = hd;

    }

    public String getName(){ return name; }
    public int getFP(){ return feedPeriod; }
    public int getWP(){ return waterPeriod; }
    public int getHD(){ return harvestDate; }



    public void setName(String name){ this.name =name;  }

    public  String getInstructions(){ return instruction;}


    protected void setInstructions(String instruction){ this.instruction= instruction; }

    public VegType getType(){ return vegtype; }


    public void harvest() {
        System.out.println("Harvest SUccesfully!");


    }


}
