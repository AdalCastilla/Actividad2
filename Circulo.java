package actividad3;

public class Circulo {
public double radio;
    
    
    public Circulo() {
        this(0);
}
    Circulo(double id) {
        this.radio=id;
    }

    
    public double CalcularArea(){
        double area = 3.14 * Math.pow(radio, 2);
        return area;
    }
    public double CalcularCircunferencia(){
        double circunferencia = 3.14*2*radio;
        return circunferencia;
    }
    
}

