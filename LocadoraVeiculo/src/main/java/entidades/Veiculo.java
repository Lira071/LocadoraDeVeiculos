
package entidades;

public class Veiculo {
    private int id_veiculo;
    private String modelo;
    private String placa;
    private int ano;
    private String cor;
    private String combustivel;
    private double valorDiaria;
     
    public Veiculo (int id_veiculo, String modelo, String placa, int ano, String cor, String combustivel, double valorDiaria) {
        this.id_veiculo = id_veiculo;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
        this.combustivel = combustivel;
        this.valorDiaria = valorDiaria;
 }
    public int getId_veiculo() {
        return id_veiculo;
    }
    public void setId_veiculo(int id_veiculo) {
        this.id_veiculo = id_veiculo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;       
  }
 }

