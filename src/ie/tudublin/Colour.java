package ie.tudublin;

import processing.data.TableRow;

public class Colour {

    private String Colour;
    public int r;
    public int g;
    public int b;
    public int value;

    public Colour(TableRow row){
        this.Colour = row.getString("colour");
        this.r = row.getInt("r");
        this.r = row.getInt("g");
        this.r = row.getInt("b");
        this.r = row.getInt("value");
        
    }

    public Colour(){

    }

    public String toString(){
        return this.Colour + "\t" + this.r + "\t" + this.g + "\t" + this.b + "\t" + this.value;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return Colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        Colour = colour;
    }

    /**
     * @return the r
     */
    public int getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(int r) {
        this.r = r;
    }

    /**
     * @return the g
     */
    public int getG() {
        return g;
    }

    /**
     * @param g the g to set
     */
    public void setG(int g) {
        this.g = g;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

}