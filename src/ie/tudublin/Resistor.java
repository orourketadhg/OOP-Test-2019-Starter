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

    public void Render(Colour c, float x, float y){
		fill(255);
        line(x, y, x + 50, y);
        line(x + 50, y, x + 50, y - 50);
		line(x + 50, y, x + 50, y + 50);
		
		line(x + 50, y - 50, x + 150, y - 50);
		line(x + 50, y + 50, x + 150, y + 50);

        line(x + 150, y, x + 150, y - 50);
		line(x + 150, y, x + 150, y + 50);

		line(x + 150, y, x + 200, y);

		fill(c.getR(), 0, 0);
		rect(x + 60, y - 50, 10, 100);

		fill(0, c.getG(), 0);
		rect(x + 80, y - 50, 10, 100);
		
		fill(0, 0, c.getB());
		rect(x + 100, y - 50, 10, 100);

		fill(0);
		textSize(22);
		textAlign(CENTER, CENTER);
		text(this.value, x + 300, y);

    }

}