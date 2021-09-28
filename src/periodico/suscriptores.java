
package periodico;


public class suscriptores {
    private long codigo;/*long = es un entero largo ; int= entero corto va hasta 32.000*/
    private boolean estado;
    private int periodicidad;
    private int valorSubscripcion;

    suscriptores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    boolean v = true;
    boolean s = false;
    
    public boolean estado(){
        if (estado==s) {
                     System.out.println("Su estado de subscripcion es suspendido");
        } else  {
                    System.out.println("Su tipo de suscripcion es(1= Mensual, 2=Trimestral, 3=Semestral, 4=Anual) :");                    
                }
        return estado;
    }
    
    
    public int calcular_pago(){
        int tarifa;
        if (this.periodicidad==1){/* this se utiliza para referirse a los atributos y hacer la operacion*/
            tarifa= 30000;
        }
        if (this.periodicidad==2){
            tarifa=70000;
        }
        if (this.periodicidad==3){
            tarifa=150000;
        }
        else {
            tarifa=270000;
        }
        return tarifa;
    }   
    
   
    boolean estado_cliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    
    

