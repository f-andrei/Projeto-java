public class Entrega {
    private String data;
    private String hora;
    private String status;
    private Pedido pedido;
    private double valor;

    public Entrega() {
    }

    public Entrega(String data, String hora, String status, Pedido pedido, double valor) {
        this.data = data;
        this.hora = hora;
        this.status = status;
        this.pedido = pedido;
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Data: " + data +
                ", Hora: " + hora +
                ", Status: " + status +
                ", Valor: R$ " + valor +
                "\n" + pedido;
    }
}
