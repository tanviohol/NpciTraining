package com.npci;

import java.time.LocalDate;
import java.util.Objects;

public class Profile {
	private int Pid;
	private String name;
	private String passwprd;
	private LocalDate Dob;
	private long phno;
	
	// default constructor 
	public Profile()
	{
		
	}
	//parameterised constructor
	public Profile(int pid, String name, String passwprd, LocalDate dob, long phno) {
		super();
		Pid = pid;
		this.name = name;
		this.passwprd = passwprd;
		Dob = dob;
		this.phno = phno;
	}

	// getter and setter method of ID
	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	
	// getter and setter method of NAME
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	// getter and setter method for PASSWORD
	public String getPasswprd() {
		return passwprd;
	}

	public void setPasswprd(String passwprd) {
		this.passwprd = passwprd;
	}

	
	// getter and setter method for DATEOFBIRTH
	public LocalDate getDob() {
		return Dob;
	}

	public void setDob(LocalDate dob) {
		Dob = dob;
	}

	
	// getter and setter method PHONENO
	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Profile [Pid=" + Pid + ", name=" + name + ", passwprd=" + passwprd + ", Dob=" + Dob + ", phno=" + phno
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Pid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profile other = (Profile) obj;
		return Pid == other.Pid;
	}
	
	
}

