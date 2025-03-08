/**
 * Clase principal que prueba la funcionalidad de Cliente y Pedido.
 */

public class Main {

    /**
     * Método principal que ejecuta la prueba de pedidos con clientes normales y VIP.
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Crea un pedido para un cliente normal
        Pedido pedido1 = new Pedido(new Cliente(false, "Juan", 1));
        pedido1.procesarPedido(101);

        // Crea un pedido para un cliente VIP
        Pedido pedido2 = new Pedido(new Cliente(true, "Juan de todos los santos", 2));
        pedido2.procesarPedido(101);

        // Convierte al cliente 1 en VIP y procesa un nuevo pedido de 1000 €
        pedido1.getCliente().setEsVip(true);
        pedido1.procesarPedido(1000);
    }
}
