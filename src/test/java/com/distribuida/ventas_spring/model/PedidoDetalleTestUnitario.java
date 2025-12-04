package com.distribuida.ventas_spring.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoDetalleTestUnitario {

    private PedidoDetalle detalle;

    @BeforeEach
    public void setUp() {
        detalle = new PedidoDetalle(
                1,
                5,
                100,
                3,
                45.00
        );
    }

    @Test
    public void pedidoDetalleTestConstructor() {
        assertAll("Validar datos del PedidoDetalle - Constructor",
                () -> assertEquals(1, detalle.getIdDetalle()),
                () -> assertEquals(5, detalle.getIdPedido()),
                () -> assertEquals(100, detalle.getIdProducto()),
                () -> assertEquals(3, detalle.getCantidad()),
                () -> assertEquals(45.00, detalle.getSubtotal())
        );
    }

    @Test
    public void pedidoDetalleTestSetters() {
        detalle.setIdDetalle(2);
        detalle.setIdPedido(10);
        detalle.setIdProducto(200);
        detalle.setCantidad(6);
        detalle.setSubtotal(90.00);

        assertAll("Validar datos del PedidoDetalle - Setters",
                () -> assertEquals(2, detalle.getIdDetalle()),
                () -> assertEquals(10, detalle.getIdPedido()),
                () -> assertEquals(200, detalle.getIdProducto()),
                () -> assertEquals(6, detalle.getCantidad()),
                () -> assertEquals(90.00, detalle.getSubtotal())
        );
    }

    @Test
    public void pedidoDetalleTestToString() {
        String str = detalle.toString();

        assertAll("Validar datos del PedidoDetalle - toString",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("5")),
                () -> assertTrue(str.contains("100")),
                () -> assertTrue(str.contains("3")),
                () -> assertTrue(str.contains("45.0"))
        );
    }
}
