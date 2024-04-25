package ui;

import entidades.*;
import java.util.Scanner; 
import java.util.ArrayList;



public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ArrayList <Empleado> empleados = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            System.out.println("Empleado #" + (i + 1));
            System.out.println("¿Es administrativo o vendedor? (a/v): ");
            String tipo = lector.nextLine();

            System.out.println("Ingrese DNI: ");
            String dni = lector.nextLine();
            System.out.println("Ingrese Nombre: ");
            String nombre = lector.nextLine();
            System.out.println("Ingrese Apellido: ");
            String apellido = lector.nextLine();
            System.out.println("Ingrese Email: ");
            String email = lector.nextLine();
            System.out.println("Ingrese Sueldo Base: ");
            double sueldoBase = Double.parseDouble(lector.nextLine());

            if (tipo.equalsIgnoreCase("a")) {
                System.out.println("Ingrese Horas Extras: ");
                int hsExtra = Integer.parseInt(lector.nextLine());
                System.out.println("Ingrese Horas del Mes: ");
                int hsMes = Integer.parseInt(lector.nextLine());
                empleados.add(new Administrativo(dni, nombre, apellido, email, sueldoBase, hsExtra, hsMes));
            } else if (tipo.equalsIgnoreCase("v")) {
                System.out.println("Ingrese Porcentaje de Comisión: ");
                double porcenComision = Double.parseDouble(lector.nextLine());
                System.out.println("Ingrese Total de Ventas: ");
                double totalVentas = Double.parseDouble(lector.nextLine());
                empleados.add(new Vendedor(dni, nombre, apellido, email, sueldoBase, porcenComision, totalVentas));
            } else {
                System.out.println("Tipo de empleado no válido.");
                i--; 
            }
        }
        lector.close();
        System.out.println("Lista de Empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
}