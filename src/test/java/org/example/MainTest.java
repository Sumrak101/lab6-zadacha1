package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {


    @After
    public void after(){
        System.out.println("TEST-AFTER");
    }

    @Test
    public void rotated() {
        System.out.println("=========================================");
        int[][] color = Main.matrica();
        int first = color[0][0];

        int[][] rotated = Main.rotated(8,color);
        int second = rotated[0][7];

        assertEquals(first,second);

    }


    @org.junit.Test
    public void rotatedFail() {
        System.out.println("=========================================");
        int[][] color = Main.matrica();
        int first = color[7][7];

        int[][] rotated = Main.rotated(8,color);
        int second = rotated[7][7];

        assertEquals(first,second);

    }
}