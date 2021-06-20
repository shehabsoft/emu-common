package org.emu.common.events;




import org.emu.common.dto.MemberDto;
import org.emu.common.dto.MemberStatus;
import org.emu.common.dto.bpm.EVENTSTYPES;


import java.io.Serializable;

public class MemberEvent  extends GenericEvent implements Serializable {


	public MemberEvent(MemberDto memberDto) {
		setGenericDto(memberDto);
	}

	public MemberEvent() {
		super();
	}

	public MemberEvent(MemberDto t, MemberStatus status, String processInstanceId) {
		super(t, status,  EVENTSTYPES.MEMBER_EVENT,processInstanceId);
		this.setGenericDto(t);
	}





}
