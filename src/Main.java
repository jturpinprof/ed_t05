public class Main {
    public static void main(String[] args) {
        // Crea un pedido para un cliente normal
        Pedido pedido1 = new Pedido(new Cliente(false, "Juan", 1));
        pedido1.procesarPedido(101);

        // Crea un pedido para un cliente VIP
        Pedido pedido2 = new Pedido(new Cliente(true, "Juan de todos los santos", 2));
        pedido2.procesarPedidoVIP(101);

        // Convierte al cliente 1 en VIP y procesa un nuevo pedido de 1000 €
        pedido1.cliente.esVip = true;
        pedido1.procesarPedidoVIP(1000);

    }
}
