
package actividad;

/**
 *
 * @author adalc
 */
public class Circulo {
    public double radio;
    public double area;
    public double circunferencia;
    
    public Circulo(double radio){
        this.radio= radio;
        
    }
    public Circulo(){
        this(177852);
    }
    
    void calcularArea(){
        area = 3.14 * Math.pow(radio, 2);
    }
    
    void calcularCircunferencia(){
        circunferencia= 3.14*2*radio;
    }
}
