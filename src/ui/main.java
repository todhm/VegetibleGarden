package ui;

import model.Cabbage;
import model.Lectus;
import model.Tomato;
import model.Vegetable;

import java.util.ArrayList;
import java.util.List;

import static model.VegType.LEAF;
import static model.VegType.SEED;

public class main {
    public static void main(String[] args) {
        List<Vegetable> garden = new ArrayList();
        garden.add( new Tomato("tomato",SEED));
        garden.add( new Lectus("lectus",LEAF));
        garden.add( new Cabbage("cabbage",LEAF));


        for(int i =0 ; i<365; i++){

            for(Vegetable veg:garden){
                if(i < veg.getHD()){
                    if(i ==0 || i % veg.getFP() ==0 ){
                        veg.feed();
                    }
                    if(i ==0 || i % veg.getWP() ==0 ){
                        veg.water();
                    }
                    veg.secking();

                }
                else if (i == veg.getHD()){
                    veg.feed();
                }
            }
            return;

        }

    }
}
