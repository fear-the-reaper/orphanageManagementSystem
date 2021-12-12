package application;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Person {
	
	
	private long cnic;
    private String name;
    private Date dateOfBirth;
    private String gender;
    private String nationality;
    private Address address;

    public Boolean VerifyPerson()
    {
    	Boolean check=true;
    	
		return check;
    	
    }
    Person(Person p)
    {
    	
    }
    
    Person(long id,String name, Date dateOfBirth, String gender, String nationality, Address address) {
    	this.setCnic(id);
        this.setName(name);
        this.setDateOfBirth(dateOfBirth);
        this.setGender(gender);
        this.setNationality(nationality);
        this.setAddress(address);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

	public long getCnic() {
		return cnic;
	}

	public void setCnic(long cnic) {
		this.cnic = cnic;
	}
}
