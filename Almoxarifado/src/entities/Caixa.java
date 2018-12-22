package entities;

public class Caixa {
    private String dono;
    private String corredor;
    private Integer posicao;
    private Double peso;

    public Caixa(String dono, String corredor, Integer posicao, Double peso) {
        this.dono = dono;
        this.corredor = corredor;
        this.posicao = posicao;
        this.peso = peso;
    }
    
    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getCorredor() {
        return corredor;
    }

    public void setCorredor(String corredor) {
        this.corredor = corredor;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Dono: " + getDono() + 
               ", Corredor: " + getCorredor() + 
               ", Posicao: " + getPosicao() + 
               ", Peso: " + String.format("%.2f", getPeso()) + "\n";
    }
}
