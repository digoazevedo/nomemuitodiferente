public class Main {
    public static void main(String[] args) {
        
        int n1 = 80;
        int n2 = 80;
        double res;
        
        //Operadores Aritmeticos
        res = n1 + n2;
        res = n1 - n2;
        res = n1 * n2;
        res = n1 / n2;
        res = n1 % n2;
        
        if (n1 < n2) {
            System.out.println("O primeiro valor e menor que o segundo");
        } else if (n1 > n2){
            System.out.println("O segundo valor e menor que o primeiro");
        } else {
            System.out.println("Os valores sao iguais");
        }
    
    
    //lacos de repeticao
    //laco while
    int repeticao = 0;
    while (repeticao < 10) {
        System.out.println("Volta Nr." + repeticao);
        repeticao++;
    }
    
    //Loop for
    System.out.println("\n");
    for (int i=0; i<=10; i++) {
        System.out.println("Loop" + i);
    }
    
    //Switch Case
    int caso = 3;
    switch(caso){
        case 1:
            System.out.println("Primeiro");
            break;
        case 2:
            System.out.println("Segundo");
            break;
        case 3:
            System.out.println("Terceiro");
            break;
        default:
            System.out.println("Outro caso");
    }
    }

}