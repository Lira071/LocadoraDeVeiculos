
package entidades;

public class Carro extends Veiculo {

     private int qtdPortas;
     private boolean arcondi;
     private boolean automatico;
     private double potMotor;
     
    public Carro(int id_veiculo, String modelo, String placa, int ano, String cor, String combustivel, int qtdPortas, boolean arcondi, boolean automatico, double potMotor) {
        super(id_veiculo, modelo, placa, ano, cor, combustivel);
         this.qtdPortas = qtdPortas;
         this.arcondi = arcondi;
         this.automatico = automatico;
         this.potMotor = potMotor;
    }
    
    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
  
    public boolean isArcondi() {
        return arcondi;
    }

    public void setArcondi(boolean arcondi) {
        this.arcondi = arcondi;
    }

    public boolean isAutomatico() {
        return automatico;
    }
    
    public double getPotMotor() {
        return potMotor;
    }
    public void setPotMotor(double potMotor) {
        this.potMotor = potMotor;
    }
}
