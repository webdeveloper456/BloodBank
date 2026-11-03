package com.android.iunoob.bloodbank;

import com.android.iunoob.bloodbank.adapters.BloodRequestAdapter;
import com.android.iunoob.bloodbank.adapters.SearchDonorAdapter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testSearchDonorAdapterColors() {
        assertEquals(0xFFC13F31, SearchDonorAdapter.COLOR_PRIMARY_RED);
        assertEquals(0xFFFFFFFF, SearchDonorAdapter.COLOR_WHITE);
    }

    @Test
    public void testBloodRequestAdapterColors() {
        assertEquals(0xFFC13F31, BloodRequestAdapter.COLOR_PRIMARY_RED);
        assertEquals(0xFFFFFFFF, BloodRequestAdapter.COLOR_WHITE);
    }
}