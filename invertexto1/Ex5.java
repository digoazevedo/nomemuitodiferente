package invertexto1;

import java.util.Scanner;

public class Ex5 {
    public static void main (String[] args) {
        
        double raio, circunferencia;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Defina o tamanho do raio do círculo: ");
        raio =input.nextDouble();
        
        circunferencia = (2 * 3.14 * raio);
        System.out.println("A circúndrencia é :" +circunferencia);
    } 
        
}