package com.android.iunoob.bloodbank;

import com.android.iunoob.bloodbank.adapters.BloodRequestAdapter;
import com.android.iunoob.bloodbank.adapters.SearchDonorAdapter;
import com.android.iunoob.bloodbank.viewmodels.CustomUserData;
import com.android.iunoob.bloodbank.viewmodels.DonorData;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AdapterUnitTest {

    @Test
    public void searchDonorAdapter_getItemCount_returnsCorrectCount() {
        List<DonorData> donorList = new ArrayList<>();
        donorList.add(new DonorData(3, "2023-01-01", "John", "123456", "Dhaka", "uid1"));
        donorList.add(new DonorData(5, "2023-02-01", "Jane", "654321", "Sylhet", "uid2"));

        SearchDonorAdapter adapter = new SearchDonorAdapter(donorList);
        assertEquals(2, adapter.getItemCount());
    }

    @Test
    public void bloodRequestAdapter_getItemCount_returnsCorrectCount() {
        List<CustomUserData> requestList = new ArrayList<>();
        requestList.add(new CustomUserData("User1", "O+", "Dhaka", "Dhaka", "123", "2023-01-01", "10:00"));

        BloodRequestAdapter adapter = new BloodRequestAdapter(requestList);
        assertEquals(1, adapter.getItemCount());
    }
}
