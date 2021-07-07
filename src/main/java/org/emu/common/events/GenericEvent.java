package org.emu.common.events;

import org.emu.common.messages.Message;

import java.io.Serializable;
import java.util.Map;
import java.util.UUID;

public class GenericEvent<T, S> extends Message<T>  implements Serializable{
    private String executionId;
    private S status;
    private String traceId;

    public GenericEvent(Object dto, S status, String eventType,String processInstanceId) {
        genericDto=dto;
        this.status=status;
        this.eventType=eventType;
        this.processInstanceId=processInstanceId;
    }


    public String getExecutionId() {
        return this.executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public final UUID id = UUID.randomUUID();

    private String processInstanceId;
    private Map<String, Object> variables;
    private String messageName;
    private Object genericDto;
    private String eventType;

    public String getMessageName() {
        return messageName;
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }

    public GenericEvent() {

    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public Map<String, Object> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, Object> variables) {
        this.variables = variables;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Object getGenericDto() {
        return genericDto;
    }

    public void setGenericDto(Object genericDto) {
        this.genericDto = genericDto;
    }

    public S getStatus() {
        return status;
    }

    public String getTraceId() {
        return traceId;
    }
}
