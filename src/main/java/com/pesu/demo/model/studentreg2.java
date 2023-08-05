package com.pesu.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "studentreg2")
public class studentreg2 {
	private String sname;
	@Id
	private String srn;
	private Integer sem;
	private String email;
	private String contact;
	private String section;
	private double cgpa;
	private String e1;
	private String e1f1_1;
	private String e1f2_1;
	private String e2;
	private String e2f1_2;
	private String e2f2_2;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSrn() {
		return srn;
	}
	public void setSrn(String srn) {
		this.srn = srn;
	}
	public Integer getSem() {
		return sem;
	}
	public void setSem(Integer sem) {
		this.sem = sem;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public String getE1() {
		return e1;
	}
	public void setE1(String e1) {
		this.e1 = e1;
	}
	public String getE1f1_1() {
		return e1f1_1;
	}
	public void setE1f1_1(String e1f1_1) {
		this.e1f1_1 = e1f1_1;
	}
	public String getE1f2_1() {
		return e1f2_1;
	}
	public void setE1f2_1(String e1f2_1) {
		this.e1f2_1 = e1f2_1;
	}
	public String getE2() {
		return e2;
	}
	public void setE2(String e2) {
		this.e2 = e2;
	}
	public String getE2f1_2() {
		return e2f1_2;
	}
	public void setE2f1_2(String e2f1_2) {
		this.e2f1_2 = e2f1_2;
	}
	public String getE2f2_2() {
		return e2f2_2;
	}
	public void setE2f2_2(String e2f2_2) {
		this.e2f2_2 = e2f2_2;
	}
	@Override
	public String toString() {
		return "studentreg2 [sname=" + sname + ", srn=" + srn + ", sem=" + sem + ", email=" + email + ", contact="
				+ contact + ", section=" + section + ", cgpa=" + cgpa + ", e1=" + e1 + ", e1f1_1=" + e1f1_1
				+ ", e1f2_1=" + e1f2_1 + ", e2=" + e2 + ", e2f1_2=" + e2f1_2 + ", e2f2_2=" + e2f2_2 + "]";
	}
	

}
