package com.mypackage;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Address {

	@Id
	private int addressid;
	private String line;
	private String city;
	private String state;
	private int zip;
	@ManyToMany(mappedBy="listOfAddress")
	private List<Employee> ListOfEmployees;

	public List<Employee> getListOfEmployees() {
		return ListOfEmployees;
	}

	public void setListOfEmployees(List<Employee> listOfEmployees) {
		ListOfEmployees = listOfEmployees;
	}

	public int getAddressid() {
		return addressid;
	}

	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

}
