package com.distribuida.dao;

import com.distribuida.model.Cliente;
import com.distribuida.model.Pagos;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Rollback(value = false)
public class PagosTestIntegracion {


    @Autowired
    private PagosRepository pagosRepository;


    @Test
    public void testPagosFindAll(){
        List<Pagos> pagos = pagosRepository.findAll();

        assertNotNull(pagos);
        assertTrue(pagos.size() > 0);

        for (Pagos item : pagos){
            System.out.println(item.toString());
        }
    }

    @Test
    public void testPagosFindOne(){
        Optional<Pagos> pagos = pagosRepository.findById(1);
        assertNotNull(pagos.isPresent());
        Assertions.assertEquals("EFECTIVO", pagos.orElse(null).getMetodoPago());
        Assertions.assertEquals(25.50, pagos.orElse(null).getMonto());
        System.out.println(pagos);
    }

    @Test
    public void testPagosSave(){
        Pagos pagos = new Pagos(0,"Cash", 10.10, "12/05/2027");


        Pagos pagoGuardado = pagosRepository.save(pagos);
        assertNotNull(pagoGuardado);
        Assertions.assertEquals("Cash", pagoGuardado.getMetodoPago());
        Assertions.assertEquals(10.10, pagoGuardado.getMonto());
    }

    @Test
    public void testPagosActualizar(){
        Optional<Pagos> pagos3 =pagosRepository.findById(51);

        pagos3.orElse(null).setMetodoPago("cambio");
        pagos3.orElse(null).setMonto(11.15);
        pagos3.orElse(null).setFechaPago("20/04/2028");


        pagosRepository.save(pagos3.orElse(null));
    }

    @Test
    public void testClienteBorrar(){
        pagosRepository.deleteById(51);
    }



}
