
package controle;
import entidades.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Devolucao {
     private int id; 
     private Aluguel aluguel;
     private LocalDate dataDevolucao;
     private double multa;
     
        
     public Devolucao (int id, Aluguel aluguel, LocalDate dataDevolucao, double multa){
        this.id = id;
        this.aluguel = aluguel;
        this.dataDevolucao = dataDevolucao;
        this.multa = multa;
         
     }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public Aluguel getAluguel() {
        return aluguel;
    }
   
    public void setAluguel(Aluguel aluguel) {
        this.aluguel = aluguel;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }
    public double calcularMulta (){
    LocalDate dataFim = aluguel.getDataFim();
    LocalDateTime devolucao = this.dataDevolucao.atStartOfDay();
    
    long horasAtraso = ChronoUnit.HOURS.between (dataFim.atStartOfDay(), devolucao);
    
    if (aluguel == null || aluguel.getVeiculo() == null || dataDevolucao == null) {
        return 0.0;
    }
    
            
    if (horasAtraso > 3) {
        double diaria = aluguel.getVeiculo().getValorDiaria();
        return diaria + (0.2*diaria);
    }
    
    else {
        return 0.0;
    }
  }
 
 }
