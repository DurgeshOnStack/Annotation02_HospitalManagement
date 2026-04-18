package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("doc")
public class Doctor {
private String name;
private String specialization;

public void setName(String name) {
	this.name = name;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
@Override
public String toString() {
	return name  + specialization ;
}

}
