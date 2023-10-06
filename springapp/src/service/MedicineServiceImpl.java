package com.pharmacy.service;

import com.pharmacy.model.Medicine;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MedicineServiceImpl implements MedicineService {
    private final List<Medicine> medicineList = new ArrayList<>();
        private int nextMedicineId = 1;

            @Override
                public boolean addMedicine(Medicine medicine) {
                        medicine.setMedicineId(nextMedicineId++);
                                return medicineList.add(medicine);
                                    }

                                        @Override
                                            public Medicine updateMedicine(int medicineId, Medicine updatedMedicine) {
                                                    for (Medicine medicine : medicineList) {
                                                                if (medicine.getMedicineId() == medicineId) {
                                                                                medicine.setMedicineName(updatedMedicine.getMedicineName());
                                                                                                medicine.setPrice(updatedMedicine.getPrice());
                                                                                                                medicine.setQuantity(updatedMedicine.getQuantity());
                                                                                                                                medicine.setDescription(updatedMedicine.getDescription());
                                                                                                                                                return medicine;
                                                                                                                                                            }
                                                                                                                                                                    }
                                                                                                                                                                            return null; // Medicine not found
                                                                                                                                                                                }
                                                                                                                                                                                }