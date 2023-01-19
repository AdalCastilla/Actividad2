/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad;

/**
 *
 * @author adalc
 */
public class Circulo {
    public double radio;
    public double area;
    public double circunferencia;
    
    void Circulo(double ID){
        this.radio= ID;
    }
    
    void CalcularArea(){
        area = 3.14 * Math.pow(radio, 2);
    }
    
    void CalcularCircunferencia(){
        circunferencia= 3.14*2*radio;
    }
}
