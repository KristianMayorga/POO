
public class ParImpar { 


  public static void main (String[] args ){  //main
  int numeroInferior=30; 
  int numeroSuperior=50;

  if (numeroSuperior>numeroInferior){
    par(numeroInferior,numeroSuperior);
    impar(numeroInferior,numeroSuperior);

  }else{
    System.out.print("el orden de los numeros esta mal");
  }
  
  }
  public static void par (int numeroInferior, int numeroSuperior){ 
    System.out.print("Numeros pares : ");
    for(int i= numeroInferior; i<=numeroSuperior;i++ ){
      if(i%2==0){
        System.out.print(i+"/");
      }
    }
    System.out.print("\n");
  }
  public static void impar (int numeroInferior, int numeroSuperior){ 
    System.out.print("Numeros impares : ");
    while(numeroInferior<=numeroSuperior){
    if(numeroInferior%2!=0){
      System.out.print(numeroInferior +"/");
    } 
    numeroInferior+=1;
  }
}
} 