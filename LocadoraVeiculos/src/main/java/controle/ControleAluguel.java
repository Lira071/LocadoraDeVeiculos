
package controle;
import entidades.Aluguel;
import entidades.StatusAluguel;
import java.util.ArrayList;
import java.util.List;

public class ControleAluguel {
    private List<Aluguel> alugueis = new ArrayList<>();
    
    public void incluirAluguel(Aluguel a) {
        alugueis.add(a);
    }
    public Aluguel buscarAluguel(int id_aluguel) {
        for (Aluguel a : alugueis) {
            if (a.getId_aluguel() == id_aluguel) {
                return a;
            }
        }
        return null;
    }
    public List<Aluguel> ListarAlugueis() {
        return alugueis;
    }
    public List<Aluguel> listarPorStatus(StatusAluguel status) {
        List<Aluguel> resultado = new ArrayList<>();
        for (Aluguel a : alugueis) {
            if (status == a.getStatus()) {
                resultado.add(a);
            }
        }
        return resultado;
    }
    public void atualizarStatus(int id_aluguel, StatusAluguel novoStatus) {
        Aluguel a = buscarAluguel(id_aluguel);
        if (a != null) {
            a.setStatus(novoStatus);
        }
    }
    public double calcularTotalArrecadado() {
        double total = 0;
        for (Aluguel a : alugueis) {
            total += a.getValorTotal();
        }
        return total;
    }
     public boolean excluir(int id_aluguel){
        for ( int i =0; i<alugueis.size(); i++){
            if(alugueis.get(i).getId_aluguel()== id_aluguel){
                alugueis.remove(i);
                return true;
            }
        } return false;
    }
    
}