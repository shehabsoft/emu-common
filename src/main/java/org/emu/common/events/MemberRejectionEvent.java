package org.emu.common.events;




import org.emu.common.dto.MemberDto;
import org.emu.common.dto.bpm.EVENTSTYPES;
import org.emu.common.status.MemberApprovalStatus;

import java.io.Serializable;

public class MemberRejectionEvent extends GenericEvent implements Serializable {
	public MemberRejectionEvent(){
	}

	public MemberRejectionEvent(MemberDto memberDto, MemberApprovalStatus status, String processInstanceId){
		super(memberDto, status, EVENTSTYPES.MEMBER_REJECTION_EVENT,processInstanceId);

	}

}
