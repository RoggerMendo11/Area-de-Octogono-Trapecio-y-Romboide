/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaG08;

/**
 *
 * @author Rogger Mendo
 */
public class Trapecio extends FiguraPadre {
    
    private double Bmayor;
    private double bmenor;
    private double h;

    public Trapecio(double Bmayor, double bmenor, double h) {
        this.Bmayor = Bmayor;
        this.bmenor = bmenor;
        this.h = h;
    }
    
    public double CalcularArea(){
        return ((Bmayor+bmenor)*h)/2;
    }

    public Trapecio() {
    }

    public double getBmayor() {
        return Bmayor;
    }

    public void setBmayor(double Bmayor) {
        this.Bmayor = Bmayor;
    }

    public double getBmenor() {
        return bmenor;
    }

    public void setBmenor(double bmenor) {
        this.bmenor = bmenor;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    
    
}
