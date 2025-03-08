public class Pedido {
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void procesarPedido(double total) {
        double descuento = total > 100 ? total * (cliente.isEsVip() ? 0.15 : 0.10) : 0;
        double precioFinal = total - descuento;
        System.out.println("Pedido " + (cliente.isEsVip() ? "VIP " : "") + "aprobado. Total: " + precioFinal + " (descuento aplicado: " + descuento + ")");
    }
}
