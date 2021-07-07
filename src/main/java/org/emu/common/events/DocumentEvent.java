package org.emu.common.events;

import org.emu.common.dto.DocumentDto;
import org.emu.common.dto.NotifactionDto;
import org.emu.common.dto.bpm.EVENTSTYPES;
import org.emu.common.status.DocumentStatus;
import org.emu.common.status.NotificationStatus;

import java.io.Serializable;

public class DocumentEvent extends  GenericEvent  implements Serializable {

public DocumentEvent()
    {

    }
    public DocumentEvent(DocumentDto documentDto)
    {

            setGenericDto(documentDto);
    }
    public DocumentEvent(DocumentDto t, DocumentStatus status, String processInstanceId) {
        super(t, status,  EVENTSTYPES.DOCUMENT_EVENT,processInstanceId);
        this.setGenericDto(t);
    }

}
