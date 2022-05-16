package gridgenerator;

import java.awt.Color;

public class Rectangle 
{
    
    private int pos_X;
    private int pos_Y;
    private Color col;

    public Rectangle(int pos_X, int pos_Y, Color col) {
        this.pos_X = pos_X;
        this.pos_Y = pos_Y;
        this.col = col;
    }

    public void setPos_X(int pos_X) {
        this.pos_X = pos_X;
    }

    public void setPos_Y(int pos_Y) {
        this.pos_Y = pos_Y;
    }

    public void setCol(Color col) {
        this.col = col;
    }

    public int getPos_X() {
        return pos_X;
    }

    public int getPos_Y() {
        return pos_Y;
    }

    public Color getCol() {
        return col;
    }
    
}
