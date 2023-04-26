package com.tcs.rest.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class data {
@Id
@GeneratedValue
private int emp_id;

private String emp_name;
private String emp_city;
public data() {

}
public int getEmp_id() {
	return emp_id;
}
public String getEmp_name() {
	return emp_name;
}
public String getEmp_city() {
	return emp_city;
}
public data(int emp_id, String emp_name, String emp_city) {
	super();
	this.emp_id = emp_id;
	this.emp_name = emp_name;
	this.emp_city = emp_city;
}
@Override
public String toString() {
	return "data [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_city=" + emp_city + "]";
}

}
