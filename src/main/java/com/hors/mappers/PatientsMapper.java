package com.hors.mappers;

import com.hors.beans.Patients;

import java.util.List;

public interface PatientsMapper {
    int insertPatient(Patients patients);
    List<Patients> getPatients();
}
