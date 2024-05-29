import java.util.ArrayList;


public class Pedido {
    private Restaurante restaurante;
    private Cliente cliente;
    ArrayList<itemPedido> itens = new ArrayList<itemPedido>();
    private double precoTotal;

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public String getCliente() {
        return this.cliente.toString();
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void getItens() {
        for (itemPedido item : itens) {
            System.out.println(item);
        }
    }

    public void addItem(itemPedido item) {
        this.itens.add(item);
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    @Override
    public String toString() {
        String itensString = "";

        for (itemPedido item : itens) {
            itensString += item.toString() + "\n";
        }
        return "\nPedido\n" +
                "\tRestaurante: \n\t\t" + restaurante +
                "\n\tCliente: \n\t\t" + cliente +
                "\n\tItens: \n\t\t" + itensString +
                "\n\tPreço total: R$ " + precoTotal + "\n";
    }
}
