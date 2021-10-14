package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemain() {
        int expected = 100;
        int actual = service.remain(900);

        assertEquals(actual,expected);
    }

    @Test
    public void testRemainNull() {
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual,expected);
    }
}