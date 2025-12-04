package com.distribuida.ventas_spring.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

public class PagosTestUnitaria {

import static org.junit.jupiter.api.Assertions.*;

    public class PagosTestUnitaria {

        private Pagos pagos;

        @BeforeEach
        public void setUp() {
            pagos = new Pagos(
                    1,          // id_pago
                    10,         // id_pedido
                    "Tarjeta",  // metodo_pago
                    50.75,      // monto
                    "2025-12-03 19:45:00" // fecha_pago
            );
        }

        @Test
        public void testPagosConstructor() {
            assertAll("Validar datos Pagos - Constructor",
                    () -> assertEquals(1, pagos.getId_pago()),
                    () -> assertEquals(10, pagos.getId_pedido()),
                    () -> assertEquals("Tarjeta", pagos.getMetodo_pago()),
                    () -> assertEquals(50.75, pagos.getMonto()),
                    () -> assertEquals("2025-12-03 19:45:00", pagos.getFecha_pago())
            );
        }
    }


}
