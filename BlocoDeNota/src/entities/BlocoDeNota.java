package entities;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BlocoDeNota {
    private List<String> notas = new ArrayList<>();
    
    private List<String> getNota() {
        return this.notas;
    }    
    
    public void adicionarNota(String nota) {
        getNota().add(nota);
    }
    
    public void removerNota(String nota) {
        int pos = testaIgual(nota);
        getNota().remove(pos);
    }
    
    public void alterarNota(String oldNota, String newNota) {
        try{
            int pos = testaIgual(oldNota);
            getNota().set(pos, newNota);
        } catch(ArrayIndexOutOfBoundsException aioobe) {
            messageError("Error: " + oldNota + " não existe, por favor informar uma nota válida. ");
        }
    }
    
    public String listarNota() {
        return toString();
    }
    
    @Override
    public String toString() {
        if(!isEmpty())
            return "Notas: " + getNota();
        return "Lista está vázia.";
    }
    
    private void messageError(String messageError) {
        JOptionPane.showMessageDialog(null, messageError);
    }
    
    private boolean isEmpty() {
        if(getNota().isEmpty())
            return true;
        return false;
    }
    
    private int testaIgual(String nota) {
        for(int i = 0; i < getNota().size(); i++)
            if(getNota().get(i).equals(nota))
                return i;
        return -1;
    }
}
