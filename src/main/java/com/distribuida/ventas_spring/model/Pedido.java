package com.distribuida.ventas_spring.model;

public class Pedido {

    private int idPedido;
    private int idCliente;
    private String fechaPedido;
    private String estado;
    private double iva;
    private double totalNeto;

    public Pedido() {}

    public Pedido(int idPedido, int idCliente, String fechaPedido, String estado,
                  double iva, double totalNeto) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.fechaPedido = fechaPedido;
        this.estado = estado;
        this.iva = iva;
        this.totalNeto = totalNeto;
    }

    // Getters y Setters
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotalNeto() {
        return totalNeto;
    }

    public void setTotalNeto(double totalNeto) {
        this.totalNeto = totalNeto;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", idCliente=" + idCliente +
                ", fechaPedido='" + fechaPedido + '\'' +
                ", estado='" + estado + '\'' +
                ", iva=" + iva +
                ", totalNeto=" + totalNeto +
                '}';
    }
}
