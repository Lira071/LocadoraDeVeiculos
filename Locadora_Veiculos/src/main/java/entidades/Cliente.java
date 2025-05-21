
package entidades;
import java.util.Date;

public class Cliente {
    private int id_cliente;
    private String nome;
    private Date dataNasc;
    private String cpf;
    private String cnh;
    private String tel;
    private String email;
    private String endereco;
    
    public Cliente (int id_cliente, String nome, Date dataNasc, String cpf, String cnh, String tel, String email, String endereco ){
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.cnh = cnh;
        this.tel = tel;
        this.email = email;
        this.endereco = endereco;
    }

    public int getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    } 
}
