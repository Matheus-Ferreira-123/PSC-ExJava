// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Ativi11 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    
    int NumA, NumB, Soma = 0; 
    

    System.out.println("Digite o promeiro Número");
    NumA = teclado.nextInt();

    System.out.println("Digite o Segundo Número");
    NumB = teclado.nextInt();

    if (NumA == NumB)
    {
      System.out.println("Os número são iguais");
    }
    else if(NumA < NumB)
    {
      for(int index = NumA; index <= NumB; index++){
        Soma = Soma + index;
        System.out.print(index + " + ");
      }
    }
    else
    {
      for(int index = NumA; index >= NumB; index--){
        Soma = Soma + index;
        System.out.print(index + " + ");
      }
    }
   

    System.out.println(" = "  + Soma);
    




  }

    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
