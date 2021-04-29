public class Calculadora {

	public static void main(String Arg[]) {
/*Escriba el numero correspondiente de la operacion que desea, en la variable "operacion" :
  1)Suma 
  2)Resta 
  3)Multiplicacion 
  4)Division
 */
  int operacion = 4;
//digite el numero 1 de la operacion;
  int num1 = 5;
//Escriba el numero 2 de la operacion 
  int num2 =6;

		operaciones(num1, num2, operacion);
		
	}
	public static void operaciones(int num1,int num2,int operacion){
		if(operacion==1) {
			System.out.println( num1 +" + "+ num2+" = "+ suma(num1, num2));
		}
    else if(operacion==2){
      System.out.println( num1 +" - "+ num2+" = "+ resta(num1, num2));
    }
    else if(operacion==3){
      System.out.println( num1 +" x "+ num2+" = "+ multiplicacion(num1, num2));
    }    
		else if(operacion==4){
      System.out.println( num1 +" /  "+ num2+" = "+ division(num1, num2));
    }else
      System.out.println("El numero de la operacion que desea no esta disponible ");
      
	}
	public static int suma(int num1, int num2) {
		int resultado=0;
		resultado=num1+num2;		
		return resultado;
	}
  public static int resta(int num1, int num2) {
		int resultado=0;
		resultado=num1-num2;		
		return resultado;
	}
  public static int multiplicacion(int num1, int num2) {
		int resultado=0;
		resultado=num1*num2;		
		return resultado;
	}  
  public static double division(int num1, int num2) {
		double resultado=0;
		resultado= (double) num1/num2;		
		return resultado;
  }
	
}