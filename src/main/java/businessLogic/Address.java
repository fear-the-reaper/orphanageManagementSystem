package businessLogic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
    private String country;
    private String city;
	@Id
    private int postalCode;
    private int zipCode;

	public Address() {

	}



	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public Address(String country, String city, int postalCode, int zipCode) {
		this.country = country;
		this.city = city;
		this.postalCode = postalCode;
		this.zipCode = zipCode;
	}

}
