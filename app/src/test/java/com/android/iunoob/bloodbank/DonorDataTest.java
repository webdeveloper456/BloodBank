package com.android.iunoob.bloodbank;

import com.android.iunoob.bloodbank.viewmodels.DonorData;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DonorDataTest {

    @Test
    public void testDonorDataGettersAndSetters() {
        DonorData donor = new DonorData(5, "2023-01-01", "John Doe", "1234567890", "123 Street", "uid123");

        assertEquals(5, donor.getTotalDonate());
        assertEquals("2023-01-01", donor.getLastDonate());
        assertEquals("John Doe", donor.getName());
        assertEquals("1234567890", donor.getContact());
        assertEquals("123 Street", donor.getAddress());
        assertEquals("uid123", donor.getUID());
    }
}
