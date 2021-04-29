import java.util.Scanner;

public class Calcuentrada {
  
  public static void main(String[] args) {
		int num1=7, num2=3;
    Scanner leer=new Scanner(System.in);
    System.out.println("digite la operacion que va a realizar : ");
    System.out.println("1) Suma  ");
    System.out.println("2) Resta ");
    System.out.println("3) Multiplicacion ");
    System.out.println("4) Division  ");
    int operacion= leer.nextInt(); 

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
		else{
      System.out.println( num1 +" /  "+ num2+" = "+ division(num1, num2));
    }
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
		resultado= (double)  num1/num2;		
		return resultado;
  }

}