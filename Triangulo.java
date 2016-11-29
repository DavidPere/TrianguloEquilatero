import java.util.*;
public class Triangulo{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		
		
		System.out.println("Introduce los lados");
		double lado = teclado.nextFloat(); 
		
		double perimetro =perimetroTrianguloEquilatero(lado);
		double area=areaTrianguloEquilatero(lado);
		
		System.out.printf("El perimetro del triangulo es %.2f\n",perimetro);
		System.out.printf("El area del triangulo es %.2f%n",area);
		      


 }
    public static double perimetroTrianguloEquilatero(double lado){
		return 3 * lado;
		
      	
	}
	public static double areaTrianguloEquilatero(double lado){
		return Math.sqrt(3) / 4 * lado * lado;	
	}
}
		
       
   
