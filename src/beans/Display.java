/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Alexis
 */
public class Display {
    private float diagonalaDisplay;
    private int frecventaDisplay;

    public float getDiagonalaDisplay() {
        return diagonalaDisplay;
    }

    public void setDiagonalaDisplay(float diagonalaDisplay) {
        this.diagonalaDisplay = diagonalaDisplay;
    }

    public int getFrecventaDisplay() {
        return frecventaDisplay;
    }

    public void setFrecventaDisplay(int frecventaDisplay) {
        this.frecventaDisplay = frecventaDisplay;
    }

    @Override
    public String toString() {
        return diagonalaDisplay + ", " + frecventaDisplay;
    }    
}
