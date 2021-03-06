package src.main.java;

import java.util.Arrays;


public class Side
{
    private Hole tuz;
    private Hole[] holes;
    private Kazan kazan;
    private String colour;
    private Hole h1;
    private Hole h2;
    private Hole h3;
    private Hole h4;
    private Hole h5;
    private Hole h6;
    private Hole h7;
    private Hole h8;
    private Hole h9;
    
    //creating an array with 9 holes and sets their colours
    public Side(String colour)
    {
        h1 = new Hole(1);
        h2 = new Hole(2);
        h3 = new Hole(3);
        h4 = new Hole(4);
        h5 = new Hole(5);
        h6 = new Hole(6);
        h7 = new Hole(7);
        h8 = new Hole(8);
        h9 = new Hole(9);
        
        holes =new Hole[] {h1,h2,h3,h4,h5,h6,h7,h8,h9};
        kazan = new Kazan();
        tuz = null;
        this.colour = colour;
        for(int i = 0; i < 9; i++)
        {
            holes[i].setColour(colour);
           // System.out.println("index..."+ i +": num..." + numberInHole);
        }
    }

    public int getNumberInKazan()
    {
        return kazan.getNumberOfKorgools();
    }
    
    public Hole getHole(int index)
    {
        return holes[index];
    }
    //adds to the Kazan whilst deleting from the hole
    public void updateKazan(Hole hole)

    {
        int number = hole.getNumberOfKorgools();
        kazan.addKorgools(number);
        hole.deleteKorgools(number);
    }
    
    public int getNumberInHole(int index)
    {
        return holes[index].getNumberOfKorgools();
    }
    
    public String getColour() {
        return colour;
    }
    //returns the hole whhich is the tuz
    public Hole getTuz()
    {
        return tuz;
    }
    //creats a tuz
    public void setTuz(Hole tuz)
    {
        this.tuz = tuz;
    }
    
    public void addKorgoolsToHole(int index)
    {
        holes[index].addKorgools();
    }
    
    public void deleteKorgoolsAtHole(int index, int number)
    {
        holes[index].deleteKorgools(number);
    }
    
}