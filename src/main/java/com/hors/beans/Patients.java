package com.hors.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Patients implements Serializable {
    private int id;
    private String uname;
    private String upass;
    private String name;
    private int sex;
    private String tel;
    private List<Double[]> patientsList = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Double[]> getPatientsList() {
        return patientsList;
    }

    public void setPatientsList(List<Double[]> patientsList) {
        this.patientsList = patientsList;
    }
}
