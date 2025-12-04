package com.distribuida.ventas_spring.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTestUnitaria {
private Cliente cliente;
@BeforeEach
    public void setUp(){
cliente = new Cliente(1, "Anthony","Abad", "anthony@gmail.com", "0999252904", "Tumbaco", new Date() );
}

    @Test

    public void testClienteConstructor(){

        assertAll("Validar datos cliente - constructor",
                () -> assertEquals(1, cliente.getIdCliente()) ,
                () -> assertEquals("Anthony", cliente.getNombre()) ,
                () -> assertEquals("Abad", cliente.getApellido()) ,
                () -> assertEquals("anthony@gmail.com", cliente.getEmail()) ,
                () -> assertEquals("0999252904", cliente.getTelefono() ),
                () -> assertEquals("Tumbaco", cliente.getDireccion())

        );
    }
}
