package org.emu.common.dto;

public class MemberApprovalDto implements IDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MemberApprovalDto() {}
	
	private long id ;
	private String firstName;
    private String lastName;
    private boolean approved = false; 
    
	public boolean isApproved() {
		return approved;
	}	
	public void setApproved(boolean approved) {
		this.approved = approved;
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "MemberApprovalDto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", approved="
				+ approved + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberApprovalDto other = (MemberApprovalDto) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
