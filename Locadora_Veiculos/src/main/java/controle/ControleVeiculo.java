package controle;

import entidades.Veiculo;
import java.util.ArrayList;
import java.util.List;

public class ControleVeiculo {

    private List<Veiculo> veiculos = new ArrayList<>();

    public boolean incluirVeiculo(Veiculo v) {
        if (consultar(v.getId_veiculo()) != null) {
            return false;
        }
        veiculos.add(v);
        return true;
    }
    public List<Veiculo> listarVeiculos() {
        return veiculos;
    }
    public Veiculo consultar (int id_veiculo){
        for (Veiculo v: veiculos){
            if (v.getId_veiculo() == id_veiculo){
                return v;
            }
        }
        return null;
    }
    public boolean alterar(Veiculo veiculoAtualizado){
        for (int i = 0; i<veiculos.size(); i++){
            if (veiculos.get(i).getId_veiculo() == veiculoAtualizado.getId_veiculo()){
                veiculos.set(i, veiculoAtualizado);
                return true;
            }
        }
        return false;
    }
    public boolean excluir (int id_veiculo){
        for (int i = 0; i< veiculos.size(); i++){
            if (veiculos.get(i).getId_veiculo() == id_veiculo){
                veiculos.remove(i);
                return true;
            }
        }
        return false;
    }
}
