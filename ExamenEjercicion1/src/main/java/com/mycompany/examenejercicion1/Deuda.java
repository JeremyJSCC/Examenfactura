/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenejercicion1;

/**
 *
 * @author jerjo
 */
public class Deuda {
    private String nombreCliente;
    private String cedulaCliente;
    private String numeroFactura;
    private double montoFactura;
    private int mesFactura;
    private int Year;
    private String estadoFactura;

    public Deuda(String nombreCliente, String cedulaCliente, String numeroFactura, double montoFactura, int mesFactura, int Year) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.numeroFactura = numeroFactura;
        this.montoFactura = montoFactura;
        this.mesFactura = mesFactura;
        this.Year = Year;
        this.estadoFactura = "No pagada";
    }
    public String toString() {
        return "Nombre del cliente: " + nombreCliente +
                "\nCédula del cliente: " + cedulaCliente +
                "\nNúmero de factura: " + numeroFactura +
                "\nMonto de la factura: " + montoFactura +
                "\nMes de la factura: " + mesFactura +
                "\nAño de la factura: " + Year +
                "\nEstado de la factura: " + estadoFactura +
                "\n";
    }
}
    
