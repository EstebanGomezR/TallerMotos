import java.util.Scanner;
public class TallerMotos
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        UsuarioMoto usuarioMoto = new UsuarioMoto();
        String identificacion, nombre, placa;
        double precioRepuestos, precioMantenimiento;
        double totalPago = 0;
            System.out.println("Digite la identificacion del usuario: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del usuairo: ");
            nombre = sc.next();
            System.out.println("Digite la placa de la moto: ");
            placa = sc.next();
            System.out.println("Digite el precio de los repuestos: ");
            precioRepuestos = sc.nextDouble();
            System.out.println("Digite el precio del mantenimiento: ");
            precioMantenimiento = sc.nextDouble();
            totalPago = precioRepuestos  + precioMantenimiento;
         System.out.println("El precio total del servicio es de : " + totalPago);
    
    }    
}
