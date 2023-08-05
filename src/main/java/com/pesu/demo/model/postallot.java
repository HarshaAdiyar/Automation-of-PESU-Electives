package com.pesu.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "postallot")
public class postallot {
	private String s_name;
	@Id
	private String srn;
	private String e1;
	private String e1f1;
	private String e2;
	private String e2f2;
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getSrn() {
		return srn;
	}
	public void setSrn(String srn) {
		this.srn = srn;
	}
	public String getE1() {
		return e1;
	}
	public void setE1(String e1) {
		this.e1 = e1;
	}
	public String getE1f1() {
		return e1f1;
	}
	public void setE1f1(String e1f1) {
		this.e1f1 = e1f1;
	}
	public String getE2() {
		return e2;
	}
	public void setE2(String e2) {
		this.e2 = e2;
	}
	public String getE2f2() {
		return e2f2;
	}
	public void setE2f2(String e2f2) {
		this.e2f2 = e2f2;
	}
	@Override
	public String toString() {
		return "postallot [s_name=" + s_name + ", srn=" + srn + ", e1=" + e1 + ", e1f1=" + e1f1 + ", e2=" + e2
				+ ", e2f2=" + e2f2 + "]";
	}
	
	

}
