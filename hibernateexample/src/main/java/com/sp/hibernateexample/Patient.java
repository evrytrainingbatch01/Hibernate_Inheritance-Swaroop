package com.sp.hibernateexample;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="patient 100")
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="patient")
public class Patient 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="patientid")
	private int patientid;
	@Column(name="patientname")
	private String patientname;
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

}
