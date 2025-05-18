package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
        Voiture voiture = new Voiture("Porche",15000);
        assertEquals("Porche", voiture.getMarque(), "La voiture doit être une Porche");
        assertEquals(15000, voiture.getPrix(), "La voiture doit couter 15000 euros");
        assertEquals(0, voiture.getId(), "Doit être égal à 0");
    }

}
