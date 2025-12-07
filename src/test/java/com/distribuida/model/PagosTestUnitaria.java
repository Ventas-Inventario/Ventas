package com.distribuida.model;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PagosTestUnitaria {


    private Pagos pagos;


    @BeforeEach
    public void setUp(){

        pagos = new Pagos(1,"Tarjeta",50,"20/09/2025");


    }


    @Test
    public void testPagosConstructor() {
        assertAll("Validar datos Pagos - Contructor",
                () -> assertEquals(1, pagos.getIdPago()),
                () -> assertEquals("Tarjeta", pagos.getMetodoPago()),
                () -> assertEquals(50, pagos.getMonto()),
                () -> assertEquals("20/09/2025",pagos.getFechaPago())

        );
    }

}











