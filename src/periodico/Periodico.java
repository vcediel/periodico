
package periodico;

import java.util.Scanner;


public class Periodico {

   
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        int n, codigo, valorSubscripcion ,periodicidad;
        boolean estado, tiempo_pago;
        long total, suma;
        
        suscriptores obj_tarifa;
        System.out.println("Cantitdad de suscriptores: ");
        n=consola.nextInt();
        total=0;
        
        
        
        for(int i=1;i<=n;i++){
            System.out.println("Codigo del suscriptor: ");
            codigo=consola.nextInt();
            System.out.println("Estado del suscriptor(v = Vigente, S =suspendido) :");
            estado=consola.nextBoolean();
            obj_tarifa  = new suscriptores();       
       
            tiempo_pago=obj_tarifa.estado_cliente();
        }
        
        
        
        
        
           /* boolean v = true;
            boolean s = false;
                if (estado==s) {
                     System.out.println("Su estado de subscripcion es suspendido");
                } else  {
                    System.out.println("Tipo de suscripcion (1= Mensual, 2=Trimestral, 3=Semestral, 4=Anual) :");                    
                }
                tarifa_subscritor=new suscriptores();
                tarifa_subscritor.calcular_pago();*/
            
                
            
            
        
        
        
        
        
        
        
        
    }
    }
    

