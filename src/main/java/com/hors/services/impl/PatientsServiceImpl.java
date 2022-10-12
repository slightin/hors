package com.hors.services.impl;

import com.hors.beans.Patients;
import com.hors.mappers.PatientsMapper;
import com.hors.services.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientsServiceImpl implements PatientsService {
    @Autowired(required = false)
    PatientsMapper patientsMapper;
    @Override
    public List<Patients> getPatients(){
        List<Patients> patientsinfo = patientsMapper.getPatients();
//        for (Patients patients : patientsinfo) {
//
//        }
        return patientsinfo;
    }

    @Override
    public int insertPatient(Patients patients){
        return patientsMapper.insertPatient(patients);
    }
}
