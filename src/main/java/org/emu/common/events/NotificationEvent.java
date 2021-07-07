package org.emu.common.events;

import org.emu.common.dto.NotifactionDto;
import org.emu.common.dto.bpm.EVENTSTYPES;
import org.emu.common.status.NotificationStatus;

import java.io.Serializable;

public class NotificationEvent  extends GenericEvent implements Serializable {

	public NotificationEvent(NotifactionDto  notifactionDto) {
		setGenericDto(notifactionDto);
	}

	public NotificationEvent() {
		super();
	}

	public NotificationEvent(NotifactionDto t, NotificationStatus status, String processInstanceId) {
		super(t, status, EVENTSTYPES.NOTIFICATION_EVENT,processInstanceId);
		this.setGenericDto(t);
	}

}
