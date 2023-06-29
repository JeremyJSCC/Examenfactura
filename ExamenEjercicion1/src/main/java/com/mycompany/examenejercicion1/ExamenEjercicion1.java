/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenejercicion1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author jerjo
 */
public class ExamenEjercicion1 {

    public static void main(String[] args) {
        List<Deuda> listaDeudas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean ejecutar = true;
        while (ejecutar) {
            System.out.println("Ingrese los datos de la deuda:");
            System.out.print("Nombre del cliente: ");
            String nombre = scanner.nextLine();

            System.out.print("Cédula del cliente: ");
            String cedula = scanner.nextLine();

            System.out.print("Número de factura: ");
            String numeroFactura = scanner.nextLine();

            System.out.print("Monto factura: ");
            double montoFactura = scanner.nextDouble();

            System.out.print("Mes factura: ");
            int mesFactura = scanner.nextInt();

            System.out.print("Año  factura: ");
            int Year = scanner.nextInt();

            scanner.nextLine(); 

            Deuda deuda = new Deuda(nombre, cedula, numeroFactura, montoFactura, mesFactura, Year);
            listaDeudas.add(deuda);

            System.out.print("¿Desea ingresar otra deuda? (S/N): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("N")) {
                ejecutar = false;
            }
        }
        System.out.println("\nLista de deudas:");
        for (Deuda deuda : listaDeudas) {
            System.out.println(deuda.toString());
            int[] facturas = {2810, 2546};
            Cliente cliente = new Cliente(facturas);
            cliente.generarPlanPagos();
        }
 
    }
 }

