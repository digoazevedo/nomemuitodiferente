package objetos;

public class Celular {
    
    private String modelo;
    private String cor;
    private boolean capa = false;

    public Celular(String modelo, String cor, boolean capa) {
        this.modelo = modelo;
        this.cor = cor;
        this.capa = false;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean getCapa() {
        return capa;
    }

    public void setCapa (boolean capa) {
        this.capa = capa;
    }

    public void ligar() {
        System.out.println("Estou ligando para meu irmão");
    }

    public void assistir() {
        System.out.println("Estou assistindo filme");
    }

    @Override
    public String toString() {
        return "\nModelo: " + this.modelo
                + "\nCor: " + this.cor
                + "\nCapa: " + this.capa;

    }
}
