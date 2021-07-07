package org.emu.common.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class Member extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;


    private Long id;

    private String firstName;

    private String lastName;

    private String civilId;

    private Instant birthDate;

    private String email;


    private String phone;


    private String address1;

    private String address2;

    private String city;

    private String country;

    private Double salary;


    private Gender gender;

    private Set<MemberFiles> memberFiles = new HashSet<>();


    private MembershipStatus membershipStatus;

    private MembershipCategory membershipCategory;


    private MembershipType membershipType;


    private MembershipLevel membershipLevel;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Member id(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public Member firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Member lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCivilId() {
        return this.civilId;
    }

    public Member civilId(String civilId) {
        this.civilId = civilId;
        return this;
    }

    public void setCivilId(String civilId) {
        this.civilId = civilId;
    }

    public Instant getBirthDate() {
        return this.birthDate;
    }

    public Member birthDate(Instant birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public void setBirthDate(Instant birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return this.email;
    }

    public Member email(String email) {
        this.email = email;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public Member phone(String phone) {
        this.phone = phone;
        return this;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress1() {
        return this.address1;
    }

    public Member address1(String address1) {
        this.address1 = address1;
        return this;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return this.address2;
    }

    public Member address2(String address2) {
        this.address2 = address2;
        return this;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return this.city;
    }

    public Member city(String city) {
        this.city = city;
        return this;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public Member country(String country) {
        this.country = country;
        return this;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getSalary() {
        return this.salary;
    }

    public Member salary(Double salary) {
        this.salary = salary;
        return this;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Gender getGender() {
        return this.gender;
    }

    public Member gender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Set<MemberFiles> getMemberFiles() {
        return this.memberFiles;
    }

    public Member memberFiles(Set<MemberFiles> memberFiles) {
        this.setMemberFiles(memberFiles);
        return this;
    }

    public Member addMemberFiles(MemberFiles memberFiles) {
        this.memberFiles.add(memberFiles);
        memberFiles.setMember(this);
        return this;
    }

    public Member removeMemberFiles(MemberFiles memberFiles) {
        this.memberFiles.remove(memberFiles);
        memberFiles.setMember(null);
        return this;
    }

    public void setMemberFiles(Set<MemberFiles> memberFiles) {
        if (this.memberFiles != null) {
            this.memberFiles.forEach(i -> i.setMember(null));
        }
        if (memberFiles != null) {
            memberFiles.forEach(i -> i.setMember(this));
        }
        this.memberFiles = memberFiles;
    }

    public MembershipStatus getMembershipStatus() {
        return this.membershipStatus;
    }

    public Member membershipStatus(MembershipStatus membershipStatus) {
        this.setMembershipStatus(membershipStatus);
        return this;
    }

    public void setMembershipStatus(MembershipStatus membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    public MembershipCategory getMembershipCategory() {
        return this.membershipCategory;
    }

    public Member membershipCategory(MembershipCategory membershipCategory) {
        this.setMembershipCategory(membershipCategory);
        return this;
    }

    public void setMembershipCategory(MembershipCategory membershipCategory) {
        this.membershipCategory = membershipCategory;
    }

    public MembershipType getMembershipType() {
        return this.membershipType;
    }

    public Member membershipType(MembershipType membershipType) {
        this.setMembershipType(membershipType);
        return this;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

    public MembershipLevel getMembershipLevel() {
        return this.membershipLevel;
    }

    public Member membershipLevel(MembershipLevel membershipLevel) {
        this.setMembershipLevel(membershipLevel);
        return this;
    }

    public void setMembershipLevel(MembershipLevel membershipLevel) {
        this.membershipLevel = membershipLevel;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Member)) {
            return false;
        }
        return id != null && id.equals(((Member) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Member{" +
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
}
