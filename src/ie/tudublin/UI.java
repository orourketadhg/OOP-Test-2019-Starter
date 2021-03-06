package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{	
	ArrayList<Colour> colours = new ArrayList<Colour>();
	ArrayList<Resistor> resistors = new ArrayList<Resistor>();

	float Border = 100; 


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
		// load Colours
		loadColours();

		// Print Colours Array list
		printColours();
		
		// load Resistors
		loadResistors();

		// testing findColour
		System.out.println("\n" + findColour(7));
	}
	
	public void draw()
	{	
		//TestResistorDrawing(100, 100);

		for (int i = 0; i < 5; i++) {
			// mapping for each reisiter
			float m = map(i, 0, 4, Border , height - Border);

			//TestResistorDrawing(Border, m);
		}

		//Colour c = colours.get(1);
		//Resistor r = new Resistor(c.getValue());
		//r.Render(c, 300, 300);

	}

	public void loadColours(){
		Table ColoursTable = new Table();
		ColoursTable = loadTable("colours.csv", "header");

		for (TableRow row : ColoursTable.rows()) {
			Colour c = new Colour(row);
			colours.add(c);

		}

	}

	public void loadResistors(){
		Table ResistorsTable = loadTable("resistors.csv", "header");

		for (int i = 0; i < ResistorsTable.getRowCount(); i++) {
			
			Resistor r = new Resistor(ResistorsTable.getInt(i, 0));

			resistors.add(r);
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

	public void TestResistorDrawing(float x, float y){
		//float x = 100;
		//float y = 100;

		fill(255);
        line(x, y, x + 50, y);
        line(x + 50, y, x + 50, y - 50);
		line(x + 50, y, x + 50, y + 50);
		
		line(x + 50, y - 50, x + 150, y - 50);
		line(x + 50, y + 50, x + 150, y + 50);

        line(x + 150, y, x + 150, y - 50);
		line(x + 150, y, x + 150, y + 50);

		line(x + 150, y, x + 200, y);

		fill(255, 0, 0);
		rect(x + 60, y - 50, 10, 100);

		fill(0, 255, 0);
		rect(x + 80, y - 50, 10, 100);
		
		fill(0, 0, 255);
		rect(x + 100, y - 50, 10, 100);

		fill(0);
		textSize(22);
		textAlign(CENTER, CENTER);
		text("test", x + 300, y);

	}

}
