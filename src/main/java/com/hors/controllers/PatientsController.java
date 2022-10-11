package com.hors.controllers;

import com.hors.beans.Patients;
import com.hors.services.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/patients")
@CrossOrigin
public class PatientsController {
    @Autowired
    PatientsService patientsService;

    @GetMapping("/getPatients")
    public Map<String,Object> getAll() {
        Map<String, Object> map = new HashMap<>();
        List<Patients> Patientslist = patientsService.getPatients();
        if (Patientslist != null) {  // 成功
            map.put("message", "200");
            map.put("data", Patientslist);
            return map;
        }
        map.put("message", "202");  // 失败
        map.put("data", "no getall");
        return map;   // 返回的map对象会自动转成json数据返回到客户端
    }

    @PostMapping("/insertPatient")
    public Map<String,Object> insertPatients(@RequestBody Patients patients){
        Map<String,Object> map = new HashMap<>();
        int i = patientsService.insertPatient(patients);
        if (i > 0){
            map.put("message","200");
            map.put("data",new Object());
            return map;
        }
        map.put("message","202");
        map.put("data",new Object());
        return map;
    }
}
