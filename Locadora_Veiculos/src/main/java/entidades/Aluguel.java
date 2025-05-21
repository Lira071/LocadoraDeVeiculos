


package entidades;
 import java.math.BigDecimal;
 import java.time.LocalDateTime;
 import java.time.temporal.ChronoUnit;

public class Aluguel {
    private int id_aluguel;
    private Cliente cliente;
    private Veiculo veiculo;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private BigDecimal valorDiaria;
    private BigDecimal valorTotal;
    private String status;

    public Aluguel(int id_aluguel,Cliente cliente,Veiculo veiculo,LocalDateTime dataInicio,LocalDateTime dataFim,BigDecimal valorDiaria,BigDecimal valorTotal,String status ){
        this.id_aluguel= id_aluguel;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataInicio =  dataInicio;
        this.dataFim = dataFim;
        this.valorDiaria = valorDiaria;
        this.valorTotal = calcularTotal();
        this.status = status;

    }
    private BigDecimal calcularTotal (){
        long dias = dataInicio.until(dataFim, ChronoUnit.DAYS);

        if (dataFim.getHour() > 12) {
            dias = dias + 1;
        }

        return BigDecimal.valueOf(dias * valorDiaria.doubleValue());

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

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public BigDecimal getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(BigDecimal valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
