package org.emu.common.events;

import org.emu.common.dto.DocumentDto;
import org.emu.common.dto.ValidationDto;
import org.emu.common.dto.bpm.EVENTSTYPES;
import org.emu.common.status.ValidationStatus;

import java.io.Serializable;


public class ValidationEvent extends   GenericEvent  implements Serializable {
	public ValidationEvent() {
	}
	public ValidationEvent(DocumentDto documentDto)
	{

		setGenericDto(documentDto);
	}

	public ValidationEvent(ValidationDto dto, ValidationStatus status, String processInstanceId) {
		super(dto, status,  EVENTSTYPES.VALIDATED_EVENT,processInstanceId);
		this.setGenericDto(dto);
	}
}
