public class Pedido {
    public Cliente cliente;
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void procesarPedido(double total) {
        if (total > 100) {
            double descuento = total * 0.10;
            double precioFinal = total - descuento;
            System.out.println("Pedido aprobado. Total: " + precioFinal + " (descuento aplicado: " + descuento + ")");
        } else {
            System.out.println("Pedido aprobado. Total: " + total);
        }
    }
    public void procesarPedidoVIP(double total) {
        if (total > 100) {
            double descuento = total * 0.15;
            double precioFinal = total - descuento;
            System.out.println("Pedido VIP aprobado. Total: " + precioFinal + " (descuento aplicado: " + descuento + ")");
        } else {
            System.out.println("Pedido VIP aprobado. Total: " + total);
        }
    }
}
