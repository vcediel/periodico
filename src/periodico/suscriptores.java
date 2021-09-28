package periodico;

public class suscriptores {

    private long codigo;/*long = es un entero largo ; int= entero corto va hasta 32.000*/
    private boolean estado;
    private int periodicidad;
    private int valorSubscripcion;

    suscriptores() {
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(int periodicidad) {
        this.periodicidad = periodicidad;
    }

    public int getValorSubscripcion() {
        return valorSubscripcion;
    }

    public void setValorSubscripcion(int valorSubscripcion) {
        this.valorSubscripcion = valorSubscripcion;
    }

    public suscriptores(long codigo, boolean estado, int periodicidad, int valorSubscripcion) {
        this.codigo = codigo;
        this.estado = estado;
        this.periodicidad = periodicidad;
        this.valorSubscripcion = valorSubscripcion;
    }

    public void estado() {
        if (estado) {
            System.out.println("Su estado de subscripcion es suspendido.");
        } else {
            switch (periodicidad) {
                case 1:
                    System.out.println("Su tipo de suscripcion es mensual.");
                    break;
                case 2:
                    System.out.println("Su tipo de suscripcion es trimestral.");
                    break;
                case 3:
                    System.out.println("Su tipo de suscripcion es semestral.");
                    break;
                case 4:
                    System.out.println("Su tipo de suscripcion es anual.");
                    break;
                default:
                    System.out.println("Opción no encontrada.");
                    break;
            }

        }
    }

    public int calcular_pago() {
        int tarifa;
        if (this.periodicidad == 1) {/* this se utiliza para referirse a los atributos y hacer la operacion*/
            tarifa = 30000;
        }
        if (this.periodicidad == 2) {
            tarifa = 70000;
        }
        if (this.periodicidad == 3) {
            tarifa = 150000;
        } else {
            tarifa = 270000;
        }
        return tarifa;
    }

    boolean estado_cliente() {
        return false;
    }
}
