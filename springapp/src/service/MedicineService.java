package com.pharmacy.service;

import com.pharmacy.model.Medicine;

public interface MedicineService {
    boolean addMedicine(Medicine medicine);

        Medicine updateMedicine(int medicineId, Medicine updatedMedicine);
        }