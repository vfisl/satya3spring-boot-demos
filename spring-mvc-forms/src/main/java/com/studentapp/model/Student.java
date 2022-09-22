package com.studentapp.model;

public class Student {
  private String studentName;
  private String city;
  private Integer studentId;
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Integer getStudentId() {
	return studentId;
}
public void setStudentId(Integer studentId) {
	this.studentId = studentId;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", city=" + city + ", studentId=" + studentId + "]";
}
  
}
