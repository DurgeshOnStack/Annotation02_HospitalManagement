package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("pat")
public class Patient {
private String name;
private String disease;

public void setName(String name) {
	this.name = name;
}
public void setDisease(String disease) {
	this.disease = disease;
}
@Override
public String toString() {
	return  name + " Disease=" + disease ;
}

}
