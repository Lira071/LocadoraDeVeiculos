


package entidades;
 import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Aluguel {
    private int id_aluguel;
    private Cliente cliente;
    private Veiculo veiculo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private double valorDiaria;
    private double valorTotal;
    private String status;
    
    public Aluguel(int id_aluguel,Cliente cliente,Veiculo veiculo,LocalDate dataInicio,LocalDate dataFim,double valorDiaria,double valorTotal,String status ){
        this.id_aluguel= id_aluguel;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataInicio =  dataInicio;
        this.dataFim = dataFim;
        this.valorDiaria = valorDiaria;
        this.valorTotal = calcularTotal();
        this.status = status;
                 
    }
    private double calcularTotal (){
        long dias = ChronoUnit.DAYS.between(dataInicio, dataFim);
        return dias * valorDiaria;
        
    }

    public int getId_aluguel() {
        return id_aluguel;
    }

    public void setId_aluguel(int id_aluguel) {
        this.id_aluguel = id_aluguel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
     
}
