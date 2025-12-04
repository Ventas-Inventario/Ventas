package com.distribuida.ventas_spring.model;

public class Pagos {

    private int idPago;

    private String metodoPago;
    private double monto;
    private String fechaPago;

    private Pedido pedido;

    public Pagos(int idPago, String metodoPago, double monto, String fechaPago, Pedido pedido) {
        this.idPago = idPago;
        this.metodoPago = metodoPago;
        this.monto = monto;
        this.fechaPago = fechaPago;
        this.pedido = pedido;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Pagos{" +
                "idPago=" + idPago +
                ", metodoPago='" + metodoPago + '\'' +
                ", monto=" + monto +
                ", fechaPago='" + fechaPago + '\'' +
                ", pedido=" + pedido +
                '}';
    }
}
