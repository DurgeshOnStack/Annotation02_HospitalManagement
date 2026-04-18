package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hos")
public class Hospital {
private String hospitalname;
private Doctor doctor;
private Patient patient;

public void setHospitalname(String hospitalname) {
	this.hospitalname = hospitalname;
}
@Autowired
public void setDoctor(Doctor doctor) {
	this.doctor = doctor;
}
@Autowired
public void setPatient(Patient patient) {
	this.patient = patient;
}
@Override
public String toString() {
	return "Hospital =" + hospitalname + "\nDoctor=" + doctor + "\nPatient= " + patient ;
}

}
