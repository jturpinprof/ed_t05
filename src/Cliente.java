/**
 * Representa un cliente con identificador, nombre y estado VIP.
 */
public class Cliente {
    private boolean esVip;
    private String nombre;
    private int id;

    /**
     * Constructor de la clase Cliente.
     * @param vip Indica si el cliente es VIP.
     * @param nombre Nombre del cliente.
     * @param id Identificador único del cliente.
     */
    public Cliente(boolean vip, String nombre, int id) {
        this.esVip = vip;
        this.nombre = nombre;
        this.id = id;
    }

    /**
     * Verifica si el cliente es VIP.
     * @return true si el cliente es VIP, false en caso contrario.
     */
    public boolean isEsVip() {
        return esVip;
    }

    /**
     * Establece el estado VIP del cliente.
     * @param esVip true si el cliente debe ser VIP, false en caso contrario.
     */
    public void setEsVip(boolean esVip) {
        this.esVip = esVip;
    }

    /**
     * Obtiene el nombre del cliente.
     * @return Nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     * @param nombre Nuevo nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el identificador único del cliente.
     * @return Identificador del cliente.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único del cliente.
     * @param id Nuevo identificador del cliente.
     */
    public void setId(int id) {
        this.id = id;
    }
}
