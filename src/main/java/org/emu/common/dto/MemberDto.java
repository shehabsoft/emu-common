package org.emu.common.dto;
import java.time.Instant;


public class MemberDto implements IDto  {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	public MemberDto() {
	}
	private Long id;

	private String firstName;

	private String lastName;

	private String civilId;

	private String birthDate;

	private String email;

	private String phone;

	private String address1;

	private String address2;

	private String city;

	private String country;

	private MemberStatus memberStatus;

	private Double salary;

	private Gender gender;

	private MembershipStatus membershipStatus;

	private MembershipCategory membershipCategory;

	private MembershipType membershipType;

	private MembershipLevel membershipLevel;

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCivilId() {
		return civilId;
	}

	public void setCivilId(String civilId) {
		this.civilId = civilId;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof MemberDto)) {
			return false;
		}

		return id != null && id.equals(((MemberDto) o).id);
	}

	public MembershipStatus getMembershipStatus() {
		return membershipStatus;
	}

	public void setMembershipStatus(MembershipStatus membershipStatus) {
		this.membershipStatus = membershipStatus;
	}

	public MembershipCategory getMembershipCategory() {
		return membershipCategory;
	}

	public void setMembershipCategory(MembershipCategory membershipCategory) {
		this.membershipCategory = membershipCategory;
	}

	public MembershipType getMembershipType() {
		return membershipType;
	}

	public void setMembershipType(MembershipType membershipType) {
		this.membershipType = membershipType;
	}

	public MembershipLevel getMembershipLevel() {
		return membershipLevel;
	}

	public void setMembershipLevel(MembershipLevel membershipLevel) {
		this.membershipLevel = membershipLevel;
	}

	public MemberStatus getMemberStatus() {
		return memberStatus;
	}

	public void setMemberStatus(MemberStatus memberStatus) {
		this.memberStatus = memberStatus;
	}

	@Override
	public int hashCode() {
		return 31;
	}

	// prettier-ignore
	@Override
	public String toString() {
		return "MemberDTO{" +
				"id=" + getId() +
				", firstName='" + getFirstName() + "'" +
				", lastName='" + getLastName() + "'" +
				", civilId='" + getCivilId() + "'" +
				", birthDate='" + getBirthDate() + "'" +
				", email='" + getEmail() + "'" +
				", phone='" + getPhone() + "'" +
				", address1='" + getAddress1() + "'" +
				", address2='" + getAddress2() + "'" +
				", city='" + getCity() + "'" +
				", country='" + getCountry() + "'" +
				", salary=" + getSalary() +
				", gender='" + getGender() + "'" +
				"}";
	}

	@Override
	public long getId() {
		return id;
	}
}
