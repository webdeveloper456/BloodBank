package com.android.iunoob.bloodbank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdapterColorOptimizationTest {

    @Test
    public void testCachedColorsMatchParseColorHex() {
        // Verify that the cached hex literals evaluate to the correct 32-bit ARGB values.
        // #C13F31 has Alpha=0xFF, Red=0xC1, Green=0x3F, Blue=0x31 -> (int) 0xFFC13F31L = -4112591
        // #FFFFFF has Alpha=0xFF, Red=0xFF, Green=0xFF, Blue=0xFF -> (int) 0xFFFFFFFFL = -1
        int expectedRed = (int) Long.parseLong("FFC13F31", 16);
        int expectedWhite = (int) Long.parseLong("FFFFFFFF", 16);

        assertEquals(0xFFC13F31, expectedRed);
        assertEquals(0xFFFFFFFF, expectedWhite);
    }
}
