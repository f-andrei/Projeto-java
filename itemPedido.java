public class itemPedido {
    private String nome;
    private double preco;
    private int quantidade;
    private double subTotal;

    public itemPedido() {}

    public itemPedido(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.subTotal = preco * quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getSubTotal() {
        return this.getPreco() * this.getQuantidade();
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Preço: " + preco +
                ", Quantidade: " + quantidade +
                ", Subtotal: " + getSubTotal();
    }
}
