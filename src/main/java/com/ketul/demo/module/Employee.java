package com.ketul.demo.module;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.io.File;

@Entity
public class Employee {


	@Id
	@Column(name = "EID")
	private int eid;

	@Lob
	@Column(name = "EIMAGE")
	private byte[] eimage;

	public Employee() {

	}
	public Employee(int eid, byte[] eimage) {
		this.eid = eid;
		this.eimage = eimage;
	}

	public byte[] getEimage() {
		return eimage;
	}

	public void setEimage(byte[] eimage) {
		this.eimage = eimage;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}
	
	@Override
	public String toString() {
		return "Employee [eimage=" + eimage + ", eid=" + eid + "]";
	}

	
	
}
