package ie.tudublin;

import processing.core.PApplet;

public class Resistor extends PApplet{

    public int value;
    public int ones;
    public int tens;
    public int hundreds;

    public Resistor(int value){
        this.value = value;

        this.hundreds = (value / 100);
        this.tens = (value - (hundreds * 100)) / 10;
        this.ones = value - ((hundreds * 100)  + (tens * 10));
        
    }

    public Resistor(){

    }

    public void Render(float x, float y){
        fill(255);
        line(x, y, x + 20, y);
        line(x + 20, y, x + 20, y - 20);
        line(x + 20, y, x + 20, y - 20);


    }

}