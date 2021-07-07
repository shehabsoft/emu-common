package org.emu.common.dto.bpm;

import java.util.Map;
/**
 * Copyright 2021-2022 By Dirac Systems.
 *
 * Created by {@khalid.nouh on 4/4/2021}.
 */
public class BpmEventDto {
    private String processInstanceId;
    private Map<String, Object> variables;
private String eventType;

    @Override
    public String toString() {
        return "BpmEventDto{" +
                "processInstanceId='" + processInstanceId + '\'' +
                ", variables=" + variables +
                ", eventType='" + eventType + '\'' +
                '}';
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
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
}
