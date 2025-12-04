package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTestUnitario {

    private Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido(
                1,
                10,
                "2025-01-01",
                "PENDIENTE",
                12.5,
                150.75
        );
    }

    @Test
    public void pedidoTestConstructor() {
        assertAll("Validar datos del Pedido - Constructor",
                () -> assertEquals(1, pedido.getIdPedido()),
                () -> assertEquals(10, pedido.getIdCliente()),
                () -> assertEquals("2025-01-01", pedido.getFechaPedido()),
                () -> assertEquals("PENDIENTE", pedido.getEstado()),
                () -> assertEquals(12.5, pedido.getIva()),
                () -> assertEquals(150.75, pedido.getTotalNeto())
        );
    }

    @Test
    public void pedidoTestSetters() {
        pedido.setIdPedido(2);
        pedido.setIdCliente(20);
        pedido.setFechaPedido("2025-02-02");
        pedido.setEstado("ENTREGADO");
        pedido.setIva(10.0);
        pedido.setTotalNeto(200.50);

        assertAll("Validar datos del Pedido - Setters",
                () -> assertEquals(2, pedido.getIdPedido()),
                () -> assertEquals(20, pedido.getIdCliente()),
                () -> assertEquals("2025-02-02", pedido.getFechaPedido()),
                () -> assertEquals("ENTREGADO", pedido.getEstado()),
                () -> assertEquals(10.0, pedido.getIva()),
                () -> assertEquals(200.50, pedido.getTotalNeto())
        );
    }

    @Test
    public void pedidoTestToString() {
        String str = pedido.toString();

        assertAll("Validar datos del Pedido - toString",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("10")),
                () -> assertTrue(str.contains("2025-01-01")),
                () -> assertTrue(str.contains("PENDIENTE")),
                () -> assertTrue(str.contains("12.5")),
                () -> assertTrue(str.contains("150.75"))
        );
    }
}
