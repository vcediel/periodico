package periodico;

import java.util.Scanner;

public class Periodico {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int n, codigo, valorSubscripcion, periodicidad;
        boolean estado = false;
        boolean tiempo_pago = false;
        long total = 0, suma = 0;

        suscriptores obj_tarifa;
        System.out.println("Cantitdad de suscriptores: ");
        n = consola.nextInt();
        total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Codigo del suscriptor: ");
            codigo = consola.nextInt();
            System.out.println("Estado del suscriptor(v = Vigente, S =suspendido) :");
            String tipo = consola.next();
            while (!tipo.toLowerCase().equals("v") && !tipo.toLowerCase().equals("s")) {
                if (tipo.toLowerCase().equals("v") || tipo.toLowerCase().equals("s")) {
                    estado = consola.next().equals("v");
                } else {
                    System.out.println("Opción incorrecta.");
                }
                tipo = consola.next();
            }
            System.out.println("Frecuencia de pago (1 = Mensual, 2 = Trimestral, 3 = Semestral, 4 = Anual)");
            int frecuencia = consola.nextInt();
            while (frecuencia < 1 && frecuencia > 4) {
                if (frecuencia >= 1 && frecuencia <= 4) {
                    periodicidad = frecuencia;
                } else {
                    System.out.println("Opción incorrecta.");
                }
                frecuencia = consola.nextInt();
            }
            periodicidad = frecuencia;
            obj_tarifa = new suscriptores(codigo, estado, periodicidad, 0);
            obj_tarifa.estado();
            System.out.println(obj_tarifa.calcular_pago());
            suma += obj_tarifa.calcular_pago();
            tiempo_pago = obj_tarifa.estado_cliente();
        }
        System.out.println("La suma es: " + suma);
    }
}
