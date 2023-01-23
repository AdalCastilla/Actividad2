
package actividad;

/**
 *
 * @author adalc
 */
public class Cuadrado {
  public double lado;
  public double area;
  public double diagonal;
  public double perimetro;
  
  public Cuadrado(double lado){
      this.lado=lado;
  }
  public Cuadrado(){
      this(177852);
  }
  
  void calcularArea(){
      perimetro=lado*lado;
  }
  void calcularPerimetro(){
      area=lado*lado;
  }
  void calcularDiagonal(){
      diagonal= Math.sqrt(Math.pow(lado,2)*2);
  }
    
    }
