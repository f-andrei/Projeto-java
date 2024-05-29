import java.util.ArrayList;
import java.util.List;

public class Entregador extends Pessoa {
    private String veiculo;
    private String placa;
    private String cnh;
    private String categoria;
    ArrayList<Entrega> entregas = new ArrayList<Entrega>();

    public Entregador() {}

    public Entregador(int id, String nome, String cpf, String telefone, String veiculo, String placa, String cnh, String categoria) {
        super(id, nome, cpf, telefone);
        this.veiculo = veiculo;
        this.placa = placa;
        this.cnh = cnh;
        this.categoria = categoria;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEntregas() {
        return this.entregas.size();
    }

    public void addEntrega(Entrega entrega) {
        this.entregas.add(entrega);
    }

    public String gerarRelatorio() {
        String entregasString = "";
        for (Entrega entrega : entregas) {
            entregasString += entrega.toString() + "\n";
        }
        return "Entregador " + this.getNome() +
                " fez " + this.getEntregas() + " entregas.\n\t" +
                "Entregas:\n\t" + entregasString;
    }


    @Override
    public String toString() {
        return "Entregador: " + this.getNome() +
                ", Veículo: " + veiculo +
                ", Placa: " + placa +
                ", CNH: " + cnh +
                ", Categoria: " + categoria +
                ", CPF: " + this.getCpf() +
                ", Telefone: " + this.getTelefone();
    }
}
