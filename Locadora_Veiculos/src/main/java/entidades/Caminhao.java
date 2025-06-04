
package entidades;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;
    private String carroceria;
    private double largura;
    private double comprimento;
    private double altura;
    private double capacidadeCabine;
    private double motor;
    private int potencia;
    
    public Caminhao(int id_veiculo, String modelo, String placa, int ano, String cor, String combustivel,double valorDiaria, double capacidadeCarga, String carroceria, double largura, double comprimento, double altura, double capacidadeCabine, double motor, int potencia) {
        super(id_veiculo, modelo, placa, ano, cor,combustivel, valorDiaria);
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

  
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getCapacidadeCabine() {
        return capacidadeCabine;
    }

    public void setCapacidadeCabine(double capacidadeCabine) {
        this.capacidadeCabine = capacidadeCabine;
    }

    public double getMotor() {
        return motor;
    }
    
    public void setMotor(double motor) {
        this.motor = motor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
}
