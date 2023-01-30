package actividad3;

import java.util.Scanner;

public class main {
 
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    boolean bandera = false;
	    while(bandera=true) {
		    System.out.println("Ingrese que figura quiere realizar operaciones Escriba Circulo o Cuadrado");
		    String figura = scan.next();
	      
        
	    
        if(figura.equals("circulo")||figura.equals("Circulo")){
	   System.out.println("Ingrese medida del radio");
	   int id = scan.nextInt();
	   Circulo circulo= new Circulo(id);
	   System.out.println("Que operacion desea realizar, escriba area o circunferencia");
	   String operacion=scan.next();

	      switch (operacion){

	        case "area":
	          double areaCirculo=circulo.CalcularArea();
	          System.out.println("Area = " +areaCirculo );
	          break;

	        case "circunferencia":
	        double circunferenciaCirculo = circulo.CalcularCircunferencia();
	        System.out.println("Circunferencia = " +circunferenciaCirculo );
	        break;
	      }
	      
	    }
	    else 
	      if(figura.equals("cuadrado")||figura.equals("Cuadrado"))
	    {
	      System.out.println("Ingrese la medida del lado:");
	      int id = scan.nextInt();
	      Cuadrado cuadrado = new Cuadrado(id);
	      System.out.println("Que operacion desea realizar, escriba area, perimetro o diagonal");
	      String operacion = scan.next();

	      switch (operacion){

	        case "area":
	          double areaCuadrado = cuadrado.CalcularArea();
	          System.out.println("Area = " +areaCuadrado );
	        break;

	        case "perimetro":
	        double perimetroCuadrado = cuadrado.CalcularPerimetro();
	        System.out.println("Perimetro = " +perimetroCuadrado );
	        break;
	  
	        case "diagonal":
	        double diagonalCuadrado = cuadrado.CalcularDiagonal();
	        System.out.println("Diagonal = " +diagonalCuadrado );
	        break;  
	        }
	      
	      }
	    else {
	      System.out.println("Invalido");
	    }
	    }
	    scan.close();
	    }
}