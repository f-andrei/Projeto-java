public class Restaurante {
    private String nome;
    private String endereco;
    private String telefone;
    private String tipo;

    public Restaurante() {}

    public Restaurante(String nome, String endereco, String telefone, String tipo) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Endereço: " + endereco +
                ", Telefone: " + telefone +
                ", Tipo: " + tipo;
    }
}