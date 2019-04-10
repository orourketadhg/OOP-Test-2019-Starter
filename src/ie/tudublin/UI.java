package ie.tudublin;

import java.util.ArrayList;

import jdk.nashorn.internal.ir.ReturnNode;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{	
	ArrayList<Colour> colours = new ArrayList<Colour>();

	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
		loadColours();
		printColours();
	}
	
	public void draw()
	{			
	}

	public void loadColours(){
		Table table = loadTable("colous.csv", "header");

		for (TableRow row : table.rows()) {
			colours.add(new Colour(row));

		}

	}

	public void printColours(){
		for (int i = 0; i < colours.size(); i++) {
			System.out.println(colours.get(i));
		}

	}

	public Colour findColour(int value){

		for (int i = 0; i < colours.size(); i++) {
			Colour c = colours.get(i);

			if (c.getValue() == value){
				return c;
				
			}
				
		}
		
		return null;

	}

}
