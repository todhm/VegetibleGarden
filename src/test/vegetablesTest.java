package test;

import model.Cabbage;
import model.Lectus;
import model.Tomato;
import model.Vegetable;
import org.junit.Before;
import org.junit.Test;

import static model.VegType.*;
import static org.junit.Assert.assertEquals;

public class vegetablesTest{
    Vegetable testVegetable;
    Tomato testTomato;
    Lectus testLectus;
    Cabbage testCabbage;

    String testInstructions = "You can grow Tomato";




    @Before
    public void setUP(){
        testVegetable = new Tomato("testVEG",SEED);
        testTomato  = new Tomato("testTomato",ROOT);
        testLectus = new Lectus("testLectus",LEAF);
        testCabbage = new Cabbage("testCabbage",LEAF);

    }

    @Test
    public void testSetUP(){
        assertEquals(testVegetable.getName(),"testVEG");
        assertEquals(testVegetable.getInstructions(),testInstructions);
        assertEquals(testVegetable.getType(),SEED);
        assertEquals(testVegetable.getFP(),10);
        assertEquals(testVegetable.getWP(),20);
        assertEquals(testVegetable.getHD(),250);

    }

    @Test
    public void testTomato(){

    }


    @Test
    public void testLectus(){

    }


    @Test
    public void testCabbage(){

        
    }


}
