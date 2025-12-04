package com.distribuida.dao;

import com.distribuida.model.Productos;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Rollback(value= false)
public class ProductosTestIntegracion {
    @Autowired
    private ProductosRepository productosRepository;

    @Test
    public void testProductosFindAll() {
        List<Productos> productos = productosRepository.findAll();
        assertNotNull(productos);
        assertTrue(productos.size() > 0);
        for (Productos item : productos) {
            System.out.println(item.toString());
        }
    }
}
