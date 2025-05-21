
package entidades;

public class Carro extends Veiculo {

     private int portas;
     private boolean arcond;
     private boolean automatico;
     private double motor;
     
    public Carro(int id_veiculo, String modelo, String placa, int ano, String cor, String combustivel, int portas, boolean arcond, boolean automatico, double motor) {
        super(id_veiculo, modelo, placa, ano, cor, combustivel);
         this.portas = portas;
         this.arcond = arcond;
         this.automatico = automatico;
         this.motor = motor;
    }
    
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
  
    public boolean isArcond() {
        return arcond;
    }

    public void setArcond(boolean arcond) {
        this.arcond = arcond;
    }

    public boolean isAutomatico() {
        return automatico;
    }
    
    public double getMotor() {
        return motor;
    }
    public void setMotor(double motor) {
        this.motor = motor;
    }
}
