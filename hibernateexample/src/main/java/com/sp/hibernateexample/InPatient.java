package com.sp.hibernateexample;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="InPatient")
@AttributeOverrides({
	@AttributeOverride(name="patientid",column=@Column(name="patientid")),
	@AttributeOverride(name="patientname",column=@Column(name="patientname"))
})
public class InPatient extends Patient 
{
	@Column(name="perprice")
	private float perprice;
	@Column(name="peramount")
	private double peramount;
	public float getPerprice() {
		return perprice;
	}
	public void setPerprice(float perprice) {
		this.perprice = perprice;
	}
	public double getPeramount() {
		return peramount;
	}
	public void setPeramount(double d) {
		this.peramount = d;
	}

}
