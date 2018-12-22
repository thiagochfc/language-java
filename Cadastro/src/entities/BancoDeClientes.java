package entities;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BancoDeClientes {
    private List<Cliente> clientes = new ArrayList<>();
    
    private List<Cliente> getClientes() {
        return this.clientes;
    }
    
    public int incrementar() {
        return contarQuantidade();
        
    }
    
    public void inserirCliente(Cliente cliente) {
        getClientes().add(cliente);
    }
    
    public void removerCliente(String cliente) {
        int pos = testaIgual(cliente);
        getClientes().remove(pos);
    }
    
    public void alterarCliente(Integer id, String nome, String fone) {
        try {
            int pos = testaIgual(id);
            getClientes().get(pos).setNome(nome);
            getClientes().get(pos).setFone(fone);
        } catch(ArrayIndexOutOfBoundsException aioobe) {
            errorMessage("ID " + id + ", não existe.");
        }
    }
    
    public String listarUmCliente(String nome) {
        try {
            int pos = testaIgual(nome);
            return getClientes().get(pos).toString();
        } catch(ArrayIndexOutOfBoundsException aioobe) {
            return "Lista está vázia.";
        }
    }
    
    public String listarClientes() {
        return toString();
    }

    @Override
    public String toString() {
        return "Clientes: \n" + getClientes();
    }
    
    private void errorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(null, "Error: " + errorMessage);
    }
    
    private Integer contarQuantidade() {
        int count = 0;
        for(int i = 0; i < getClientes().size(); i++)
            count++;
        return count+=1;
    }
    
    private Integer testaIgual(Integer id) {
        for(int i = 0; i < getClientes().size(); i++)
            if(getClientes().get(i).getId().equals(id))
                return i;
        return -1;
    }
    
    private Integer testaIgual(String cliente) {
        for(int i = 0; i < getClientes().size(); i++)
            if(getClientes().get(i).getNome().equals(cliente))
                return i;
        return -1;
    }   
}
