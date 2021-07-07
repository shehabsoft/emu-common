package org.emu.common.dto;

public class ValidationDto implements IDto {
    private Object genericDto;
    private String simpleClassName;
    @Override
    public long getId() {
        return 0;
    }


    public Object getGenericDto() {
        return genericDto;
    }

    public void setGenericDto(Object genericDto) {
        this.genericDto = genericDto;
    }

    public String getSimpleClassName() {
        return simpleClassName;
    }

    public void setSimpleClassName(String simpleClassName) {
        this.simpleClassName = simpleClassName;
    }
}
