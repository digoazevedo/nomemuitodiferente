package invertexto2;

import java.util.Scanner;

public class Ex6 {
    
    public static void main (String [] args) {
        quadrado();
    
    }

    public static void quadrado () {

        int raio , altura , área , dobro;
        
      Scanner input = new Scanner (System.in);
      System.out.println("Defina o lado do quadrado: ");
      raio = input.nextInt();
      System.out.println("Defina a altura do quadrado: ");
      altura = input.nextInt();
      
      área = (altura * raio);
      System.out.println("A área é igual à: " + área);
      
    
      dobro = (área * 2);
      System.out.println("O dobro da área é igual à: " + dobro);
    }
}

