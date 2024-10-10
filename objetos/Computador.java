package objetos;

public class Computador {
    
    private String marca;
    private String modelo;
    private String armazenamento;
    private boolean webcam = true;

    public Computador(String marca, String modelo, String armazenamento, boolean webcam) {
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.webcam = webcam;
    }
    
      
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    public void setModelo( String modelo) {
        this.modelo = modelo;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public boolean getWebcam() {
        return webcam;
    }

    public void setWebcam(boolean webcam) {
        this.webcam = webcam;
    }

    public void trabalhar() {
        System.out.println("Estou trabalhado");
    }

    public void programar() {
        System.out.println("Estou programando");
    }

    @Override
    public String toString() {
        return "\nMarca: " + this.marca
                + "\nModelo: " + this.modelo
                + "\nArmazenamento: " + this.armazenamento
                + "\nWebcam: " + this.webcam;

    }

}
