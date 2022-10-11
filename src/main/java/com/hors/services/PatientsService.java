package com.hors.services;

import com.hors.beans.Patients;

import java.util.List;

public interface PatientsService {
    int insertPatient (Patients patients);
    List<Patients> getPatients();
}
