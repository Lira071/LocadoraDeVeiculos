
package controle;
import entidades.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ControleCliente {
    private List<Cliente> clientes = new ArrayList<>();
    
    public void incluirCliente(Cliente c){
        clientes.add(c);  
    }
    public List<Cliente> imprimir(){
        return clientes;
    }
    public Cliente consultar (int id_cliente){
        for ( int i=0; i<clientes.size(); i++){
            Cliente c = clientes.get(i);
            if(c.getId_cliente()== id_cliente){
             return c;   
            } 
        } return null;  
    }
    public boolean alterar(Cliente clienteAtualizado){
        for (int i=0; i<clientes.size(); i++){
            if(clientes.get(i).getId_cliente()== clienteAtualizado.getId_cliente()){
                clientes.set(i, clienteAtualizado);
                return true; 
            }
        }
        return false;
    }
    public boolean excluir(int id_cliente){
        for ( int i =0; i<clientes.size(); i++){
            if(clientes.get(i).getId_cliente()== id_cliente){
                clientes.remove(i);
                return true;
            }
        } return false;
    }
}
              
 
