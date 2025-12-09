package com.distribuida.ventas_spring.model;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PagosTestUnitaria {


    private Pagos pagos;

    @BeforeEach
    public void setUp(){
        pagos = new Pagos(1,"Tarjeta",50,"20/09/2025",10);


    }


    @Test
    public void testClienteConstructor() {
        assertAll("Validar datos Cliente - Contructor",
                () -> assertEquals(1, pagos.getIdPago()),
                () -> assertEquals("Tarjeta", pagos.getMetodoPago()),
                () -> assertEquals(50, pagos.getMonto()),
                () -> assertEquals("20/09/2025",pagos.getFechaPago()),
                () -> assertEquals(10,pagos.getPedido())
        );


    }
}











