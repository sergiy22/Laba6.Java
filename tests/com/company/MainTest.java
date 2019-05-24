package com.company;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static com.company.Main.*;
import static org.mockito.Mockito.*;

public class MainTest {

    public MainTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void getTypeTest() {
        Phone landlinephone = mock(Phone.class);
        when(landlinephone.getType()).thenReturn("Phone");
        assertEquals("Phone", landlinephone.getType());
    }
    @Test
    public void getModelTest() {
        Phone landlinephone = mock(Phone.class);
        when(landlinephone.getModel()).thenReturn("Samsung S12");
        assertEquals("Samsung S12", landlinephone.getModel());
    }
    @Test
    public void getCoresTest() {
        Phone landlinephone = mock(Phone.class);
        when(landlinephone.getCores()).thenReturn(4);
        assertEquals(4, landlinephone.getCores());
    }
    @Test
    public void getChipsetTest() {
        Phone landlinephone = mock(Phone.class);
        when(landlinephone.getChipset()).thenReturn("Snapdragon 1000");
        assertEquals("Snapdragon 1000", landlinephone.getChipset());
    }
    @Test
    public void getDisplayTest() {
        Phone landlinephone = mock(Phone.class);
        when(perscomp.getRam()).thenReturn(6);
        assertEquals(6, landlinephone.getDisplay());
    }
    @Test
    public void getStorageTest() {
        Phone landlinephone = mock(Phone.class);
        when(landlinephone.getStorage()).thenReturn(64);
        assertEquals(64, landlinephone.getStorage());
    }

    @Test
    public void setModelTest(){
        Phone landlinephone = mock(Phone.class);
        landlinephone.setModel("Samsung");
        landlinephone.setModel("iPhone");
        landlinephone.setModel("iPhone");
        landlinephone.setModel("Xiaomi");
        landlinephone.setModel("Honor");

        verify(landlinephone, times(1)).setModel("Samsung");
        verify(landlinephone, times(2)).setModel("iPhone");
        verify(landlinephone, times(1)).setModel("Xiaomi");
        verify(landlinephone, times(1)).setModel("Honor");

        InOrder inOrder = inOrder(landlinephone);
        inOrder.verify(landlinephone).setModel("Samsung");
        inOrder.verify(landlinephone, times(2)).setModel("iPhone");
        inOrder.verify(landlinephone).setModel("Xiaomi");
        inOrder.verify(landlinephone).setModel("Honor");
    }
}