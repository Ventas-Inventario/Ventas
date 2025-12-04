package com.distribuida.ventas_spring.model;

public class MovimientoInventario {


        private int idMovimiento;
        private String tipoMovimiento;
        private int cantidad;
        private String fechaMovimiento;
        private String descripcion;

        private Pedido pedido;

    public MovimientoInventario(int idMovimiento, String tipoMovimiento, int cantidad, String fechaMovimiento, String descripcion, Pedido pedido) {
        this.idMovimiento = idMovimiento;
        this.tipoMovimiento = tipoMovimiento;
        this.cantidad = cantidad;
        this.fechaMovimiento = fechaMovimiento;
        this.descripcion = descripcion;
        this.pedido = pedido;
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(String fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "MovimientoInventario{" +
                "idMovimiento=" + idMovimiento +
                ", tipoMovimiento='" + tipoMovimiento + '\'' +
                ", cantidad=" + cantidad +
                ", fechaMovimiento='" + fechaMovimiento + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", pedido=" + pedido +
                '}';
    }
}

