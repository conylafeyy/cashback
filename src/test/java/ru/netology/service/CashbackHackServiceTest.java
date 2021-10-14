package ru.netology.service;

import junit.framework.TestCase;
import org.junit.Test;

public class CashbackHackServiceTest extends TestCase {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemain() {
        int expected = 100;
        int actual = service.remain(900);

        assertEquals(expected, actual);
    }

    @Test
    public void testRemainNull() {
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }
}