package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.Doctor;
import com.nit.sbeans.Hospital;
import com.nit.sbeans.Patient;

public class TestHospitalManagement {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	Doctor doctor=ctx.getBean("doc",Doctor.class);
	doctor.setName("Dr. Sharma");
	doctor.setSpecialization("(Cardiologist)");
	Patient patient=ctx.getBean("pat",Patient.class);
	patient.setName("Amit");
	patient.setDisease("(Heart Problem)");
	Hospital hospital=ctx.getBean("hos",Hospital.class);
	hospital.setHospitalname("City Hospital");
	System.out.println(hospital.toString());
	
}
}
