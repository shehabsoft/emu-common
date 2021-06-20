package org.emu.common.dto;

public class NotifactionDto implements IDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NotifactionDto() {}
	
	private long id ;
	private long memberId;
	private String msg ;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getMemberId() {
		return memberId;
	}
	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}
	@Override
	public String toString() {
		return "NotifactionDto [id=" + id + ", memberId=" + memberId + ", msg=" + msg + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (memberId ^ (memberId >>> 32));
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
		NotifactionDto other = (NotifactionDto) obj;
		if (memberId != other.memberId)
			return false;
		return true;
	}

}
