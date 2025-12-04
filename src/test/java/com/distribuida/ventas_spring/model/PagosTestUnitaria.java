package com.distribuida.ventas_spring.model;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PagosTestUnitaria {


    private Pagos pagos;
    private Pedido pedido;

    @BeforeEach
    public void setUp(){
        pedido =new Pedido(1,2,"19/5/2025","pagado",12.50,30.50);
        pagos = new Pagos(1,"Tarjeta",50,"20/09/2025",pedido);


    }


    @Test
    public void testPagosConstructor() {
        assertAll("Validar datos Pagos - Contructor",
                () -> assertEquals(1, pagos.getIdPago()),
                () -> assertEquals("Tarjeta", pagos.getMetodoPago()),
                () -> assertEquals(50, pagos.getMonto()),
                () -> assertEquals("20/09/2025",pagos.getFechaPago()),
                () -> assertEquals(pedido,pagos.getPedido())
        );
    }

}











