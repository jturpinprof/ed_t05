/**
 * Representa un pedido realizado por un cliente.
 */
public class Pedido {
    private Cliente cliente;

    /**
     * Constructor de la clase Pedido.
     * @param cliente Cliente asociado al pedido.
     */
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene el cliente asociado al pedido.
     * @return Cliente que realizó el pedido.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Asigna un cliente al pedido.
     * @param cliente Nuevo cliente asociado al pedido.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Procesa el pedido y aplica un descuento basado en el monto total y el estado VIP del cliente.
     * Si el total es mayor a 100, se aplica un 10% de descuento para clientes normales y un 15% para clientes VIP.
     * @param total Monto total del pedido antes del descuento.
     */
    public void procesarPedido(double total) {
        double descuento = total > 100 ? total * (cliente.isEsVip() ? 0.15 : 0.10) : 0;
        double precioFinal = total - descuento;
        System.out.println("Pedido " + (cliente.isEsVip() ? "VIP " : "") + "aprobado. Total: " + precioFinal + " (descuento aplicado: " + descuento + ")");
    }
}
