package com.pesu.demo.model;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "query")
public class query {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String sname;
	private String srn;
	private Integer sem;
	private String email;
	private String yquery;
	@Nullable
	private String answer;
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getYquery() {
		return yquery;
	}
	public void setYquery(String query) {
		this.yquery = query;
	}
	@Override
	public String toString() {
		return "query [sname=" + sname + ", id=" + id + ", srn=" + srn + ", sem=" + sem + ", email=" + email
				+ ", yquery=" + yquery + ", answer=" + answer + "]";
	}
	

}
