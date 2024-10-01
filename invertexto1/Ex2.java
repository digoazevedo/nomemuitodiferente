package invertexto1;

import java.util.Scanner;

public class Ex2 {
    public static void main (String [] args) {
        
        double a, b, c, r, s, d;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Dê um valor: ");
        a = input.nextInt();
        System.out.println("Dê outro valor: ");
        b = input.nextInt();
        System.out.println("Dê mais um valor: ");
        c = input.nextInt();
        
        r = Math.pow((a+b),2);
        System.out.println("o resultado de r é"+ r);
        s = Math.pow((b+c),2);
        System.out.println("o resultado de s é"+ s);
        d = (r+s)/2;
        System.out.println("o resultado de d é"+ d);
        
        input.close();
    }
    
}

