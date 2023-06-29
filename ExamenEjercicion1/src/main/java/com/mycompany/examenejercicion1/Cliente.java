/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenejercicion1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author jerjo
 */
public class Cliente {
private int[] facturas;
    private double deudaTotal;
    private double cuotaMensual;
    private LocalDate fechaInicioPago;

    public Cliente(int[] facturas) {
        this.facturas = facturas;
        calcularDeudaTotal();
        calcularCuotaMensual();
        fechaInicioPago = LocalDate.of(2023, 7, 1);
    }

    private void calcularDeudaTotal() {
        for (int factura : facturas) {
            deudaTotal += factura;
        }
    }

    private void calcularCuotaMensual() {
        cuotaMensual = (deudaTotal * 0.05 + deudaTotal) / 6;
    }

    public void generarPlanPagos() {
        LocalDate fechaPago = fechaInicioPago;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy");

        for (int i = 1; i <= 6; i++) {
            System.out.println("Cuota " + i + ": $" + cuotaMensual + " Fecha de pago: " + fechaPago.format(formatter));
            fechaPago = fechaPago.plusMonths(1);
        }
    }
    
}
