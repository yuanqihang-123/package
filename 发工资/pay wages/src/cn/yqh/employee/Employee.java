package cn.yqh.employee;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
private String name;
private double wages;
private SimpleDateFormat birthday;


public Employee(String name, double wages, SimpleDateFormat birthday) {
	super();
	this.name = name;
	this.wages = wages;
	this.birthday = birthday;
}


@Override
public String toString() {
	return "employee [name=" + name + ", wages=" + wages + ", birthday="
			+ birthday + "]";
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getWages() {
	return wages;
}
public void setWages(double wages) {
	this.wages = wages;
}
public SimpleDateFormat getBirthday() {
	return birthday;
}
public void setBirthday(SimpleDateFormat birthday) {
	this.birthday = birthday;
}


}
