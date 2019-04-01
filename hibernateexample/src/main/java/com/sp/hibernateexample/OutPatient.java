package com.sp.hibernateexample;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="OutPatient")
@AttributeOverrides({
	@AttributeOverride(name="patientid",column=@Column(name="patientid")),
	@AttributeOverride(name="patientname",column=@Column(name="patientname"))
})
public class OutPatient extends Patient
{
	@Column(name="price")
	private float price;
	@Column(name="amount")
	private int amount;
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
