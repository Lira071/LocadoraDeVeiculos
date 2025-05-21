
package entidades;

public class Moto extends Veiculo {
    private int cilindradas;
    private boolean partidaEletrica;
    private boolean bau;
    private String tipoMoto;
    private String freio;
    
    public Moto(int id_veiculo, String modelo, String placa, int ano, String cor, String combustivel, int cilindradas, boolean partidaEletrica, boolean bau, String tipoMoto, String freio) {
        super(id_veiculo, modelo, placa, ano, cor, combustivel );
        
        this.cilindradas = cilindradas;
        this.partidaEletrica = partidaEletrica;
        this.bau = bau;
        this.tipoMoto = tipoMoto;
        this.freio = freio;
    }

    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }
    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }
    public boolean isBau() {
        return bau;
    }
    public void setBau(boolean bau) {
        this.bau = bau;
    }
    public String getTipoMoto() {
        return tipoMoto;
    }
    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }
    public String getFreio() {
        return freio;
    }
    public void setFreio(String freio) {
        this.freio = freio;
    } 
}
