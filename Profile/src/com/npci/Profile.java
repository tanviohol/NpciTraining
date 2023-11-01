package com.npci;
import java.time.LocalDate;
public class Profile {
	
	private int Pid;
	private String name;
	private String passwprd;
	private LocalDate Dob;
	private long phno;
	
	public Profile(int pid, String name, String passwprd, LocalDate dob, long phno) {
		super();
		Pid = pid;
		this.name = name;
		this.passwprd = passwprd;
		Dob = dob;
		this.phno = phno;
	}

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswprd() {
		return passwprd;
	}

	public void setPasswprd(String passwprd) {
		this.passwprd = passwprd;
	}

	public LocalDate getDob() {
		return Dob;
	}

	public void setDob(LocalDate dob) {
		Dob = dob;
	}

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
	
	

}
