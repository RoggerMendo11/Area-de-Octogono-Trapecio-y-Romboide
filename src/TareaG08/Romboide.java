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
public class Romboide extends FiguraPadre {
    private double base;
    private double altura;

    public Romboide(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double CalcularArea(){
        return (base*altura);
    }

    public Romboide() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
