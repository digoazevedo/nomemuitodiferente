package funcoes;

public class Retorno {

    public static void main(String[] args) {
        int resultado;
        resultado = soma();
        System.out.println("Resultado: " + resultado);
    }

    public static int soma() {
        int x = 10;
        int y = 10;
        int res;
        res = x + y;
        return res;
    }
}
