import java.awt.Color;

public class Carro{ //clase
  private static String marca; //metodo
  private static String color;//metodo

  public static void main (String[] args ){  //main
  valores("blanco", "BMW");
  System.out.print(" marca " + marca + " Color "+ color);
  }
  public static void valores (String col, String mar){ //metodo
    color= col;
    marca=mar;
  }
} 