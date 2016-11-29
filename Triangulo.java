import java.util.*;
public class Triangulo{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		
		
		System.out.println("Introduce los lados");
		float lado = teclado.nextFloat(); 
		
		float perimetro =perimetroTrianguloEquilatero(lado);
		
		System.out.printf("El perimetro del triangulo es %.2f\n",perimetro);
		      


 }
    public static float perimetroTrianguloEquilatero(float lado){
		return 3 * lado;
		
      	
	}
	
}
		
       
   
