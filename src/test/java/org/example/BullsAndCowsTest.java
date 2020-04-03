package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class BullsAndCowsTest {

    @Test
    public void getHint() {
        BullsAndCows bullsAndCows = new BullsAndCows();
        String hint = bullsAndCows.getHint("1245", "1150");
        assertEquals("1A1B" , hint);
    }
    @Test
    public void getHint_shouldNotGiveDuplicates() {
        BullsAndCows bullsAndCows = new BullsAndCows();
        String hint = bullsAndCows.getHint("1299", "9508");
        assertEquals("0A1B" , hint);
    }
    @Test
    public void getHint_shouldNotGiveDuplicates2() {
        BullsAndCows bullsAndCows = new BullsAndCows();
        String hint = bullsAndCows.getHint("1123", "0111");
        assertEquals("1A1B" , hint);
    }


}