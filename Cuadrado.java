package actividad3;

public class Cuadrado {
    
	public double lado;

    
    public Cuadrado() {
            this(0);
    }
        Cuadrado(double id) {
            this.lado=id;
        }

    
    public double CalcularPerimetro(){
        double perimetro = lado*4;
        return perimetro;
    }
    public double CalcularArea(){
        double area = lado*lado;
        return area;
    }
    public double CalcularDiagonal(){
        double diagonal = Math.sqrt(Math.pow(lado,2)*2);
        return diagonal;
    }

}

