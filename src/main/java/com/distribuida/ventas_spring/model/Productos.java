package com.distribuida.ventas_spring.model;

public class Productos {
    private int id_producto;
    private String nombre;
    private double precio;
    private int stock;
    private String fecha_registro;
    private String estado;
    private int id_categoria;




    public Producto(int id_producto, String nombre, double precio, int stock, String fecha_registro, String estado, int id_categoria) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.fecha_registro = fecha_registro;
        this.estado = estado;
        this.id_categoria = id_categoria;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "id_producto=" + id_producto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", fecha_registro='" + fecha_registro + '\'' +
                ", estado='" + estado + '\'' +
                ", id_categoria=" + id_categoria +
                '}';
    }
}
