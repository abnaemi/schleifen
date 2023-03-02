package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void fakuRechner() {

        //
        int i = 3;
        //
         int actual = Main.fakuRechner(i);
        //
        assertEquals(6, actual);
    }
}