package entities;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Deposito {
    private List<Caixa> caixas = new ArrayList<>();
    
    private List<Caixa> getCaixas() {
        return this.caixas;
    }
    
    public void adicionarCaixa(Caixa caixa) {
        getCaixas().add(caixa);
    }
    
    public void removerCaixa(String dono) {
        int pos = testarIgual(dono);
        getCaixas().remove(pos);
    }
    
    public Integer encontrarPorDono(String dono) {
        return testarIgual(dono);
    }
    
    public void mudarCorredorPosicaoPorDono(String dono, String corredor, Integer posicao) {
        int pos = testarIgual(dono);
        getCaixas().get(pos).setCorredor(corredor);
        getCaixas().get(pos).setPosicao(posicao);
    }
    
    public void caixaPesaMaisQue(Double peso) {
        for(Caixa cx : getCaixas())
            if(cx.getPeso() >= peso)
                teste(cx.getPeso());
    }
    
    @Override
    public String toString() {
        return "Caixa: " + getCaixas();
    }
    
    private void teste(Double peso) {
        JOptionPane.showMessageDialog(null, peso);
    }
    
    private int testarIgual(String dono) {
        for(int i = 0; i < getCaixas().size(); i++)
            if(getCaixas().get(i).getDono().equals(dono))
                return i;
        return -1;
    }
}