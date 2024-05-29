import java.util.ArrayList;

public class Cliente extends Pessoa {
    private String endereco;
    private String email;
    ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPedidos() {
        int totalPedidos = pedidos.size();
        return totalPedidos;
    }

    public void addPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public String gerarRelatorio() {
        String pedidosString = "";
        for (Pedido pedido : pedidos) {
            pedidosString += pedido.toString() + "\n";
        }
        return "Cliente " + this.getNome() +
                " fez " + this.getPedidos() + " pedidos.\n\t" +
                "Pedidos:\n\t" + pedidosString;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() +
                ", Endereço: " + endereco +
                ", Email: " + email +
                ", CPF: " + this.getCpf() +
                ", Telefone: " + this.getTelefone();
    }
}
