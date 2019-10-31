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
public class Octogono extends FiguraPadre{
    //atributos
    private double lado;
    private double apotema;
   

    //constructor
    public Octogono(double lado, double apotema) {
      this.lado=lado;
      this.apotema=apotema;
    }
    
     public double CalcularArea(){
        return (4*lado*apotema);
    }

    public Octogono() {
    }
    
    
    // getter and setter

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

 
}
