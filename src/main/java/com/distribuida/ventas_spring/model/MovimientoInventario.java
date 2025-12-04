package com.distribuida.ventas_spring.model;

public class MovimientoInventario {


        private int idMovimiento;
        private int idProducto;
        private String tipoMovimiento;   // ENTRADA o SALIDA
        private int cantidad;
        private String fechaMovimiento;
        private String descripcion;

        public MovimientoInventario() {}

        public MovimientoInventario(int idMovimiento, int idProducto, String tipoMovimiento,
                                    int cantidad, String fechaMovimiento, String descripcion) {
            this.idMovimiento = idMovimiento;
            this.idProducto = idProducto;
            this.tipoMovimiento = tipoMovimiento;
            this.cantidad = cantidad;
            this.fechaMovimiento = fechaMovimiento;
            this.descripcion = descripcion;
        }

        // Getters y Setters
        public int getIdMovimiento() {
            return idMovimiento;
        }

        public void setIdMovimiento(int idMovimiento) {
            this.idMovimiento = idMovimiento;
        }

        public int getIdProducto() {
            return idProducto;
        }

        public void setIdProducto(int idProducto) {
            this.idProducto = idProducto;
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

        @Override
        public String toString() {
            return "MovimientoInventario{" +
                    "idMovimiento=" + idMovimiento +
                    ", idProducto=" + idProducto +
                    ", tipoMovimiento='" + tipoMovimiento + '\'' +
                    ", cantidad=" + cantidad +
                    ", fechaMovimiento='" + fechaMovimiento + '\'' +
                    ", descripcion='" + descripcion + '\'' +
                    '}';
        }
    }

