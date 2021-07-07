package org.emu.common.events;




import org.emu.common.dto.MemberDto;
import org.emu.common.dto.bpm.EVENTSTYPES;
import org.emu.common.status.MemberApprovalStatus;

import java.io.Serializable;

public class MemberApprovalEvent extends GenericEvent implements Serializable {
	public  MemberApprovalEvent(){
	}

	public MemberApprovalEvent(MemberDto memberDto, MemberApprovalStatus status, String processInstanceId){
		super(memberDto, status,  EVENTSTYPES.MEMBER_APPROVAL_EVENT,processInstanceId);

	}

}
