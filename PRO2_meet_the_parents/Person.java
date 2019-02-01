package m2;

import java.util.ArrayList;
import java.util.Date;

public class Person {
	private String name;
	private Date birthdate;
	private int iq;
	private int respect;
	private ArrayList<String> diplomas;

	public Person() {
		diplomas = new ArrayList<String>();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRespect(int respect) {
		this.respect = respect;
	}
	public int getRespect() {
		return respect;
	}

	public String getName() {
		return this.name;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}

	public int getIq() {
		return iq;
	}

	public void addDiploma(String diploma) {
		diplomas.add(diploma);
	}

	public ArrayList<String> getDiplomas() {
		return diplomas;
	}
}
