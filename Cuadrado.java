
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
  
  void cuadrado(int ID){
      this.lado=ID;
  }
  
  void CalcularArea(){
      perimetro=lado*lado;
  }
  void CalcularPerimetro(){
      area=lado*lado;
  }
  void CalcularDiagonal(){
      diagonal= Math.sqrt(Math.pow(lado,2)*2);
  }
    
    }
