package entities;

public class Cliente {
    private Integer id;
    private String nome;
    private String fone;

    public Cliente(Integer id, String nome, String fone) {
        this.id = id;
        this.nome = nome;
        this.fone = fone;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    @Override
    public String toString() {
        return "Id: " + getId() + ", "+
               "Nome: " + getNome() + ", " +
               "Telefone: " + getFone();
    }    
}
